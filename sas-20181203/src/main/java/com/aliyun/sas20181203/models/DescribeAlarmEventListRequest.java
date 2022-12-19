// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListRequest extends TeaModel {
    // The name of the alert event.
    // 
    // >  You can call the [DescribeNsasSuspEventType](~~DescribeNsasSuspEventType~~) operation to query the names of alert events.
    @NameInMap("AlarmEventName")
    public String alarmEventName;

    // The type of the alert event.
    // 
    // >  You can call the [DescribeNsasSuspEventType](~~DescribeNsasSuspEventType~~) operation to query the types of alert events.
    @NameInMap("AlarmEventType")
    public String alarmEventType;

    // The number of the page to return. Pages start from page **1**. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the alert event is handled. Valid values:
    // 
    // *   **N**: unhandled
    // *   **Y**: handled
    @NameInMap("Dealed")
    public String dealed;

    // The ID of the request source. Set the value to **sas**, which indicates that the request is sent from Security Center.
    @NameInMap("From")
    public String from;

    // The ID of the asset group to which the affected asset belongs.
    @NameInMap("GroupId")
    public String groupId;

    // The ID of the alert event.
    @NameInMap("Id")
    public Long id;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The severity of the alert event. Separate multiple severities with commas (,). Valid values:
    // 
    // *   **serious**
    // *   **suspicious**
    // *   **remind**
    @NameInMap("Levels")
    public String levels;

    // An array that consists of the handling result codes of alert events.
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    // The time when the handling operation ends.
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    // The time when the handing operation starts.
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public String pageSize;

    // The name of the alert or the information about the asset.
    @NameInMap("Remark")
    public String remark;

    // The custom sorting field. Default value: **operateTime**. Valid values:
    // 
    // *   **lastTime**: the latest occurrence time
    // *   **operateTime**: the handling time
    // 
    // >  This parameter takes effect if you set the **Dealed** parameter to Y.
    @NameInMap("SortColumn")
    public String sortColumn;

    // The custom sorting order. Default value: **desc**. Valid values:
    // 
    // *   **asc**: the ascending order
    // *   **desc**: the descending order
    // 
    // >  This parameter takes effect if you set the **Dealed** parameter to Y.
    @NameInMap("SortType")
    public String sortType;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The tactic ID of ATT\&CK.
    @NameInMap("TacticId")
    public String tacticId;

    // The end time when the alert event was last detected.
    @NameInMap("TimeEnd")
    public String timeEnd;

    // The start time when the alert event was last detected.
    @NameInMap("TimeStart")
    public String timeStart;

    // The ID of the alert event.
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    // The UUIDs of the assets. Separate multiple UUIDs with commas (,).
    @NameInMap("Uuids")
    public String uuids;

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

    public DescribeAlarmEventListRequest setOperateTimeEnd(String operateTimeEnd) {
        this.operateTimeEnd = operateTimeEnd;
        return this;
    }
    public String getOperateTimeEnd() {
        return this.operateTimeEnd;
    }

    public DescribeAlarmEventListRequest setOperateTimeStart(String operateTimeStart) {
        this.operateTimeStart = operateTimeStart;
        return this;
    }
    public String getOperateTimeStart() {
        return this.operateTimeStart;
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

    public DescribeAlarmEventListRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeAlarmEventListRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
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

    public DescribeAlarmEventListRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeAlarmEventListRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

    public DescribeAlarmEventListRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeAlarmEventListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
