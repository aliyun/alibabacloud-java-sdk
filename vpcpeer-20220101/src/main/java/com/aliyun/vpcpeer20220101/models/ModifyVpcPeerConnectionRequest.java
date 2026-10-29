// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ModifyVpcPeerConnectionRequest extends TeaModel {
    /**
     * <p>The new bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new description of the VPC peering connection.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>newdescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the information. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the jumbo frame feature is enabled for the VPC peering connection. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.<blockquote>
     * <p>Note: To specify this parameter, make sure that you create a cross-region peering connection.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The instance ID of the VPC peering connection whose name or description you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-lnk0m24khwvtkm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The link type.</p>
     * <p>Valid values: Platinum and Gold. Default value: Gold.</p>
     * <blockquote>
     * <p>To specify this parameter, make sure that you create a cross-region peering connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Gold</p>
     */
    @NameInMap("LinkType")
    public String linkType;

    /**
     * <p>The new name of the VPC peering connection.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcpeername</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPeerConnectionRequest self = new ModifyVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPeerConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpcPeerConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyVpcPeerConnectionRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public ModifyVpcPeerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyVpcPeerConnectionRequest setLinkType(String linkType) {
        this.linkType = linkType;
        return this;
    }
    public String getLinkType() {
        return this.linkType;
    }

    public ModifyVpcPeerConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
