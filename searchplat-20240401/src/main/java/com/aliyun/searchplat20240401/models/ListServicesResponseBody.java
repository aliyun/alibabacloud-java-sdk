// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2423C841-91C4-5E51-B296-590D367967FC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task execution result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListServicesResponseBodyResult> result;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setResult(java.util.List<ListServicesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListServicesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListServicesResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method.</p>
         */
        @NameInMap("chargeWay")
        public java.util.List<String> chargeWay;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;maxTokens&quot;: 512
         *         }</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>文本向量化</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-text-embedding-001</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding</p>
         */
        @NameInMap("serviceType")
        public String serviceType;

        public static ListServicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyResult self = new ListServicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyResult setChargeWay(java.util.List<String> chargeWay) {
            this.chargeWay = chargeWay;
            return this;
        }
        public java.util.List<String> getChargeWay() {
            return this.chargeWay;
        }

        public ListServicesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServicesResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListServicesResponseBodyResult setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListServicesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
