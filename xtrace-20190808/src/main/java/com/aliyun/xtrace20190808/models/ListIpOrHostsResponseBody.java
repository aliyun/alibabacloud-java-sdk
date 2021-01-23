// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListIpOrHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpNames")
    public ListIpOrHostsResponseBodyIpNames ipNames;

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

    public ListIpOrHostsResponseBody setIpNames(ListIpOrHostsResponseBodyIpNames ipNames) {
        this.ipNames = ipNames;
        return this;
    }
    public ListIpOrHostsResponseBodyIpNames getIpNames() {
        return this.ipNames;
    }

    public static class ListIpOrHostsResponseBodyIpNames extends TeaModel {
        @NameInMap("IpName")
        public java.util.List<String> ipName;

        public static ListIpOrHostsResponseBodyIpNames build(java.util.Map<String, ?> map) throws Exception {
            ListIpOrHostsResponseBodyIpNames self = new ListIpOrHostsResponseBodyIpNames();
            return TeaModel.build(map, self);
        }

        public ListIpOrHostsResponseBodyIpNames setIpName(java.util.List<String> ipName) {
            this.ipName = ipName;
            return this;
        }
        public java.util.List<String> getIpName() {
            return this.ipName;
        }

    }

}
