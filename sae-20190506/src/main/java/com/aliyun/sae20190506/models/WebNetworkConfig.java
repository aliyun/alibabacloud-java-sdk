// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebNetworkConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable Internet access for the application. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables Internet access.</li>
     * <li><strong>false</strong>: disables Internet access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetAccess")
    public Boolean internetAccess;

    /**
     * <p>The ID of a security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp18hj1wtxgy3b0***</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The list of vSwitches.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static WebNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        WebNetworkConfig self = new WebNetworkConfig();
        return TeaModel.build(map, self);
    }

    public WebNetworkConfig setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public WebNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public WebNetworkConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}
