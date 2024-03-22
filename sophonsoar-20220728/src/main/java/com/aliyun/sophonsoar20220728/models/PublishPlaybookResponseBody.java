// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class PublishPlaybookResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishPlaybookResponseBody self = new PublishPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
