// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveListenerWhiteListItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveListenerWhiteListItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveListenerWhiteListItemResponseBody self = new RemoveListenerWhiteListItemResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveListenerWhiteListItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
