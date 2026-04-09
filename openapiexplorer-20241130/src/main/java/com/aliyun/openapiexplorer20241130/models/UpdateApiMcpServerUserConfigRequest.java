// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerUserConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enablePublicAccess")
    public Boolean enablePublicAccess;

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
