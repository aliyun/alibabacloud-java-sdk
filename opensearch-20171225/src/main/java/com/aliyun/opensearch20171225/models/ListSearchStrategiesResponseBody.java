// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSearchStrategiesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSearchStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchStrategiesResponseBody self = new ListSearchStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
