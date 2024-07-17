// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D39EE0F1-D7EF-5F46-B781-6BF4185308B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public Object result;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
