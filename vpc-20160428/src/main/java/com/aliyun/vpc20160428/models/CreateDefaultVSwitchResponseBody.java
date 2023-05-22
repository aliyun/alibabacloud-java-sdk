// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDefaultVSwitchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the default vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateDefaultVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultVSwitchResponseBody self = new CreateDefaultVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultVSwitchResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
