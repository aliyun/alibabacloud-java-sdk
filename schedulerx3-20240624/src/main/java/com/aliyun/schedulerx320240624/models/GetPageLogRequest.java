// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetPageLogRequest extends TeaModel {
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
     * <p>1777292662000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <strong>example:</strong>
     * <p>job01</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <strong>example:</strong>
     * <p>hello word</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <strong>example:</strong>
     * <p>1777292662000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("WorkerAddr")
    public String workerAddr;

    public static GetPageLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageLogRequest self = new GetPageLogRequest();
        return TeaModel.build(map, self);
    }

    public GetPageLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetPageLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPageLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPageLogRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public GetPageLogRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public GetPageLogRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetPageLogRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetPageLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPageLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetPageLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetPageLogRequest setWorkerAddr(String workerAddr) {
        this.workerAddr = workerAddr;
        return this;
    }
    public String getWorkerAddr() {
        return this.workerAddr;
    }

}
