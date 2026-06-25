// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAlarmEventRequest extends TeaModel {
    /**
     * <p>The channel for sending alarm notifications. Valid values:</p>
     * <ul>
     * <li><p><code>sms</code>: SMS</p>
     * </li>
     * <li><p><code>mail</code>: Email</p>
     * </li>
     * <li><p><code>phone</code>: Phone call</p>
     * </li>
     * <li><p><code>webhook</code>: Webhook</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>webhook</p>
     */
    @NameInMap("AlarmChannel")
    public String alarmChannel;

    /**
     * <p>The delivery status of the alarm notification. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The notification delivery succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The notification delivery failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    /**
     * <p>The type of the alarm. Valid values:</p>
     * <ul>
     * <li><p><strong><code>schedulerx3_no_designate_machine_alarm</code></strong>: The Designated Machine is unavailable.</p>
     * </li>
     * <li><p><strong><code>schedulerx3_all_busy_alarm</code></strong>: All available machines are busy.</p>
     * </li>
     * <li><p><strong><code>schedulerx3_no_machine_alarm</code></strong>: No machines are available to run the job.</p>
     * </li>
     * <li><p><strong><code>schedulerx3_timeout_alarm</code></strong>: The job timed out.</p>
     * </li>
     * <li><p><strong><code>schedulerx3_fail_alarm</code></strong>: The job failed to run.</p>
     * </li>
     * <li><p><strong><code>schedulerx3_job_success_notice</code></strong>: The job ran successfully.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>schedulerx3_fail_alarm</p>
     */
    @NameInMap("AlarmType")
    public String alarmType;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range for querying events. This value is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1731636011558</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Set to true to return results in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The start of the time range for querying events. This value is a Unix timestamp in milliseconds.</p>
     * 
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
