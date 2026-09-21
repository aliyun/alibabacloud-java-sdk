// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class NetworkConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC_AND_PRIVATE</p>
     */
    @NameInMap("networkMode")
    public String networkMode;

    /**
     * <strong>example:</strong>
     * <p>sg-****</p>
     */
    @NameInMap("securityGroupID")
    public String securityGroupID;

    /**
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("vpcID")
    public String vpcID;

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
