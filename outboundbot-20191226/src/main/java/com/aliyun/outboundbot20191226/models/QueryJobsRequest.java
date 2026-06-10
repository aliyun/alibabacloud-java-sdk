// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsRequest extends TeaModel {
    /**
     * <p>Filter condition. Contact name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>Filter condition. End time. Default value is 0, which means up to now.</p>
     * 
     * <strong>example:</strong>
     * <p>1579077794665</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Task group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>994b8baf-7ef8-480c-b141-b7b6db77c4df</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>Page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter condition. Contact phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>135****8888</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Scenario ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>Filter condition. Start time. Default value is 0, which means from 00:00 today.</p>
     * 
     * <strong>example:</strong>
     * <p>1579068424883</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Time filter basis. Valid values: start, end, and job_create.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("TimeAlignment")
    public String timeAlignment;

    public static QueryJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsRequest self = new QueryJobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobsRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public QueryJobsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public QueryJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryJobsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public QueryJobsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryJobsRequest setTimeAlignment(String timeAlignment) {
        this.timeAlignment = timeAlignment;
        return this;
    }
    public String getTimeAlignment() {
        return this.timeAlignment;
    }

}
