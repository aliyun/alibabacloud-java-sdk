// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySQLCollectorRetentionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorRetentionResponse self = new ModifySQLCollectorRetentionResponse();
        return TeaModel.build(map, self);
    }

}
