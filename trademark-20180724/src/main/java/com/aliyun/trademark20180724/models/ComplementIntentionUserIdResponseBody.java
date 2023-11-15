// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ComplementIntentionUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ComplementIntentionUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ComplementIntentionUserIdResponseBody self = new ComplementIntentionUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ComplementIntentionUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
