// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicUpdateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicUpdateResponseBody self = new OnsTopicUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
