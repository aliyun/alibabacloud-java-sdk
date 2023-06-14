// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>Modifies the attributes of an ApsaraDB for Redis instance, such as the name, password, and state of release protection.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeResponseBody self = new ModifyInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
