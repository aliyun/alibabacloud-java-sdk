// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteLogDeliveryConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLogDeliveryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogDeliveryConfigResponseBody self = new DeleteLogDeliveryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLogDeliveryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
