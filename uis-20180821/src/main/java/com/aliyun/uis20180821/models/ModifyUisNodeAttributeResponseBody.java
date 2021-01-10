// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisNodeAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUisNodeAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisNodeAttributeResponseBody self = new ModifyUisNodeAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUisNodeAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
