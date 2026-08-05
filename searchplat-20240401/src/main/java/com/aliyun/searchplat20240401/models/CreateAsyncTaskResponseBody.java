// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CC93E65-6734-5060-BEF7-0EB0A4862BCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<CreateAsyncTaskResponseBodyResult> result;

    public static CreateAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskResponseBody self = new CreateAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAsyncTaskResponseBody setResult(java.util.List<CreateAsyncTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CreateAsyncTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CreateAsyncTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729669284</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1232</p>
         */
        @NameInMap("dataId")
        public Integer dataId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fae9bcc5-949f-4c31-b9b7-a273bf891699</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>文档解析任务</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parsing result.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-document-analyze-001</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("serviceType")
        public String serviceType;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PENDING: In progress.</li>
         * <li>SUCCESS: Parsing succeeded.</li>
         * <li>FAILED: Parsing failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729669284</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static CreateAsyncTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAsyncTaskResponseBodyResult self = new CreateAsyncTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAsyncTaskResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateAsyncTaskResponseBodyResult setDataId(Integer dataId) {
            this.dataId = dataId;
            return this;
        }
        public Integer getDataId() {
            return this.dataId;
        }

        public CreateAsyncTaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAsyncTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAsyncTaskResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateAsyncTaskResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public CreateAsyncTaskResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public CreateAsyncTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAsyncTaskResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
