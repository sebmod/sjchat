package sjchat.daos;

import sjchat.entities.ChatEntity;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by jovi on 2017-05-09.
 */
public class ChatDaoImpl extends DaoImpl implements ChatDao{
    public ChatEntity find(String id){
        return super.find(ChatEntity.class, id);
    }

    public List<ChatEntity> findAll(){
        Query q = em.createQuery("select c from ChatEntity c", ChatEntity.class);
        return q.getResultList();
    }

}
