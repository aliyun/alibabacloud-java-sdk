// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class UpdatePropagationResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePropagationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropagationResponseBody self = new UpdatePropagationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePropagationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
