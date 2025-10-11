// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCronJobPolicyServerlessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ModifyDBClusterServerlessConf</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <strong>example:</strong>
     * <p>0 0 8 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2021-04-07T04:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1fa3c0e7-b568-4f41-b703-463c96a91bd8</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>45D24263-7E3A-4140-9472-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2020-05-01T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>working</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateCronJobPolicyServerlessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCronJobPolicyServerlessResponseBody self = new CreateCronJobPolicyServerlessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCronJobPolicyServerlessResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateCronJobPolicyServerlessResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateCronJobPolicyServerlessResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateCronJobPolicyServerlessResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCronJobPolicyServerlessResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateCronJobPolicyServerlessResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCronJobPolicyServerlessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCronJobPolicyServerlessResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCronJobPolicyServerlessResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
