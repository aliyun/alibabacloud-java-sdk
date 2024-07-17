// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D39EE0F1-D7EF-5F46-B781-6BF4185308B0</p>
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

    public static ModifyClusterDescResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescResponseBody self = new ModifyClusterDescResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterDescResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
