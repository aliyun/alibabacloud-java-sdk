// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttestorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B44EA7F0-497A-5F10-B5A8-87291356****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAttestorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAttestorResponseBody self = new CreateAttestorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAttestorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
