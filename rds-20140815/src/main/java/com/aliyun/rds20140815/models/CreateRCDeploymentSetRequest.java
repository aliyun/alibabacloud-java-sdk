// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDeploymentSetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment set name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>deployment_test</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>The description of the deployment set. The value must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of groups in the deployment set. Valid values: 1 to 7.</p>
     * <p>Default value: 3.</p>
     * <blockquote>
     * <p> This parameter takes effect only when <code>Strategy is set to AvailabilityGroup</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("GroupCount")
    public Long groupCount;

    /**
     * <p>The emergency solution to use in the scenario in which instances in the deployment set cannot be evenly distributed to different zones due to resource insufficiency after the instances failover. Valid values:</p>
     * <ul>
     * <li><strong>CancelMembershipAndStart</strong>: removes the instances from the deployment set and restarts the instances immediately after the failover is complete.</li>
     * <li><strong>KeepStopped</strong>: does not remove the instances from the deployment set and keeps the instances in the Stopped state.</li>
     * </ul>
     * <p>Default value: CancelMembershipAndStart.</p>
     * 
     * <strong>example:</strong>
     * <p>CancelMembershipAndStart</p>
     */
    @NameInMap("OnUnableToRedeployFailedInstance")
    public String onUnableToRedeployFailedInstance;

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
     * <p>The deployment strategy. Valid values:</p>
     * <ul>
     * <li><strong>Availability</strong>: high-availability strategy</li>
     * <li><strong>AvailabilityGroup</strong>: high-availability group strategy</li>
     * <li><strong>LowLatency</strong>: low latency strategy</li>
     * </ul>
     * <p>Default value: Availability.</p>
     * 
     * <strong>example:</strong>
     * <p>Availability</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static CreateRCDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDeploymentSetRequest self = new CreateRCDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCDeploymentSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRCDeploymentSetRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public CreateRCDeploymentSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRCDeploymentSetRequest setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public CreateRCDeploymentSetRequest setOnUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
        this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
        return this;
    }
    public String getOnUnableToRedeployFailedInstance() {
        return this.onUnableToRedeployFailedInstance;
    }

    public CreateRCDeploymentSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRCDeploymentSetRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
