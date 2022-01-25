// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DesignateWorkersRequest extends TeaModel {
    // 指定机器的类型
    @NameInMap("DesignateType")
    public Integer designateType;

    // 应用分组ID
    @NameInMap("GroupId")
    public String groupId;

    // 任务ID
    @NameInMap("JobId")
    public Long jobId;

    // 指定label列表json格式
    @NameInMap("Labels")
    public String labels;

    // 命名空间UID
    @NameInMap("Namespace")
    public String namespace;

    // 命名空间来源
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    // 是否故障转移
    @NameInMap("Transferable")
    public Boolean transferable;

    // 指定机器列表json格式
    @NameInMap("Workers")
    public String workers;

    public static DesignateWorkersRequest build(java.util.Map<String, ?> map) throws Exception {
        DesignateWorkersRequest self = new DesignateWorkersRequest();
        return TeaModel.build(map, self);
    }

    public DesignateWorkersRequest setDesignateType(Integer designateType) {
        this.designateType = designateType;
        return this;
    }
    public Integer getDesignateType() {
        return this.designateType;
    }

    public DesignateWorkersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DesignateWorkersRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DesignateWorkersRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DesignateWorkersRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DesignateWorkersRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public DesignateWorkersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DesignateWorkersRequest setTransferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }
    public Boolean getTransferable() {
        return this.transferable;
    }

    public DesignateWorkersRequest setWorkers(String workers) {
        this.workers = workers;
        return this;
    }
    public String getWorkers() {
        return this.workers;
    }

}
