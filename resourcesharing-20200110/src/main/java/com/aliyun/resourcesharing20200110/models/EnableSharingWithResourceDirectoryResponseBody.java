// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class EnableSharingWithResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSharingWithResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSharingWithResourceDirectoryResponseBody self = new EnableSharingWithResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSharingWithResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
