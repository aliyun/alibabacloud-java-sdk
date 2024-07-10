// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebNetworkConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetAccess")
    public Boolean internetAccess;

    /**
     * <strong>example:</strong>
     * <p>sg-bp18hj1wtxgy3b0***</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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
