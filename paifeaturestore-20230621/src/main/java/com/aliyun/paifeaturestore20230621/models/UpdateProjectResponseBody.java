// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponseBody self = new UpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
