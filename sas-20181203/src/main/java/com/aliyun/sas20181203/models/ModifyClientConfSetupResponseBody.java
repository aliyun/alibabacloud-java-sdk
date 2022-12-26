// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfSetupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClientConfSetupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfSetupResponseBody self = new ModifyClientConfSetupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfSetupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
