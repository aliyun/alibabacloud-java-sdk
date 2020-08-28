// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterAccessWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhitelistResponse self = new ModifyDBClusterAccessWhitelistResponse();
        return TeaModel.build(map, self);
    }

}
