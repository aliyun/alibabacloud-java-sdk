// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0A916D48-D206-5654-8D37-***</p>
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
