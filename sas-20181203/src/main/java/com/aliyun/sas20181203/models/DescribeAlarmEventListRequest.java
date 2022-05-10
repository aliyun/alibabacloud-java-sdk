// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListRequest extends TeaModel {
    @NameInMap("AlarmEventName")
    public String alarmEventName;

    @NameInMap("AlarmEventType")
    public String alarmEventType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("From")
    public String from;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Levels")
    public String levels;

    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TacticId")
    public String tacticId;

    public static DescribeAlarmEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventListRequest self = new DescribeAlarmEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventListRequest setAlarmEventName(String alarmEventName) {
        this.alarmEventName = alarmEventName;
        return this;
    }
    public String getAlarmEventName() {
        return this.alarmEventName;
    }

    public DescribeAlarmEventListRequest setAlarmEventType(String alarmEventType) {
        this.alarmEventType = alarmEventType;
        return this;
    }
    public String getAlarmEventType() {
        return this.alarmEventType;
    }

    public DescribeAlarmEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlarmEventListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeAlarmEventListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAlarmEventListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlarmEventListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeAlarmEventListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAlarmEventListRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeAlarmEventListRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
        this.operateErrorCodeList = operateErrorCodeList;
        return this;
    }
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    public DescribeAlarmEventListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmEventListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeAlarmEventListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAlarmEventListRequest setTacticId(String tacticId) {
        this.tacticId = tacticId;
        return this;
    }
    public String getTacticId() {
        return this.tacticId;
    }

}
