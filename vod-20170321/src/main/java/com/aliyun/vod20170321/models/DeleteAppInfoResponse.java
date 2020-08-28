// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInfoResponse self = new DeleteAppInfoResponse();
        return TeaModel.build(map, self);
    }

}
