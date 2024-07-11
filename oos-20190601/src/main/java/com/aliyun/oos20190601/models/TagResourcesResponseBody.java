// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B19AE203-FD99-49C7-9253-FAAACAD46F4A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
