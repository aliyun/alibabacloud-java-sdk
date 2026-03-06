// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerUserConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable public network access for all API MCP Servers in your account, including the system MCP Server. By default, public network access is enabled. If you disable it, you can only access the servers through their VPC domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enablePublicAccess")
    public Boolean enablePublicAccess;

    /**
     * <p>The VPC whitelist. After disabling public network access, use this parameter to specify allowed source VPCs. If you do not set this parameter or leave it empty, all source VPCs are allowed.</p>
     */
    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    public static UpdateApiMcpServerUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiMcpServerUserConfigRequest self = new UpdateApiMcpServerUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiMcpServerUserConfigRequest setEnablePublicAccess(Boolean enablePublicAccess) {
        this.enablePublicAccess = enablePublicAccess;
        return this;
    }
    public Boolean getEnablePublicAccess() {
        return this.enablePublicAccess;
    }

    public UpdateApiMcpServerUserConfigRequest setVpcWhitelists(java.util.List<String> vpcWhitelists) {
        this.vpcWhitelists = vpcWhitelists;
        return this;
    }
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

}
