// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMinorVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMinorVersionResponseBody self = new ModifyInstanceMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
