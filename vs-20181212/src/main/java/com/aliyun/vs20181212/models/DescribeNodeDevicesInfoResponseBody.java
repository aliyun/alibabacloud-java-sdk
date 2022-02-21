// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeNodeDevicesInfoResponseBody extends TeaModel {
    @NameInMap("NodeDevices")
    public java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevices> nodeDevices;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodeDevicesInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeDevicesInfoResponseBody self = new DescribeNodeDevicesInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeDevicesInfoResponseBody setNodeDevices(java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevices> nodeDevices) {
        this.nodeDevices = nodeDevices;
        return this;
    }
    public java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevices> getNodeDevices() {
        return this.nodeDevices;
    }

    public DescribeNodeDevicesInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Server")
        public String server;

        public static DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos self = new DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class DescribeNodeDevicesInfoResponseBodyNodeDevices extends TeaModel {
        @NameInMap("DeviceInfos")
        public java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos> deviceInfos;

        @NameInMap("NodeName")
        public String nodeName;

        public static DescribeNodeDevicesInfoResponseBodyNodeDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeDevicesInfoResponseBodyNodeDevices self = new DescribeNodeDevicesInfoResponseBodyNodeDevices();
            return TeaModel.build(map, self);
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevices setDeviceInfos(java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
            return this;
        }
        public java.util.List<DescribeNodeDevicesInfoResponseBodyNodeDevicesDeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        public DescribeNodeDevicesInfoResponseBodyNodeDevices setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
