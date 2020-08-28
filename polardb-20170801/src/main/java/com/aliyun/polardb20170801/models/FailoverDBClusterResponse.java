// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static FailoverDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterResponse self = new FailoverDBClusterResponse();
        return TeaModel.build(map, self);
    }

}
