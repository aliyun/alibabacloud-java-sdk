// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttestorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD380235-A0B8-540D-A0D5-D6288446****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAttestorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttestorResponseBody self = new DeleteAttestorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAttestorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
