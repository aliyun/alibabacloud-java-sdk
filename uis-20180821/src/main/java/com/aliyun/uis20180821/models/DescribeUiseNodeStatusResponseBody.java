// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUiseNodeStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpStatusList")
    public DescribeUiseNodeStatusResponseBodyIpStatusList ipStatusList;

    public static DescribeUiseNodeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUiseNodeStatusResponseBody self = new DescribeUiseNodeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUiseNodeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUiseNodeStatusResponseBody setIpStatusList(DescribeUiseNodeStatusResponseBodyIpStatusList ipStatusList) {
        this.ipStatusList = ipStatusList;
        return this;
    }
    public DescribeUiseNodeStatusResponseBodyIpStatusList getIpStatusList() {
        return this.ipStatusList;
    }

    public static class DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus extends TeaModel {
        @NameInMap("CurrentConnections")
        public Integer currentConnections;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        public static DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus self = new DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus();
            return TeaModel.build(map, self);
        }

        public DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus setCurrentConnections(Integer currentConnections) {
            this.currentConnections = currentConnections;
            return this;
        }
        public Integer getCurrentConnections() {
            return this.currentConnections;
        }

        public DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

    }

    public static class DescribeUiseNodeStatusResponseBodyIpStatusList extends TeaModel {
        @NameInMap("IpStatus")
        public java.util.List<DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus> ipStatus;

        public static DescribeUiseNodeStatusResponseBodyIpStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUiseNodeStatusResponseBodyIpStatusList self = new DescribeUiseNodeStatusResponseBodyIpStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeUiseNodeStatusResponseBodyIpStatusList setIpStatus(java.util.List<DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus> ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public java.util.List<DescribeUiseNodeStatusResponseBodyIpStatusListIpStatus> getIpStatus() {
            return this.ipStatus;
        }

    }

}
