// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmTreeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46B59732-033F-5C96-9B15-1E05E7705548</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20210317101023</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    @NameInMap("Tree")
    public java.util.List<java.util.Map<String, ?>> tree;

    public static GetAlgorithmTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmTreeResponseBody self = new GetAlgorithmTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmTreeResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public GetAlgorithmTreeResponseBody setTree(java.util.List<java.util.Map<String, ?>> tree) {
        this.tree = tree;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getTree() {
        return this.tree;
    }

}
