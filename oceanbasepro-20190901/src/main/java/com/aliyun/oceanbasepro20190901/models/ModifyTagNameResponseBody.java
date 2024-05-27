// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagNameResponseBody extends TeaModel {
    /**
     * <p>The tag group renaming result.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTagNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagNameResponseBody self = new ModifyTagNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTagNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
