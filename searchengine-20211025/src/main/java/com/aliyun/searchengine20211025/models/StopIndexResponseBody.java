// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class StopIndexResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
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

    public static StopIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopIndexResponseBody self = new StopIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public StopIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopIndexResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
