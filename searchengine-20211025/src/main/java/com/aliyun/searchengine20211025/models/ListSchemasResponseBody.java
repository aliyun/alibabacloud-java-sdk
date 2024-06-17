// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListSchemasResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>FE03180A-0E29-5474-8A86-33F0683294A4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Object</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public Object result;

    public static ListSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasResponseBody self = new ListSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemasResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
