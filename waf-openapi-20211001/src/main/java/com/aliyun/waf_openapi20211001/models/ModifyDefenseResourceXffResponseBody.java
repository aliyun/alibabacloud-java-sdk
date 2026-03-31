// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6C094583-9B3F-5BD8-8748-DC638E****BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseResourceXffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceXffResponseBody self = new ModifyDefenseResourceXffResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceXffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
