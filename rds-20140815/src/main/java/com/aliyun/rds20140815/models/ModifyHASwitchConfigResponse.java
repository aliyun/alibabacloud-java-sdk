// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigResponse self = new ModifyHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
