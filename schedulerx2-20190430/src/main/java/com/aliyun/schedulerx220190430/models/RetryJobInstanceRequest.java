// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class RetryJobInstanceRequest extends TeaModel {
    /**
     * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The job instance ID.</p>
     */
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RetryJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryJobInstanceRequest self = new RetryJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RetryJobInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RetryJobInstanceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public RetryJobInstanceRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

    public RetryJobInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RetryJobInstanceRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public RetryJobInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
