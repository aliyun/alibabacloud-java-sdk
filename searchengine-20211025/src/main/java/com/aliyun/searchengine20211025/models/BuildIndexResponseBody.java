// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of clusters</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static BuildIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuildIndexResponseBody self = new BuildIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public BuildIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildIndexResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
