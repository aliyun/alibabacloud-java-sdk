// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreCheckItemsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>11EBEC99-B4B5-542E-8C17-B87B624C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreCheckItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreCheckItemsResponseBody self = new IgnoreCheckItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreCheckItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
