// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class NetworkConfiguration extends TeaModel {
    /**
     * <p>The network access mode. Valid values: PUBLIC (public network only), PRIVATE (VPC only), PUBLIC_AND_PRIVATE (both public network and VPC are reachable).</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC_AND_PRIVATE</p>
     */
    @NameInMap("networkMode")
    public String networkMode;

    /**
     * <p>The ID of the security group used by the sandboxed container instances.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-****</p>
     */
    @NameInMap("securityGroupID")
    public String securityGroupID;

    /**
     * <p>The ID of the VPC to which the sandboxed container instances are connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("vpcID")
    public String vpcID;

    /**
     * <p>The list of vSwitch IDs to which the sandboxed container instances are connected. Configure vSwitches in multiple zones to improve availability.</p>
     */
    @NameInMap("vswitchIDs")
    public java.util.List<String> vswitchIDs;

    public static NetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
        NetworkConfiguration self = new NetworkConfiguration();
        return TeaModel.build(map, self);
    }

    public NetworkConfiguration setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public NetworkConfiguration setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }
    public String getSecurityGroupID() {
        return this.securityGroupID;
    }

    public NetworkConfiguration setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }
    public String getVpcID() {
        return this.vpcID;
    }

    public NetworkConfiguration setVswitchIDs(java.util.List<String> vswitchIDs) {
        this.vswitchIDs = vswitchIDs;
        return this;
    }
    public java.util.List<String> getVswitchIDs() {
        return this.vswitchIDs;
    }

}
