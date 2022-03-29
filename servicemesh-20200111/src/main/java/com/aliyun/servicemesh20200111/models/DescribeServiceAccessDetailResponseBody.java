// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceAccessDetailResponseBody extends TeaModel {
    @NameInMap("AccessDetail")
    public DescribeServiceAccessDetailResponseBodyAccessDetail accessDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceAccessDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAccessDetailResponseBody self = new DescribeServiceAccessDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAccessDetailResponseBody setAccessDetail(DescribeServiceAccessDetailResponseBodyAccessDetail accessDetail) {
        this.accessDetail = accessDetail;
        return this;
    }
    public DescribeServiceAccessDetailResponseBodyAccessDetail getAccessDetail() {
        return this.accessDetail;
    }

    public DescribeServiceAccessDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceAccessDetailResponseBodyAccessDetail extends TeaModel {
        @NameInMap("ClusterIP")
        public String clusterIP;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public String ports;

        @NameInMap("Type")
        public String type;

        public static DescribeServiceAccessDetailResponseBodyAccessDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAccessDetailResponseBodyAccessDetail self = new DescribeServiceAccessDetailResponseBodyAccessDetail();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAccessDetailResponseBodyAccessDetail setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public String getClusterIP() {
            return this.clusterIP;
        }

        public DescribeServiceAccessDetailResponseBodyAccessDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceAccessDetailResponseBodyAccessDetail setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeServiceAccessDetailResponseBodyAccessDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
