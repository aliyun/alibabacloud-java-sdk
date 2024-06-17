// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class StartIndexResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>D39EE0F1-D7EF-5F46-B781-6BF4185308B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static StartIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartIndexResponseBody self = new StartIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public StartIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartIndexResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
