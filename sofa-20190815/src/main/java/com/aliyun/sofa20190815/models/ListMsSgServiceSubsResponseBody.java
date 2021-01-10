// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceSubsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Subscribers")
    public java.util.List<ListMsSgServiceSubsResponseBodySubscribers> subscribers;

    public static ListMsSgServiceSubsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceSubsResponseBody self = new ListMsSgServiceSubsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceSubsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgServiceSubsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgServiceSubsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgServiceSubsResponseBody setSubscribers(java.util.List<ListMsSgServiceSubsResponseBodySubscribers> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<ListMsSgServiceSubsResponseBodySubscribers> getSubscribers() {
        return this.subscribers;
    }

    public static class ListMsSgServiceSubsResponseBodySubscribers extends TeaModel {
        @NameInMap("Alive")
        public Boolean alive;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CheckSum")
        public String checkSum;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Zone")
        public String zone;

        public static ListMsSgServiceSubsResponseBodySubscribers build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgServiceSubsResponseBodySubscribers self = new ListMsSgServiceSubsResponseBodySubscribers();
            return TeaModel.build(map, self);
        }

        public ListMsSgServiceSubsResponseBodySubscribers setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListMsSgServiceSubsResponseBodySubscribers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
