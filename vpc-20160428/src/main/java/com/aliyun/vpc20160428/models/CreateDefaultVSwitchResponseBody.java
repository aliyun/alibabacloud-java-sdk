// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDefaultVSwitchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the default vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1a4b5qhmxftjimq****</p>
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
