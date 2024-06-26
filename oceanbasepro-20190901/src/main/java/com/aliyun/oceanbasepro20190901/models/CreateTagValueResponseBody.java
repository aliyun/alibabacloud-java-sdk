// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagValueResponseBody extends TeaModel {
    /**
     * <p>The tag creation result.</p>
     * 
     * <strong>example:</strong>
     * <p>create tag value success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4C91F7BA-xxxx-xxxx-xxxx-846ECA1A9908</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTagValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagValueResponseBody self = new CreateTagValueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTagValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
