// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupResponseBody self = new CreateParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
