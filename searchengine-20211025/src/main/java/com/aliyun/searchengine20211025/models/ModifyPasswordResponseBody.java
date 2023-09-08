// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPasswordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPasswordResponseBody self = new ModifyPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPasswordResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
