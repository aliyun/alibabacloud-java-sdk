// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicDeleteResponseBody self = new OnsTopicDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
