// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceUpgradePeriodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceUpgradePeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceUpgradePeriodResponseBody self = new ModifyInstanceUpgradePeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceUpgradePeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
