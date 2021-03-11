// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsPullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVsPullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVsPullStreamInfoConfigResponseBody self = new DeleteVsPullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVsPullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
