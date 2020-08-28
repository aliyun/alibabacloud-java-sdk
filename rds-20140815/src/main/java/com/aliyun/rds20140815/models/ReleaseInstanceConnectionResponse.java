// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseInstanceConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseInstanceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceConnectionResponse self = new ReleaseInstanceConnectionResponse();
        return TeaModel.build(map, self);
    }

}
