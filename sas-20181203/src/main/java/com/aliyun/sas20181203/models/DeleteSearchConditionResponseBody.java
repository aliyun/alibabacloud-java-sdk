// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSearchConditionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2983C540-E51F-582A-B510-732C27CD914C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSearchConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchConditionResponseBody self = new DeleteSearchConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSearchConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
