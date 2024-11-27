// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateExecuteJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>name=zhangsan</p>
     */
    @NameInMap("InstanceParameters")
    public String instanceParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p><a href="http://192.168.1.5:9999/">http://192.168.1.5:9999/</a></p>
     */
    @NameInMap("Worker")
    public String worker;

    public static OperateExecuteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateExecuteJobRequest self = new OperateExecuteJobRequest();
        return TeaModel.build(map, self);
    }

    public OperateExecuteJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateExecuteJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateExecuteJobRequest setInstanceParameters(String instanceParameters) {
        this.instanceParameters = instanceParameters;
        return this;
    }
    public String getInstanceParameters() {
        return this.instanceParameters;
    }

    public OperateExecuteJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public OperateExecuteJobRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public OperateExecuteJobRequest setWorker(String worker) {
        this.worker = worker;
        return this;
    }
    public String getWorker() {
        return this.worker;
    }

}
