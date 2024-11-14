// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecAbnormalsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApisecAbnormalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecAbnormalsResponseBody self = new ModifyApisecAbnormalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApisecAbnormalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
