// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AssociateChatbotInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateChatbotInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateChatbotInstanceResponseBody self = new AssociateChatbotInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateChatbotInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
