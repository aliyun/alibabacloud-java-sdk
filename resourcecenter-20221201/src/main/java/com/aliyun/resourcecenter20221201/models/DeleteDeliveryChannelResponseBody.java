// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteDeliveryChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD5F848D-CCDC-5464-93E1-4BA50A482***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryChannelResponseBody self = new DeleteDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
