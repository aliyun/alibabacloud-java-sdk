// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorGroupResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateExecutorGroupResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
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
         * <p>The authentication method used by devices under the product to connect to the IoT platform. Valid values:</p>
         * <ul>
         * <li><strong>secret</strong>: Uses the device secret for device identity authentication.</li>
         * <li><strong>id2</strong>: Uses IoT Internet Device ID (ID²).</li>
         * <li><strong>x509</strong>: Uses the device X.509 certificate for device identity authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>md5_spell</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The workflow description.</p>
         * 
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Kubernetes services that failed to be imported.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        @NameInMap("FailedService")
        public String failedService;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The domain name rule.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The protocol types supported by the domain name. Valid values: HTTP (supports only the HTTP protocol), HTTPS (supports only the HTTPS protocol), and HTTP,HTTPS (supports both HTTP and HTTPS protocols).</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The worker ID of the deployment task. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WorkerId")
        public Long workerId;

        /**
         * <p>The executor type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerType")
        public String workerType;

        /**
         * <p>The list of specified machines in JSON format.</p>
         * 
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
