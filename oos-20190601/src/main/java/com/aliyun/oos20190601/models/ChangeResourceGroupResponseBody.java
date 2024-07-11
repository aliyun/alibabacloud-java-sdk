// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0620E49F-B884-5F98-A834-69D72922E5CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
