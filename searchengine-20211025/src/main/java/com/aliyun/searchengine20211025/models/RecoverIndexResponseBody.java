// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RecoverIndexResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result returned by data search.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static RecoverIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverIndexResponseBody self = new RecoverIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoverIndexResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
