// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class PublishFeatureViewTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishFeatureViewTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishFeatureViewTableResponseBody self = new PublishFeatureViewTableResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishFeatureViewTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
