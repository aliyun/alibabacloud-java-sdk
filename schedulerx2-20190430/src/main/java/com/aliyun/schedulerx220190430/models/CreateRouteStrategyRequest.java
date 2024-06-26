// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateRouteStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the application group. You can obtain the ID on the <strong>Application Management</strong> page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID. You can obtain the ID on the <strong>Task Management</strong> page in the SchedulerX console.</p>
     * 
     * <strong>example:</strong>
     * <p>54978</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The name of the routing policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-strategy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the <strong>Namespace</strong> page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the routing policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables the routing policy.</li>
     * <li><strong>1</strong>: enables the routing policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The details of the routing policy. The value is a JSON string. For more information about this parameter, see <strong>the additional information about request parameters</strong> below this table.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;percentage&quot;:20,&quot;target&quot;:&quot;[\&quot;version1\&quot;]&quot;,&quot;targetType&quot;:&quot;label&quot;}]</p>
     */
    @NameInMap("StrategyContent")
    public String strategyContent;

    /**
     * <p>The type of the routing policy. Valid value:</p>
     * <ul>
     * <li><strong>3</strong>: routes by proportion.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
