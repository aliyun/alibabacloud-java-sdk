// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class FinanceEvent extends TeaModel {
    // 实体地理位置
    @NameInMap("entityArea")
    public String entityArea;

    // 实体唯一id，统一社会信用代码
    @NameInMap("entityCrn")
    public String entityCrn;

    // 实体ID
    @NameInMap("entityId")
    public String entityId;

    // 实体名称
    @NameInMap("entityName")
    public String entityName;

    // 实体相关度得分
    @NameInMap("entityRelevanceScore")
    public String entityRelevanceScore;

    // 实体的事件摘要描述
    @NameInMap("entitySummary")
    public String entitySummary;

    // 实体类型，枚举值
    @NameInMap("entityType")
    public String entityType;

    // 事件码
    @NameInMap("eventCode")
    public Long eventCode;

    // 事件id
    @NameInMap("eventId")
    public String eventId;

    // 事件名称
    @NameInMap("eventName")
    public String eventName;

    public static FinanceEvent build(java.util.Map<String, ?> map) throws Exception {
        FinanceEvent self = new FinanceEvent();
        return TeaModel.build(map, self);
    }

    public FinanceEvent setEntityArea(String entityArea) {
        this.entityArea = entityArea;
        return this;
    }
    public String getEntityArea() {
        return this.entityArea;
    }

    public FinanceEvent setEntityCrn(String entityCrn) {
        this.entityCrn = entityCrn;
        return this;
    }
    public String getEntityCrn() {
        return this.entityCrn;
    }

    public FinanceEvent setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public FinanceEvent setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public FinanceEvent setEntityRelevanceScore(String entityRelevanceScore) {
        this.entityRelevanceScore = entityRelevanceScore;
        return this;
    }
    public String getEntityRelevanceScore() {
        return this.entityRelevanceScore;
    }

    public FinanceEvent setEntitySummary(String entitySummary) {
        this.entitySummary = entitySummary;
        return this;
    }
    public String getEntitySummary() {
        return this.entitySummary;
    }

    public FinanceEvent setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public FinanceEvent setEventCode(Long eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public Long getEventCode() {
        return this.eventCode;
    }

    public FinanceEvent setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public FinanceEvent setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

}
