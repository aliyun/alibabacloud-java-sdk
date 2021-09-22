// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelinePrivilegesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePipelinePrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinePrivilegesResponseBody self = new UpdatePipelinePrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinePrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
