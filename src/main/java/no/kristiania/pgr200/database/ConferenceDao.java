package no.kristiania.pgr200.database;

import java.util.List;

public interface ConferenceDao {

    void createConferenceTable();

    void insert(Conference conference);

    Conference selectById(int id);

    List<Conference> selectAll();

    void delete(int id);

    void update(Conference conference, int id);


}
