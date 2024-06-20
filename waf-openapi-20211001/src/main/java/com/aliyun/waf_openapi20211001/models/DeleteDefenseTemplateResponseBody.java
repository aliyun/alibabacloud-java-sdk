// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E2DE6F11-6FED-5909-95F2-2520B58C5BC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDefenseTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseTemplateResponseBody self = new DeleteDefenseTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
