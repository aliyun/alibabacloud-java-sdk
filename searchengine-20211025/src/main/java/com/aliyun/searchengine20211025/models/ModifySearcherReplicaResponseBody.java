// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifySearcherReplicaResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e1eef569-1ff7-4bf8-acf7-1cecca9894ce</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result of the operation. This object is empty in the current version.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifySearcherReplicaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySearcherReplicaResponseBody self = new ModifySearcherReplicaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySearcherReplicaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySearcherReplicaResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
