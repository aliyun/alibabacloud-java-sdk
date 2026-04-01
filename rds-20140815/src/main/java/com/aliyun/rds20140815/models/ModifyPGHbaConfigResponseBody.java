// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>458E0781-C46C-55F5-A0E5-1DD284B28A3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPGHbaConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPGHbaConfigResponseBody self = new ModifyPGHbaConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPGHbaConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
