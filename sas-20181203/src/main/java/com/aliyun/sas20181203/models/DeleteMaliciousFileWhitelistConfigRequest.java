// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist rule for agentless detection of sensitive file alerts. You can call <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    public static DeleteMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaliciousFileWhitelistConfigRequest self = new DeleteMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaliciousFileWhitelistConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

}
