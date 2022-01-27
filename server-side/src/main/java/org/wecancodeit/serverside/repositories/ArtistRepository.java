package org.wecancodeit.serverside.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.serverside.models.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
