// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateApiExportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62382992-F9AA-52B2-9147-66B3B9E51D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiExportResponseBody self = new CreateApiExportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
