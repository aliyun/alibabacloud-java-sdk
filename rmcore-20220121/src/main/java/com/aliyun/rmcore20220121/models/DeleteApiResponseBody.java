// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteApiResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiResponseBody self = new DeleteApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
