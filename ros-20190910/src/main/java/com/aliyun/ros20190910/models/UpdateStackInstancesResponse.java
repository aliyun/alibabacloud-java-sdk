// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    public static UpdateStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesResponse self = new UpdateStackInstancesResponse();
        return TeaModel.build(map, self);
    }

}
