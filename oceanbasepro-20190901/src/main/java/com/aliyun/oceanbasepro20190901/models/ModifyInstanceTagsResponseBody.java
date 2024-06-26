// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTagsResponseBody extends TeaModel {
    /**
     * <p>The tag modification result.</p>
     * 
     * <strong>example:</strong>
     * <p>done</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTagsResponseBody self = new ModifyInstanceTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyInstanceTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
