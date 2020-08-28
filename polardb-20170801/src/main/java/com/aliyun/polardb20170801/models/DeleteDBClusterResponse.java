// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterResponse self = new DeleteDBClusterResponse();
        return TeaModel.build(map, self);
    }

}
