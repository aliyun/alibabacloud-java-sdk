// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFullNatEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BCC426F-A9F2-3F03-99D2-1E0D647236DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFullNatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFullNatEntryResponseBody self = new DeleteFullNatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFullNatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
