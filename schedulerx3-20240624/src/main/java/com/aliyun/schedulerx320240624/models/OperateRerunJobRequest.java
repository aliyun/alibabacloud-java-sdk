// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRerunJobRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The unique identifier of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The specific time of day for which to rerun the data. The format is <code>HH:mm:ss</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14:11:10</p>
     */
    @NameInMap("DataTime")
    public String dataTime;

    /**
     * <p>The end of the time range to rerun, specified as a Unix timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698458024000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The unique identifier of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The start of the time range to rerun, specified as a Unix timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698458024000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static OperateRerunJobRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRerunJobRequest self = new OperateRerunJobRequest();
        return TeaModel.build(map, self);
    }

    public OperateRerunJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateRerunJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateRerunJobRequest setDataTime(String dataTime) {
        this.dataTime = dataTime;
        return this;
    }
    public String getDataTime() {
        return this.dataTime;
    }

    public OperateRerunJobRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public OperateRerunJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public OperateRerunJobRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
