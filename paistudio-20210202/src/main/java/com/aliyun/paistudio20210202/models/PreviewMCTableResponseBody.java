// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PreviewMCTableResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public java.util.List<java.util.List<String>> content;

    public static PreviewMCTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewMCTableResponseBody self = new PreviewMCTableResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewMCTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewMCTableResponseBody setContent(java.util.List<java.util.List<String>> content) {
        this.content = content;
        return this;
    }
    public java.util.List<java.util.List<String>> getContent() {
        return this.content;
    }

}
