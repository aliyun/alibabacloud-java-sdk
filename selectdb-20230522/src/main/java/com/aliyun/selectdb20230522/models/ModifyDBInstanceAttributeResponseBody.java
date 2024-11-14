// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2DB29DEE-52E4-57EE-BF68-2C95C20E6658</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAttributeResponseBody self = new ModifyDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
