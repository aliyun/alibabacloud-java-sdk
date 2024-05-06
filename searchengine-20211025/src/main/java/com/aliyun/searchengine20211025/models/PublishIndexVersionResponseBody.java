// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishIndexVersionResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the index</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static PublishIndexVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishIndexVersionResponseBody self = new PublishIndexVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishIndexVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishIndexVersionResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
