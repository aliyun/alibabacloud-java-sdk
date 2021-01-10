// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisConnectionAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUisConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisConnectionAttributeResponseBody self = new ModifyUisConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUisConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
