// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckScopeConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. This parameter is optional. If you do not specify this parameter, a default ID is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>435f626256ebf564cf5ba966a539****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static GetCheckScopeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckScopeConfigRequest self = new GetCheckScopeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckScopeConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetCheckScopeConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
