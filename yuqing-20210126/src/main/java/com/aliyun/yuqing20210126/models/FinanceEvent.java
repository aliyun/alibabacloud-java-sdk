// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class FinanceEvent extends TeaModel {
    @NameInMap("entityArea")
    public String entityArea;

    @NameInMap("entityCrn")
    public String entityCrn;

    @NameInMap("entityId")
    public String entityId;

    @NameInMap("entityName")
    public String entityName;

    @NameInMap("entityRelevanceScore")
    public String entityRelevanceScore;

    @NameInMap("entitySummary")
    public String entitySummary;

    @NameInMap("entityType")
    public String entityType;

    @NameInMap("eventCode")
    public Long eventCode;

    @NameInMap("eventId")
    public String eventId;

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
