// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the job instance in the running state.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The ID of the job. You can obtain the ID of the job on the Task Management page in the SchedulerX console.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

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

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public StopInstanceRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public StopInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public StopInstanceRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public StopInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
