// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveCloudAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveCloudAccountResponseBody self = new RemoveCloudAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveCloudAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
