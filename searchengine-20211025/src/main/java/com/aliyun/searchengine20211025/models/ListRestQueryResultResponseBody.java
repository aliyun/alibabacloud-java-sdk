// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListRestQueryResultResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>F43E8AB4-419C-5F4C-90D6-615590DFAA3C</p>
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

    public static ListRestQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRestQueryResultResponseBody self = new ListRestQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRestQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRestQueryResultResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
