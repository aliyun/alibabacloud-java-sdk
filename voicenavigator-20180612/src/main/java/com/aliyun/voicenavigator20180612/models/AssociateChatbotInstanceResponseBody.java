// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AssociateChatbotInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
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
