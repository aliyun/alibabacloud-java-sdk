// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelImportResponseBody extends TeaModel {
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
