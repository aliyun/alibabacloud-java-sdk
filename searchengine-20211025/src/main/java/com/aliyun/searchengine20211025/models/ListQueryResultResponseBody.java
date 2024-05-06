// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListQueryResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryResultResponseBody self = new ListQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
