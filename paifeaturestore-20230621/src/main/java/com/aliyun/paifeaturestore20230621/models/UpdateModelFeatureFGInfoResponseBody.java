// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E8CA47C5-B3E8-5BD7-9910-245432A365EB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateModelFeatureFGInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGInfoResponseBody self = new UpdateModelFeatureFGInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
