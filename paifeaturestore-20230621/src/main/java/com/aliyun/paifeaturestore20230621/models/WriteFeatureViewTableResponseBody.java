// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteFeatureViewTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WriteFeatureViewTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WriteFeatureViewTableResponseBody self = new WriteFeatureViewTableResponseBody();
        return TeaModel.build(map, self);
    }

    public WriteFeatureViewTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
