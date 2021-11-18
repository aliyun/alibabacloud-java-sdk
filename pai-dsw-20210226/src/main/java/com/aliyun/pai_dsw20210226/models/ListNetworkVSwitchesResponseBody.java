// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkVSwitchesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitches")
    public java.util.List<VSwitch> vSwitches;

    public static ListNetworkVSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkVSwitchesResponseBody self = new ListNetworkVSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkVSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkVSwitchesResponseBody setVSwitches(java.util.List<VSwitch> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<VSwitch> getVSwitches() {
        return this.vSwitches;
    }

}
