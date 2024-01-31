// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGInfoResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static GetModelFeatureFGInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureFGInfoResponseBody self = new GetModelFeatureFGInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureFGInfoResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetModelFeatureFGInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
