// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagValueNameResponseBody extends TeaModel {
    /**
     * <p>The tag renaming result.</p>
     * 
     * <strong>example:</strong>
     * <p>update tag-value name success</p>
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

    public static ModifyTagValueNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagValueNameResponseBody self = new ModifyTagValueNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagValueNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTagValueNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
