package org.factzoopia.sonarEvents.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.factzoopia.sonarEvents.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByPastTrue();  

    List<Event> findByAvailableTrue(); 

    List<Event> findByDateBefore(Timestamp date);
}
