// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateDingTalkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76975B7A-34DC-5CB6-9538-91700D4F112E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateDingTalkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateDingTalkResponseBody self = new CreateOrUpdateDingTalkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateDingTalkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
