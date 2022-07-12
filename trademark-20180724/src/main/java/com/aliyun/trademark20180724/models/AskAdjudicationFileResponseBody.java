// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class AskAdjudicationFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AskAdjudicationFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AskAdjudicationFileResponseBody self = new AskAdjudicationFileResponseBody();
        return TeaModel.build(map, self);
    }

    public AskAdjudicationFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
