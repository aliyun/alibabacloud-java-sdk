// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnServerResponse self = new DeleteSslVpnServerResponse();
        return TeaModel.build(map, self);
    }

}
