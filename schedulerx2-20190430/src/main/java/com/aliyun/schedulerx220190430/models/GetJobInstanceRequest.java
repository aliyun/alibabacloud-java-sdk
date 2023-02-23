// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the job.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the job instance.</p>
     */
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    /**
     * <p>The ID of the namespace. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    public static GetJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceRequest self = new GetJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetJobInstanceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetJobInstanceRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

    public GetJobInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetJobInstanceRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetJobInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
