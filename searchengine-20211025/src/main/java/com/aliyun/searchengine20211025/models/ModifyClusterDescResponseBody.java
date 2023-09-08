// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
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
