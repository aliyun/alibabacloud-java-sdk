// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The ID of the alert whitelist rule of sensitive files that are detected by using the agentless detection feature. You can call the <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> operation to query the IDs of alert whitelist rules.</p>
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
