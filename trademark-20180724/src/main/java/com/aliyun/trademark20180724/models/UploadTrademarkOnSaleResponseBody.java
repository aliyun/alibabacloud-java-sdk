// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadTrademarkOnSaleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UploadTrademarkOnSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadTrademarkOnSaleResponseBody self = new UploadTrademarkOnSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadTrademarkOnSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
