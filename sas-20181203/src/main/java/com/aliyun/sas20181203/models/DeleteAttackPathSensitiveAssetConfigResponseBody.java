// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathSensitiveAssetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAttackPathSensitiveAssetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathSensitiveAssetConfigResponseBody self = new DeleteAttackPathSensitiveAssetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathSensitiveAssetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
