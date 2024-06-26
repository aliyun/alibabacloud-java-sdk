// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DesignateWorkersRequest extends TeaModel {
    /**
     * <p>The type of the machines to be designated. Valid values: 1 and 2. The value 1 specifies the worker type. The value 2 specifies the label type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DesignateType")
    public Integer designateType;

    /**
     * <p>The application group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hxm.test</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>144153</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The designated <code>labels</code>. Specify the value of the parameter in a <code>JSON</code> string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;gray&quot;]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The unique identifier (UID) of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a06d5ea-f576-4326-842c-fb14ea043d8d</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to allow a failover.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Transferable")
    public Boolean transferable;

    /**
     * <p>The designated machines. Specify the value of the parameter in a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;127.0.0.1&quot;,&quot;127.0.0.2&quot;]</p>
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
