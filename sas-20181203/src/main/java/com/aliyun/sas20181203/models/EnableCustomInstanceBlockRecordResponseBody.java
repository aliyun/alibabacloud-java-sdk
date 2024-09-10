// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomInstanceBlockRecordResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCustomInstanceBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomInstanceBlockRecordResponseBody self = new EnableCustomInstanceBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCustomInstanceBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
