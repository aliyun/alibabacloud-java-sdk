// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyAdvanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigResponseBody self = new ModifyAdvanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAdvanceConfigResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
