// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishAdvanceConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result returned</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static PublishAdvanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishAdvanceConfigResponseBody self = new PublishAdvanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishAdvanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishAdvanceConfigResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
