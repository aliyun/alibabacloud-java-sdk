// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkerListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The job information.</p>
     */
    @NameInMap("Data")
    public GetWorkerListResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Cannot find product according to your domain.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.</li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The IP address of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>30.225.16.49</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The label of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The port number of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>60831</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The startup method of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>springboot</p>
         */
        @NameInMap("Starter")
        public String starter;

        /**
         * <p>The version of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>1.3.4</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The address of the worker. The address is in the format of ${worker_id}@${worker_ip}:${worker_port}.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:030225016049_11734_25917@30.225.16.49">030225016049_11734_25917@30.225.16.49</a>:60831</p>
         */
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
        /**
         * <p>The worker information.</p>
         */
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
