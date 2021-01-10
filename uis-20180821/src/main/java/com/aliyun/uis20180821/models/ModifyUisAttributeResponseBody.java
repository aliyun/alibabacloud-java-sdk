// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUisAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisAttributeResponseBody self = new ModifyUisAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUisAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
