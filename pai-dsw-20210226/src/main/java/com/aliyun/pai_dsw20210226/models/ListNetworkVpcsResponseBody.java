// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkVpcsResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // vpc列表
    @NameInMap("Vpcs")
    public java.util.List<Vpc> vpcs;

    public static ListNetworkVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkVpcsResponseBody self = new ListNetworkVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkVpcsResponseBody setVpcs(java.util.List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<Vpc> getVpcs() {
        return this.vpcs;
    }

}
