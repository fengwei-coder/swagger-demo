package com.example.demo.rep;

//import com.example.demo.kv.Node;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
//import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
//
//import java.util.List;
//
///**
// * @DateTime: 2020/5/28 - 11:07
// * @Description:
// */
//public class CustomMongoRepositoryImpl<T extends Node>
//        extends SimpleMongoRepository<T, Long> implements CustomMongoRepository<T> {
//
//    CustomMongoRepositoryImpl(
//            MongoEntityInformation<T, Long> entityInformation,
//            MongoOperations mongoOperations) {
//
//        super(entityInformation, mongoOperations);
//    }
//
//    @Override
//    public <S extends T> S insert(S entity) {
//        //generateId(entity);
//        return super.insert(entity);
//    }
//
////    @Override
////    public <S extends T> List<S> insert(Iterable<S> entities) { ... }
////
////    @Override
////    public <S extends T> S save(S entity) { ... }
////
////    @Override
////    public <S extends T> List<S> save(Iterable<S> entities) { ... }
////
////    protected <S extends T> void generateId(S entity) { ... }
//
//}
