// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    public static GetMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaliciousFileWhitelistConfigRequest self = new GetMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetMaliciousFileWhitelistConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

}
