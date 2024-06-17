// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPostQueryResultResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
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

    public static ListPostQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPostQueryResultResponseBody self = new ListPostQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPostQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPostQueryResultResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
