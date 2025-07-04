// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionThreadDumpRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxl-job-executor-sample</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://192.168.0.215:9966/">http://192.168.0.215:9966/</a></p>
     */
    @NameInMap("ExecutorAddr")
    public String executorAddr;

    /**
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    public static GetJobExecutionThreadDumpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionThreadDumpRequest self = new GetJobExecutionThreadDumpRequest();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionThreadDumpRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetJobExecutionThreadDumpRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetJobExecutionThreadDumpRequest setExecutorAddr(String executorAddr) {
        this.executorAddr = executorAddr;
        return this;
    }
    public String getExecutorAddr() {
        return this.executorAddr;
    }

    public GetJobExecutionThreadDumpRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

}
