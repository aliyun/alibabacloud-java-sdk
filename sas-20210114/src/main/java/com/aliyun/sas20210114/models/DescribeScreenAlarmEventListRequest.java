// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenAlarmEventListRequest extends TeaModel {
    @NameInMap("AlarmEventName")
    public String alarmEventName;

    @NameInMap("AlarmEventType")
    public String alarmEventType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>222.185.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>1683862286000</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <strong>example:</strong>
     * <p>1687104000000</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    public static DescribeScreenAlarmEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenAlarmEventListRequest self = new DescribeScreenAlarmEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenAlarmEventListRequest setAlarmEventName(String alarmEventName) {
        this.alarmEventName = alarmEventName;
        return this;
    }
    public String getAlarmEventName() {
        return this.alarmEventName;
    }

    public DescribeScreenAlarmEventListRequest setAlarmEventType(String alarmEventType) {
        this.alarmEventType = alarmEventType;
        return this;
    }
    public String getAlarmEventType() {
        return this.alarmEventType;
    }

    public DescribeScreenAlarmEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeScreenAlarmEventListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeScreenAlarmEventListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeScreenAlarmEventListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScreenAlarmEventListRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeScreenAlarmEventListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeScreenAlarmEventListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeScreenAlarmEventListRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeScreenAlarmEventListRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

}
