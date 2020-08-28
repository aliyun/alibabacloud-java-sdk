// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EccId")
    @Validation(required = true)
    public String eccId;

    public static CreateExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionResponse self = new CreateExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

}
