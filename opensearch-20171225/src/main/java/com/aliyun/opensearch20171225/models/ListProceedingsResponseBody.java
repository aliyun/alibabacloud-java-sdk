// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListProceedingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProceedingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProceedingsResponseBody self = new ListProceedingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProceedingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
