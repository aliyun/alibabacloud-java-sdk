// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServicePubsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Publishers")
    public java.util.List<ListMsSgServicePubsResponseBodyPublishers> publishers;

    public static ListMsSgServicePubsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServicePubsResponseBody self = new ListMsSgServicePubsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgServicePubsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgServicePubsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgServicePubsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgServicePubsResponseBody setPublishers(java.util.List<ListMsSgServicePubsResponseBodyPublishers> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<ListMsSgServicePubsResponseBodyPublishers> getPublishers() {
        return this.publishers;
    }

    public static class ListMsSgServicePubsResponseBodyPublishers extends TeaModel {
        @NameInMap("Alive")
        public Boolean alive;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CheckSum")
        public String checkSum;

        @NameInMap("ConfigWeight")
        public String configWeight;

        @NameInMap("Content")
        public String content;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mosn")
        public Boolean mosn;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ServicePort")
        public Long servicePort;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("VmMode")
        public Boolean vmMode;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Zone")
        public String zone;

        public static ListMsSgServicePubsResponseBodyPublishers build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgServicePubsResponseBodyPublishers self = new ListMsSgServicePubsResponseBodyPublishers();
            return TeaModel.build(map, self);
        }

        public ListMsSgServicePubsResponseBodyPublishers setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public ListMsSgServicePubsResponseBodyPublishers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgServicePubsResponseBodyPublishers setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListMsSgServicePubsResponseBodyPublishers setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public ListMsSgServicePubsResponseBodyPublishers setConfigWeight(String configWeight) {
            this.configWeight = configWeight;
            return this;
        }
        public String getConfigWeight() {
            return this.configWeight;
        }

        public ListMsSgServicePubsResponseBodyPublishers setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMsSgServicePubsResponseBodyPublishers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgServicePubsResponseBodyPublishers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListMsSgServicePubsResponseBodyPublishers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgServicePubsResponseBodyPublishers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgServicePubsResponseBodyPublishers setMosn(Boolean mosn) {
            this.mosn = mosn;
            return this;
        }
        public Boolean getMosn() {
            return this.mosn;
        }

        public ListMsSgServicePubsResponseBodyPublishers setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListMsSgServicePubsResponseBodyPublishers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMsSgServicePubsResponseBodyPublishers setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public ListMsSgServicePubsResponseBodyPublishers setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public ListMsSgServicePubsResponseBodyPublishers setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListMsSgServicePubsResponseBodyPublishers setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListMsSgServicePubsResponseBodyPublishers setVmMode(Boolean vmMode) {
            this.vmMode = vmMode;
            return this;
        }
        public Boolean getVmMode() {
            return this.vmMode;
        }

        public ListMsSgServicePubsResponseBodyPublishers setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListMsSgServicePubsResponseBodyPublishers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
