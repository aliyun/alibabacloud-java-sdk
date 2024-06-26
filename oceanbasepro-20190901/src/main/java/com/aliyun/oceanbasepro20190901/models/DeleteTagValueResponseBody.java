// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTagValueResponseBody extends TeaModel {
    /**
     * <p>The tag deletion result.</p>
     * 
     * <strong>example:</strong>
     * <p>delete tag-value success</p>
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

    public static DeleteTagValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagValueResponseBody self = new DeleteTagValueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTagValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
