// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PreviewModelResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static PreviewModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewModelResponseBody self = new PreviewModelResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewModelResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public PreviewModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewModelResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
