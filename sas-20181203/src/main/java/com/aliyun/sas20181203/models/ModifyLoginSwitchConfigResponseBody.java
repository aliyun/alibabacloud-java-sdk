// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoginSwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginSwitchConfigResponseBody self = new ModifyLoginSwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoginSwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
