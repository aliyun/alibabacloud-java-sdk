// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateStopJobExecutionRequest extends TeaModel {
    /**
     * <p>The name of the Application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the Cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the Job Execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>A list of Task IDs.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<String> taskList;

    public static OperateStopJobExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateStopJobExecutionRequest self = new OperateStopJobExecutionRequest();
        return TeaModel.build(map, self);
    }

    public OperateStopJobExecutionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateStopJobExecutionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateStopJobExecutionRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public OperateStopJobExecutionRequest setTaskList(java.util.List<String> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<String> getTaskList() {
        return this.taskList;
    }

}
