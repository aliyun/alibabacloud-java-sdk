// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetAccountAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAliasResponse self = new SetAccountAliasResponse();
        return TeaModel.build(map, self);
    }

}
