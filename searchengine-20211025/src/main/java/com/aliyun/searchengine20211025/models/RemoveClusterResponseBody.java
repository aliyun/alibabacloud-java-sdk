// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RemoveClusterResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static RemoveClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterResponseBody self = new RemoveClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveClusterResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
