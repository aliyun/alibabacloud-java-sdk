// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AlarmQueryCondition extends TeaModel {
    // 规则id列表
    @NameInMap("alarmRuleId")
    public java.util.List<Long> alarmRuleId;

    // 舆情消息id列表
    @NameInMap("docIds")
    public java.util.List<Long> docIds;

    // 查询数据的消息类型
    @NameInMap("docMediaType")
    public java.util.List<String> docMediaType;

    // 查询结束时间,毫秒
    @NameInMap("endTime")
    public Long endTime;

    // 预警id列表
    @NameInMap("ids")
    public java.util.List<Long> ids;

    // 是否使用更新时间作为筛选
    @NameInMap("isQueryUpdateTime")
    public Boolean isQueryUpdateTime;

    // 预警等级过滤列表
    @NameInMap("levels")
    public java.util.List<String> levels;

    // 当前页
    @NameInMap("pageNow")
    public Long pageNow;

    // 分页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 舆情项目id
    @NameInMap("projecIds")
    public java.util.List<Long> projecIds;

    // 查询开始时间,毫秒
    @NameInMap("startTime")
    public Long startTime;

    // 预警状态列表
    @NameInMap("status")
    public java.util.List<String> status;

    // 标签id列表
    @NameInMap("tagIds")
    public java.util.List<Long> tagIds;

    // 预警规则类型
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
