// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxDesignateInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.defalutGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>368</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReadSchedulerxDesignateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxDesignateInfoRequest self = new ReadSchedulerxDesignateInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxDesignateInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReadSchedulerxDesignateInfoRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ReadSchedulerxDesignateInfoRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ReadSchedulerxDesignateInfoRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ReadSchedulerxDesignateInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
