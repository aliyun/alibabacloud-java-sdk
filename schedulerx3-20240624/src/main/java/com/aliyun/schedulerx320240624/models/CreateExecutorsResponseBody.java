// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorsResponseBody extends TeaModel {
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
    public CreateExecutorsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F131C3E0-3FAA-5FA4-A6F3-E974D69EF3C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * <ul>
     * <li><p>true: The request succeeded.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorsResponseBody self = new CreateExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExecutorsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateExecutorsResponseBody setData(CreateExecutorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExecutorsResponseBodyData getData() {
        return this.data;
    }

    public CreateExecutorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExecutorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateExecutorsResponseBodyData extends TeaModel {
        /**
         * <p>The App Group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppGroupId")
        public Long appGroupId;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppType")
        public Integer appType;

        /**
         * <p>A list of Kubernetes Services that failed to import.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        @NameInMap("FailedService")
        public String failedService;

        /**
         * <p>The ID of the worker. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ins-95mfvqrtg6fkijt1uko000</p>
         */
        @NameInMap("WorkerId")
        public Long workerId;

        /**
         * <p>The worker type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerType")
        public String workerType;

        /**
         * <p>A JSON string that represents the list of imported workers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        @NameInMap("Workers")
        public String workers;

        public static CreateExecutorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExecutorsResponseBodyData self = new CreateExecutorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExecutorsResponseBodyData setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public CreateExecutorsResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public CreateExecutorsResponseBodyData setFailedService(String failedService) {
            this.failedService = failedService;
            return this;
        }
        public String getFailedService() {
            return this.failedService;
        }

        public CreateExecutorsResponseBodyData setWorkerId(Long workerId) {
            this.workerId = workerId;
            return this;
        }
        public Long getWorkerId() {
            return this.workerId;
        }

        public CreateExecutorsResponseBodyData setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

        public CreateExecutorsResponseBodyData setWorkers(String workers) {
            this.workers = workers;
            return this;
        }
        public String getWorkers() {
            return this.workers;
        }

    }

}
