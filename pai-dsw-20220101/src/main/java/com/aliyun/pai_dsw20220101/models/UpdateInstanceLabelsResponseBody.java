// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceLabelsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceLabelsResponseBody self = new UpdateInstanceLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
