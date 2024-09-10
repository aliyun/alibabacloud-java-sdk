// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomizedDictResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08571630-26D8-5E07-A4B7-DF8E89CF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomizedDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedDictResponseBody self = new CreateCustomizedDictResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
