// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetWorkerListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerListResponseBody self = new GetWorkerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkerListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkerListResponseBody setData(GetWorkerListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkerListResponseBodyData getData() {
        return this.data;
    }

    public GetWorkerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkerListResponseBodyDataWorkerInfos extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Label")
        public String label;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Starter")
        public String starter;

        @NameInMap("Version")
        public String version;

        @NameInMap("WorkerAddress")
        public String workerAddress;

        public static GetWorkerListResponseBodyDataWorkerInfos build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerListResponseBodyDataWorkerInfos self = new GetWorkerListResponseBodyDataWorkerInfos();
            return TeaModel.build(map, self);
        }

        public GetWorkerListResponseBodyDataWorkerInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetWorkerListResponseBodyDataWorkerInfos setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWorkerListResponseBodyDataWorkerInfos setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetWorkerListResponseBodyDataWorkerInfos setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

        public GetWorkerListResponseBodyDataWorkerInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetWorkerListResponseBodyDataWorkerInfos setWorkerAddress(String workerAddress) {
            this.workerAddress = workerAddress;
            return this;
        }
        public String getWorkerAddress() {
            return this.workerAddress;
        }

    }

    public static class GetWorkerListResponseBodyData extends TeaModel {
        @NameInMap("WorkerInfos")
        public java.util.List<GetWorkerListResponseBodyDataWorkerInfos> workerInfos;

        public static GetWorkerListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerListResponseBodyData self = new GetWorkerListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkerListResponseBodyData setWorkerInfos(java.util.List<GetWorkerListResponseBodyDataWorkerInfos> workerInfos) {
            this.workerInfos = workerInfos;
            return this;
        }
        public java.util.List<GetWorkerListResponseBodyDataWorkerInfos> getWorkerInfos() {
            return this.workerInfos;
        }

    }

}
