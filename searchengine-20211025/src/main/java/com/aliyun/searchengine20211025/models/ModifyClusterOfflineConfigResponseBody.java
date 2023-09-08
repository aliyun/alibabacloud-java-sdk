// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOfflineConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyClusterOfflineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOfflineConfigResponseBody self = new ModifyClusterOfflineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOfflineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterOfflineConfigResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
