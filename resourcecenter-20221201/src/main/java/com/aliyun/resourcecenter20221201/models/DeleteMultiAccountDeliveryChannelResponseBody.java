// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteMultiAccountDeliveryChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3C5CDBF6-4DB7-53E9-ADDC-5919E3FAC***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMultiAccountDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiAccountDeliveryChannelResponseBody self = new DeleteMultiAccountDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMultiAccountDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
