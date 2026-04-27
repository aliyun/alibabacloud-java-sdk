// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public UpdateExecutorGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C78E2AD2-5985-515B-BAD2-31A248AFC263</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateExecutorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutorGroupResponseBody self = new UpdateExecutorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExecutorGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateExecutorGroupResponseBody setData(UpdateExecutorGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateExecutorGroupResponseBodyData getData() {
        return this.data;
    }

    public UpdateExecutorGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateExecutorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExecutorGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateExecutorGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EDIT</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        @NameInMap("FailedService")
        public String failedService;

        /**
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;OfficeSiteId\&quot;:\&quot;cn-hangzhou+dir-8801187585\&quot;,\&quot;VSwitchIds\&quot;:[null]}</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>ins-95mfvqrtg6fkijt1uko000</p>
         */
        @NameInMap("WorkerId")
        public Long workerId;

        /**
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerType")
        public String workerType;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        @NameInMap("Workers")
        public String workers;

        public static UpdateExecutorGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateExecutorGroupResponseBodyData self = new UpdateExecutorGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateExecutorGroupResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateExecutorGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExecutorGroupResponseBodyData setFailedService(String failedService) {
            this.failedService = failedService;
            return this;
        }
        public String getFailedService() {
            return this.failedService;
        }

        public UpdateExecutorGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExecutorGroupResponseBodyData setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateExecutorGroupResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateExecutorGroupResponseBodyData setWorkerId(Long workerId) {
            this.workerId = workerId;
            return this;
        }
        public Long getWorkerId() {
            return this.workerId;
        }

        public UpdateExecutorGroupResponseBodyData setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

        public UpdateExecutorGroupResponseBodyData setWorkers(String workers) {
            this.workers = workers;
            return this;
        }
        public String getWorkers() {
            return this.workers;
        }

    }

}
