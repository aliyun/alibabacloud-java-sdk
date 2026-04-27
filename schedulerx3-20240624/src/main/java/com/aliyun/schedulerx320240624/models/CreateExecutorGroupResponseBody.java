// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateExecutorGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter format error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateExecutorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorGroupResponseBody self = new CreateExecutorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExecutorGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateExecutorGroupResponseBody setData(CreateExecutorGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExecutorGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateExecutorGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExecutorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExecutorGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateExecutorGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>md5_spell</p>
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
         * <p>NORMAL</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>All</p>
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

        public static CreateExecutorGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExecutorGroupResponseBodyData self = new CreateExecutorGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExecutorGroupResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateExecutorGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateExecutorGroupResponseBodyData setFailedService(String failedService) {
            this.failedService = failedService;
            return this;
        }
        public String getFailedService() {
            return this.failedService;
        }

        public CreateExecutorGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExecutorGroupResponseBodyData setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public CreateExecutorGroupResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateExecutorGroupResponseBodyData setWorkerId(Long workerId) {
            this.workerId = workerId;
            return this;
        }
        public Long getWorkerId() {
            return this.workerId;
        }

        public CreateExecutorGroupResponseBodyData setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

        public CreateExecutorGroupResponseBodyData setWorkers(String workers) {
            this.workers = workers;
            return this;
        }
        public String getWorkers() {
            return this.workers;
        }

    }

}
