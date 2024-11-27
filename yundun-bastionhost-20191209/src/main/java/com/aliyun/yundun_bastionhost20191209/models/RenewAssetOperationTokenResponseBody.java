// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RenewAssetOperationTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewAssetOperationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewAssetOperationTokenResponseBody self = new RenewAssetOperationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewAssetOperationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
