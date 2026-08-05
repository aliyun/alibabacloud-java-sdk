// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsMappingAuthResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolarFsMappingAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsMappingAuthResponseBody self = new ModifyPolarFsMappingAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsMappingAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
