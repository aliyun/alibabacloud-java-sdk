// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE00ACCD-1CF9-4920-9BB9-0175EFF43405</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTagsFromResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromResourceResponseBody self = new RemoveTagsFromResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTagsFromResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
