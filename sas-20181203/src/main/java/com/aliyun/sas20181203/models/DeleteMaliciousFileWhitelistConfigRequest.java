// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousFileWhitelistConfigRequest extends TeaModel {
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
