// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDisableJobsRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID on the <strong>Application Management</strong> page in the SchedulerX console.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job IDs. Separate multiple job IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99341</p>
     */
    @NameInMap("JobIdList")
    public java.util.List<Long> jobIdList;

    /**
     * <p>The ID of the namespace to which the job belongs. You can obtain the ID of the namespace on the <strong>Namespace</strong> page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region to which the job belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchDisableJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableJobsRequest self = new BatchDisableJobsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDisableJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchDisableJobsRequest setJobIdList(java.util.List<Long> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    public BatchDisableJobsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDisableJobsRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public BatchDisableJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
