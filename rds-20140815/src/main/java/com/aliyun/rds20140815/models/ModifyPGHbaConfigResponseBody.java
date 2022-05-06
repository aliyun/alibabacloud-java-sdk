// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigResponseBody extends TeaModel {
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
