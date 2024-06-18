// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddTagsToResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceResponseBody self = new AddTagsToResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagsToResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
