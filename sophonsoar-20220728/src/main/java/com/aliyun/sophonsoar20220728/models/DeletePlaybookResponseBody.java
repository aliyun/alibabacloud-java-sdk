// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeletePlaybookResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F3CA8A9-B5BB-506A-9182-FFE80A6E0584</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaybookResponseBody self = new DeletePlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
