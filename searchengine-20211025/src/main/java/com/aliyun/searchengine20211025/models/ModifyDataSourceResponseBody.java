// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The schema information.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceResponseBody self = new ModifyDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDataSourceResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
