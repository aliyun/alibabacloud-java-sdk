// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateRouteStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the application group. You can obtain the ID on the **Application Management** page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID. You can obtain the ID on the **Task Management** page in the SchedulerX console.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The name of the routing policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the **Namespace** page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the routing policy. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the routing policy.</p>
     * <p>*   **1**: enables the routing policy.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The details of the routing policy. The value is a JSON string. For more information about this parameter, see **the additional information about request parameters** below this table.</p>
     */
    @NameInMap("StrategyContent")
    public String strategyContent;

    /**
     * <p>The type of the routing policy. Valid value:</p>
     * <br>
     * <p>*   **3**: routes by proportion.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateRouteStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteStrategyRequest self = new CreateRouteStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteStrategyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateRouteStrategyRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateRouteStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouteStrategyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateRouteStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteStrategyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateRouteStrategyRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public CreateRouteStrategyRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
