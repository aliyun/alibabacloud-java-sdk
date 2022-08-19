// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckVpnBgpEnabledResponseBody extends TeaModel {
    @NameInMap("BgpEnabled")
    public Boolean bgpEnabled;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckVpnBgpEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVpnBgpEnabledResponseBody self = new CheckVpnBgpEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVpnBgpEnabledResponseBody setBgpEnabled(Boolean bgpEnabled) {
        this.bgpEnabled = bgpEnabled;
        return this;
    }
    public Boolean getBgpEnabled() {
        return this.bgpEnabled;
    }

    public CheckVpnBgpEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
