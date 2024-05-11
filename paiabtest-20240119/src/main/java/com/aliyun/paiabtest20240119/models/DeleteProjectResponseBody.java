// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectResponseBody self = new DeleteProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
