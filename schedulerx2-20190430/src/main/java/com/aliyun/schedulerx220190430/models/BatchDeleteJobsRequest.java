// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteJobsRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID on the **Application Management** page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job IDs. Separate multiple job IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIdList")
    public java.util.List<Long> jobIdList;

    /**
     * <p>The ID of the namespace to which the job belongs. You can obtain the ID of the namespace on the **Namespace** page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region to which the job belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchDeleteJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteJobsRequest self = new BatchDeleteJobsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchDeleteJobsRequest setJobIdList(java.util.List<Long> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    public BatchDeleteJobsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDeleteJobsRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public BatchDeleteJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
