// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponseBody self = new CreateVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVSwitchResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
