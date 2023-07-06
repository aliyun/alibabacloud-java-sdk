// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AlarmQueryCondition extends TeaModel {
    @NameInMap("alarmRuleId")
    public java.util.List<Long> alarmRuleId;

    @NameInMap("docIds")
    public java.util.List<Long> docIds;

    @NameInMap("docMediaType")
    public java.util.List<String> docMediaType;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("ids")
    public java.util.List<Long> ids;

    @NameInMap("isQueryUpdateTime")
    public Boolean isQueryUpdateTime;

    @NameInMap("levels")
    public java.util.List<String> levels;

    @NameInMap("pageNow")
    public Long pageNow;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projecIds")
    public java.util.List<Long> projecIds;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("status")
    public java.util.List<String> status;

    @NameInMap("tagIds")
    public java.util.List<Long> tagIds;

    @NameInMap("type")
    public String type;

    public static AlarmQueryCondition build(java.util.Map<String, ?> map) throws Exception {
        AlarmQueryCondition self = new AlarmQueryCondition();
        return TeaModel.build(map, self);
    }

    public AlarmQueryCondition setAlarmRuleId(java.util.List<Long> alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public java.util.List<Long> getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public AlarmQueryCondition setDocIds(java.util.List<Long> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<Long> getDocIds() {
        return this.docIds;
    }

    public AlarmQueryCondition setDocMediaType(java.util.List<String> docMediaType) {
        this.docMediaType = docMediaType;
        return this;
    }
    public java.util.List<String> getDocMediaType() {
        return this.docMediaType;
    }

    public AlarmQueryCondition setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AlarmQueryCondition setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public AlarmQueryCondition setIsQueryUpdateTime(Boolean isQueryUpdateTime) {
        this.isQueryUpdateTime = isQueryUpdateTime;
        return this;
    }
    public Boolean getIsQueryUpdateTime() {
        return this.isQueryUpdateTime;
    }

    public AlarmQueryCondition setLevels(java.util.List<String> levels) {
        this.levels = levels;
        return this;
    }
    public java.util.List<String> getLevels() {
        return this.levels;
    }

    public AlarmQueryCondition setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public AlarmQueryCondition setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AlarmQueryCondition setProjecIds(java.util.List<Long> projecIds) {
        this.projecIds = projecIds;
        return this;
    }
    public java.util.List<Long> getProjecIds() {
        return this.projecIds;
    }

    public AlarmQueryCondition setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public AlarmQueryCondition setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public AlarmQueryCondition setTagIds(java.util.List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

    public AlarmQueryCondition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
