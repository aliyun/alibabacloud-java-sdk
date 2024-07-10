// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyVATInvoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyVATInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyVATInvoiceResponseBody self = new VerifyVATInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyVATInvoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VerifyVATInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
