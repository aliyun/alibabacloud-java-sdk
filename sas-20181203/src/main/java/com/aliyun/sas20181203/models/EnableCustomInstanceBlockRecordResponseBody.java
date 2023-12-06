// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomInstanceBlockRecordResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
