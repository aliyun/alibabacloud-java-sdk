// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelImportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17F57FEE-EA4F-4337-8D2E-9C23CAA63D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelImportResponseBody self = new CancelImportResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
