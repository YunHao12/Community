package com.nowcoder.community.entity;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private String topic;  //该事件的消息存放在kafka的哪个主题，Comment、Like、Follow
    private int userId;  //触发事件的用户
    private int entityType;  //事件发生在的实体类型，帖子（回复或点赞）、评论（回复或点赞）、用户（关注）
    private int entityId;  // 事件发生在的实体的id
    private int entityUserId;  //实体作者的id
    private Map<String, Object> data = new HashMap<>();  // 为了方便之后扩展更多业务留的

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
