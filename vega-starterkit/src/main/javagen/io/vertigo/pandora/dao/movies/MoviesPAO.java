package io.vertigo.pandora.dao.movies;

import javax.inject.Inject;

import io.vertigo.core.node.Home;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class MoviesPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public MoviesPAO(final TaskManager taskManager) {
		Assertion.checkNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
	}

	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Home.getApp().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache StTkLoadMovieIndex.
	 * @param movieIds List de Long
	 * @return DtList de MovieIndex dtcIndex
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadMovieIndex",
			request = "select MOV_ID," + 
 "						 TITLE," + 
 "						 TITLE as TITLE_SORT_ONLY," + 
 "						 YEAR as PRODUCTION_YEAR," + 
 "						 'Film' as MOVIE_TYPE," + 
 "						 POSTER," + 
 "						 TAGS as KEYWORDS," + 
 "						 TITLE as ORIGINAL_TITLE," + 
 "						 RUNTIME," + 
 "						 DESCRIPTION as SHORT_SYNOPSIS," + 
 "						 DESCRIPTION as SYNOPSIS," + 
 "						 RATED as USER_RATING" + 
 "				from MOVIE mov" + 
 "				where MOV_ID in (#movieIds.rownum#);",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(domain = "STyDtMovieIndex")
	public io.vertigo.datamodel.structure.model.DtList<lollipop.domain.movies.MovieIndex> loadMovieIndex(@io.vertigo.datamodel.task.proxy.TaskInput(name = "movieIds", domain = "STyId") final java.util.List<Long> movieIds) {
		final Task task = createTaskBuilder("TkLoadMovieIndex")
				.addValue("movieIds", movieIds)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
