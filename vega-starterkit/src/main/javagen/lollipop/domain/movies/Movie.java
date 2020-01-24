package lollipop.domain.movies;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.KeyConcept;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.datamodel.smarttype.annotations.Mapper(clazz = io.vertigo.datamodel.structure.util.JsonMapper.class, dataType = io.vertigo.datamodel.structure.metamodel.DataType.String)
public final class Movie implements KeyConcept {
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String title;
	private java.time.LocalDate released;
	private Integer year;
	private Integer runtime;
	private String description;
	private String poster;
	private String rated;
	private java.time.Instant lastModified;

	/** {@inheritDoc} */
	@Override
	public UID<Movie> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'MOV_ID'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "STyId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "MOV_ID")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'MOV_ID'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'TITLE'.
	 * @return String title
	 */
	@Field(domain = "STyLabelLong", label = "TITLE")
	public String getTitle() {
		return title;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'TITLE'.
	 * @param title String
	 */
	public void setTitle(final String title) {
		this.title = title;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Released'.
	 * @return LocalDate released
	 */
	@Field(domain = "STyDate", label = "Released")
	public java.time.LocalDate getReleased() {
		return released;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Released'.
	 * @param released LocalDate
	 */
	public void setReleased(final java.time.LocalDate released) {
		this.released = released;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Year'.
	 * @return Integer year
	 */
	@Field(domain = "STyYear", label = "Year")
	public Integer getYear() {
		return year;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Year'.
	 * @param year Integer
	 */
	public void setYear(final Integer year) {
		this.year = year;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Runtime'.
	 * @return Integer runtime
	 */
	@Field(domain = "STyDuration", label = "Runtime")
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Runtime'.
	 * @param runtime Integer
	 */
	public void setRuntime(final Integer runtime) {
		this.runtime = runtime;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Description'.
	 * @return String description
	 */
	@Field(domain = "STyComment", label = "Description")
	public String getDescription() {
		return description;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Description'.
	 * @param description String
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Poster'.
	 * @return String poster
	 */
	@Field(domain = "STyLabelLong", label = "Poster")
	public String getPoster() {
		return poster;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Poster'.
	 * @param poster String
	 */
	public void setPoster(final String poster) {
		this.poster = poster;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'rated'.
	 * @return String rated
	 */
	@Field(domain = "STyLabelLong", label = "rated")
	public String getRated() {
		return rated;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'rated'.
	 * @param rated String
	 */
	public void setRated(final String rated) {
		this.rated = rated;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'lastModified'.
	 * @return Instant lastModified
	 */
	@Field(domain = "STyLastModified", label = "lastModified")
	public java.time.Instant getLastModified() {
		return lastModified;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'lastModified'.
	 * @param lastModified Instant
	 */
	public void setLastModified(final java.time.Instant lastModified) {
		this.lastModified = lastModified;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
