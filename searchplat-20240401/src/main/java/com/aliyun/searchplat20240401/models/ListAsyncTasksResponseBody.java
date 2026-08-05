// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListAsyncTasksResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2BA0504F-B179-586D-8210-A7C7C09A9907</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListAsyncTasksResponseBodyResult> result;

    public static ListAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksResponseBody self = new ListAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTasksResponseBody setResult(java.util.List<ListAsyncTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAsyncTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAsyncTasksResponseBodyResult extends TeaModel {
        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1745893195510</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The trial data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1232</p>
         */
        @NameInMap("dataId")
        public Integer dataId;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ae1cea6dc680b98b908a757050c406c9</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
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
         * <ul>
         * <li>document-analyze.</li>
         * </ul>
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
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static ListAsyncTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTasksResponseBodyResult self = new ListAsyncTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAsyncTasksResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListAsyncTasksResponseBodyResult setDataId(Integer dataId) {
            this.dataId = dataId;
            return this;
        }
        public Integer getDataId() {
            return this.dataId;
        }

        public ListAsyncTasksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAsyncTasksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAsyncTasksResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAsyncTasksResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListAsyncTasksResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListAsyncTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAsyncTasksResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
