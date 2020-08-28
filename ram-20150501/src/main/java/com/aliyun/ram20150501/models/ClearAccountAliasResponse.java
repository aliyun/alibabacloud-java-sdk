// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ClearAccountAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ClearAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAccountAliasResponse self = new ClearAccountAliasResponse();
        return TeaModel.build(map, self);
    }

}
