// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAttackPathSensitiveAssetConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FD394AF6-591E-5168-8C8C-4C784736****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAttackPathSensitiveAssetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackPathSensitiveAssetConfigResponseBody self = new UpdateAttackPathSensitiveAssetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAttackPathSensitiveAssetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
