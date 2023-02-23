// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchEnableJobsRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the ID of the application on the **Application Management** page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job IDs. Separate multiple job IDs with commas (,).</p>
     */
    @NameInMap("JobIdList")
    public java.util.List<Long> jobIdList;

    /**
     * <p>The ID of the namespace to which the job belongs. You can obtain the ID of the namespace on the **Namespace** page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region in which the job resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchEnableJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableJobsRequest self = new BatchEnableJobsRequest();
        return TeaModel.build(map, self);
    }

    public BatchEnableJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchEnableJobsRequest setJobIdList(java.util.List<Long> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    public BatchEnableJobsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchEnableJobsRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public BatchEnableJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
