// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>58113A95-1858-5674-87E5-192AEE6FD9DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("result")
    public GetAsyncTaskResponseBodyResult result;

    public static GetAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponseBody self = new GetAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncTaskResponseBody setResult(GetAsyncTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAsyncTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAsyncTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729684154</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The playground data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("dataId")
        public Integer dataId;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>taskf90b77d481c47b05c18266a31b6cdbdd</p>
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
         * <p>{}</p>
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
         * <li>PENDING: in progress.</li>
         * <li>SUCCESS: parsing succeeded.</li>
         * <li>FAILED: parsing failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729684154</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static GetAsyncTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncTaskResponseBodyResult self = new GetAsyncTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAsyncTaskResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetAsyncTaskResponseBodyResult setDataId(Integer dataId) {
            this.dataId = dataId;
            return this;
        }
        public Integer getDataId() {
            return this.dataId;
        }

        public GetAsyncTaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAsyncTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAsyncTaskResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAsyncTaskResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetAsyncTaskResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetAsyncTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncTaskResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
