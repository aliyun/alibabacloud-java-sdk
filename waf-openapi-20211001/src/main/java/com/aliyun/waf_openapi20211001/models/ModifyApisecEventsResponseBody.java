// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecEventsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-****-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApisecEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecEventsResponseBody self = new ModifyApisecEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApisecEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
