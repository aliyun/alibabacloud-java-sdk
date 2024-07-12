// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGFeatureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7D497816-607C-5B67-97B1-61354B6ACB2B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateModelFeatureFGFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGFeatureResponseBody self = new UpdateModelFeatureFGFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
