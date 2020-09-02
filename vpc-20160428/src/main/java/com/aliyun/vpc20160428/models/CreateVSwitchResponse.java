// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    public static CreateVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponse self = new CreateVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVSwitchResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
