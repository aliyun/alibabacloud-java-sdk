// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListIpOrHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpNames")
    public java.util.List<String> ipNames;

    public static ListIpOrHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpOrHostsResponseBody self = new ListIpOrHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpOrHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpOrHostsResponseBody setIpNames(java.util.List<String> ipNames) {
        this.ipNames = ipNames;
        return this;
    }
    public java.util.List<String> getIpNames() {
        return this.ipNames;
    }

}
