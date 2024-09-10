// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBaselineCheckWhiteRecordResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBaselineCheckWhiteRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineCheckWhiteRecordResponseBody self = new DeleteBaselineCheckWhiteRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineCheckWhiteRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
