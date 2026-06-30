// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateYikeProductionResponseBody extends TeaModel {
    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_12334**</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateYikeProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateYikeProductionResponseBody self = new UpdateYikeProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateYikeProductionResponseBody setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public UpdateYikeProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
