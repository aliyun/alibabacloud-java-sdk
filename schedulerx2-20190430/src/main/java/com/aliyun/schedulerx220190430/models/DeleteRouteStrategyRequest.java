// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteRouteStrategyRequest extends TeaModel {
    /**
     * <p>The application ID. You can obtain the application ID on the **Application Management** page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID. You can obtain the job ID on the **Task Management** page in the SchedulerX console.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The namespace ID. You can obtain the ID of the namespace on the **Namespace** page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteRouteStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteStrategyRequest self = new DeleteRouteStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteStrategyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteRouteStrategyRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteRouteStrategyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteRouteStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
