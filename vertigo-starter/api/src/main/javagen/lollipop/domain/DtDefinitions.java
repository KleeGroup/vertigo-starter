package lollipop.domain;

import java.util.Arrays;
import java.util.Iterator;
import io.vertigo.dynamo.domain.metamodel.DtFieldName;

/**
 * Attention cette classe est générée automatiquement !
 */
public final class DtDefinitions implements Iterable<Class<?>> {
	
	/**
	 * Enumération des DtDefinitions.
	 */
	public enum Definitions {
			/** Objet de données ApplicationUser. */
			ApplicationUser(lollipop.domain.users.ApplicationUser.class),
			/** Objet de données Casting. */
			Casting(lollipop.domain.people.Casting.class),
			/** Objet de données Dummy. */
			Dummy(lollipop.domain.search.Dummy.class),
			/** Objet de données Movie. */
			Movie(lollipop.domain.movies.Movie.class),
			/** Objet de données People. */
			People(lollipop.domain.people.People.class),
			/** Objet de données Profil. */
			Profil(lollipop.domain.users.Profil.class),
			/** Objet de données SecurityRole. */
			SecurityRole(lollipop.domain.users.SecurityRole.class),
			/** Objet de données UserAuthentification. */
			UserAuthentification(lollipop.domain.users.UserAuthentification.class),
		;
		
		private final Class<?> clazz;
		private Definitions(final Class<?> clazz) {
			this.clazz = clazz;
		}
		
		/** 
		  * Classe associée.
		  * @return Class d'implémentation de l'objet 
		  */
		public Class<?> getDtClass() {
			return clazz;
		}
    }

	/**
	 * Enumération des champs de ApplicationUser.
	 */
	public enum ApplicationUserFields implements DtFieldName {
		/** Propriété 'USR_ID'. */
		USR_ID,
		/** Propriété 'Last Name'. */
		LAST_NAME,
		/** Propriété 'First Name'. */
		FIRST_NAME,
		/** Propriété 'email'. */
		EMAIL,
		/** Propriété 'Profil'. */
		PRO_ID,
	}

	/**
	 * Enumération des champs de Casting.
	 */
	public enum CastingFields implements DtFieldName {
		/** Propriété 'Cast_id'. */
		CAST_ID,
		/** Propriété 'Character name'. */
		CHARACTER_NAME,
		/** Propriété 'People'. */
		PEO_ID,
		/** Propriété 'Movie'. */
		MOV_ID,
	}

	/**
	 * Enumération des champs de Dummy.
	 */
	public enum DummyFields implements DtFieldName {
		/** Propriété 'Id'. */
		DUMMY_LONG,
	}

	/**
	 * Enumération des champs de Movie.
	 */
	public enum MovieFields implements DtFieldName {
		/** Propriété 'MOV_ID'. */
		MOV_ID,
		/** Propriété 'TITLE'. */
		TITLE,
		/** Propriété 'Released'. */
		RELEASED,
		/** Propriété 'Year'. */
		YEAR,
		/** Propriété 'Runtime'. */
		RUNTIME,
		/** Propriété 'Description'. */
		DESCRIPTION,
		/** Propriété 'Poster'. */
		POSTER,
		/** Propriété 'rated'. */
		RATED,
	}

	/**
	 * Enumération des champs de People.
	 */
	public enum PeopleFields implements DtFieldName {
		/** Propriété 'PEO_ID'. */
		PEO_ID,
		/** Propriété 'Last Name'. */
		LAST_NAME,
		/** Propriété 'First Name'. */
		FIRST_NAME,
		/** Propriété 'Peo Name'. */
		PEO_NAME,
		/** Propriété 'imdbID'. */
		IMDBID,
	}

	/**
	 * Enumération des champs de Profil.
	 */
	public enum ProfilFields implements DtFieldName {
		/** Propriété 'PRO_ID'. */
		PRO_ID,
		/** Propriété 'Label'. */
		LABEL,
	}

	/**
	 * Enumération des champs de SecurityRole.
	 */
	public enum SecurityRoleFields implements DtFieldName {
		/** Propriété 'SRO_CD'. */
		SRO_CD,
		/** Propriété 'Label'. */
		LABEL,
	}

	/**
	 * Enumération des champs de UserAuthentification.
	 */
	public enum UserAuthentificationFields implements DtFieldName {
		/** Propriété 'AUTH_ID'. */
		AUTH_ID,
		/** Propriété 'Login'. */
		LOGIN,
		/** Propriété 'Password'. */
		PASSWORD,
		/** Propriété 'Application user'. */
		USR_ID,
	}

	    
    /** {@inheritDoc} */
    @Override
    public Iterator<Class<?>> iterator() {
        return new Iterator<Class<?>>() {
            private Iterator<Definitions> it = Arrays.asList(Definitions.values()).iterator();

            /** {@inheritDoc} */
            @Override
            public boolean hasNext() {
				return it.hasNext();
            }

            /** {@inheritDoc} */
            @Override
            public Class<?> next() {
            	return it.next().getDtClass();
            }

            /** {@inheritDoc} */
            @Override
            public void remove() {
            	//unsupported
            }
        };
    }                      
}