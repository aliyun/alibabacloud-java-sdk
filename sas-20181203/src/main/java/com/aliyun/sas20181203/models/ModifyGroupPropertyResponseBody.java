// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGroupPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupPropertyResponseBody self = new ModifyGroupPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGroupPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
