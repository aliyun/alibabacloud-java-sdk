// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseDescriptionResponseBody self = new ModifyDatabaseDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
