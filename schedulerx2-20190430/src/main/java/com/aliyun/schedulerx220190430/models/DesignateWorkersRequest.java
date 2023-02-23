// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DesignateWorkersRequest extends TeaModel {
    /**
     * <p>The type of the designated machines. Valid values: 1: worker. 2: label.</p>
     */
    @NameInMap("DesignateType")
    public Integer designateType;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the job.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The designated `labels`. The value is a `JSON` string.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to allow a failover.</p>
     */
    @NameInMap("Transferable")
    public Boolean transferable;

    /**
     * <p>The designated workers. The value is a JSON string.</p>
     */
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
