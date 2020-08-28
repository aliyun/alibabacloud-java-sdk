// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccountAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccountAlias")
    @Validation(required = true)
    public String accountAlias;

    public static GetAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAliasResponse self = new GetAccountAliasResponse();
        return TeaModel.build(map, self);
    }

}
