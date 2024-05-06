// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponseBody extends TeaModel {
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

    public static DeleteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponseBody self = new DeleteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstanceResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
