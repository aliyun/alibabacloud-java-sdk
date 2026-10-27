// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchDeleteMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The list of sensitive file whitelist rule IDs. Call <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> to obtain the IDs of sensitive file whitelist rules.</p>
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
