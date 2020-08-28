// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionResponse self = new ReleaseInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

}
