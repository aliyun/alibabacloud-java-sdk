// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressCloudConnectionResponse self = new DeleteExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

}
