// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateMultiAccountDeliveryChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36A3D9BE-B607-5993-B546-7E19EF65D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMultiAccountDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiAccountDeliveryChannelResponseBody self = new UpdateMultiAccountDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMultiAccountDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
