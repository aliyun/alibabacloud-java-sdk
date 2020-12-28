// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicCreateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicCreateResponseBody self = new OnsTopicCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
