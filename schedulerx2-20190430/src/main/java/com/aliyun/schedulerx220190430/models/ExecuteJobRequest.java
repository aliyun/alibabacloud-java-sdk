// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobRequest extends TeaModel {
    @NameInMap("CheckJobStatus")
    public Boolean checkJobStatus;

    // 指定机器类型：1.workerAddr; 2. label
    @NameInMap("DesignateType")
    public Integer designateType;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceParameters")
    public String instanceParameters;

    @NameInMap("JobId")
    public Long jobId;

    // 指定机器的标签
    @NameInMap("Label")
    public String label;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    // 指定机器的workerAddr
    @NameInMap("Worker")
    public String worker;

    public static ExecuteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteJobRequest self = new ExecuteJobRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteJobRequest setCheckJobStatus(Boolean checkJobStatus) {
        this.checkJobStatus = checkJobStatus;
        return this;
    }
    public Boolean getCheckJobStatus() {
        return this.checkJobStatus;
    }

    public ExecuteJobRequest setDesignateType(Integer designateType) {
        this.designateType = designateType;
        return this;
    }
    public Integer getDesignateType() {
        return this.designateType;
    }

    public ExecuteJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExecuteJobRequest setInstanceParameters(String instanceParameters) {
        this.instanceParameters = instanceParameters;
        return this;
    }
    public String getInstanceParameters() {
        return this.instanceParameters;
    }

    public ExecuteJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ExecuteJobRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ExecuteJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ExecuteJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ExecuteJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteJobRequest setWorker(String worker) {
        this.worker = worker;
        return this;
    }
    public String getWorker() {
        return this.worker;
    }

}
