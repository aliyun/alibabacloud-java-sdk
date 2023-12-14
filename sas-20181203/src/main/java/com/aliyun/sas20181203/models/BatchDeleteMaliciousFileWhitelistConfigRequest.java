// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchDeleteMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The IDs of the whitelist rules. You can call the [ListMaliciousFileWhitelistConfigs](~~ListMaliciousFileWhitelistConfigs~~) operation to query the IDs of whitelist rules.</p>
     */
    @NameInMap("ConfigIdList")
    public java.util.List<Long> configIdList;

    public static BatchDeleteMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMaliciousFileWhitelistConfigRequest self = new BatchDeleteMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMaliciousFileWhitelistConfigRequest setConfigIdList(java.util.List<Long> configIdList) {
        this.configIdList = configIdList;
        return this;
    }
    public java.util.List<Long> getConfigIdList() {
        return this.configIdList;
    }

}
