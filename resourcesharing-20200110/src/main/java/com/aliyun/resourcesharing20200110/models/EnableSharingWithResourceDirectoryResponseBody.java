// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class EnableSharingWithResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
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
