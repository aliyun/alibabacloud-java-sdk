// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOnlineConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyClusterOnlineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOnlineConfigResponseBody self = new ModifyClusterOnlineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOnlineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterOnlineConfigResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
