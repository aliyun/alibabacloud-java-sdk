// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHADiagnoseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHADiagnoseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHADiagnoseConfigResponseBody self = new ModifyHADiagnoseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHADiagnoseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
