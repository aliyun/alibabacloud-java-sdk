// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAlarmEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>webhook</p>
     */
    @NameInMap("AlarmChannel")
    public String alarmChannel;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    /**
     * <strong>example:</strong>
     * <p>schedulerx3_fail_alarm</p>
     */
    @NameInMap("AlarmType")
    public String alarmType;

    /**
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1731636011558</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <strong>example:</strong>
     * <p>1690419316000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlarmEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmEventRequest self = new ListAlarmEventRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmEventRequest setAlarmChannel(String alarmChannel) {
        this.alarmChannel = alarmChannel;
        return this;
    }
    public String getAlarmChannel() {
        return this.alarmChannel;
    }

    public ListAlarmEventRequest setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public ListAlarmEventRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public ListAlarmEventRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAlarmEventRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAlarmEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlarmEventRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListAlarmEventRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListAlarmEventRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAlarmEventRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListAlarmEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
