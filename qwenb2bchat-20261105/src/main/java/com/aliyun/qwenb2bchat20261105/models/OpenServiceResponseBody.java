// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class OpenServiceResponseBody extends TeaModel {
    /**
     * <p>The details of a non-2xx error response, which are mutually exclusive with the status, orderId, and spInstanceId of a normal response.</p>
     */
    @NameInMap("error")
    public OpenServiceResponseBodyError error;

    /**
     * <p>The order ID associated with the service activation process. Returned when an order exists.</p>
     * 
     * <strong>example:</strong>
     * <p>order-example-001</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The service instance ID returned after successful activation and settlement.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-example-001</p>
     */
    @NameInMap("spInstanceId")
    public String spInstanceId;

    /**
     * <p>The test or activation result. TEST_OK indicates that the call validation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST_OK</p>
     */
    @NameInMap("status")
    public String status;

    public static OpenServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceResponseBody self = new OpenServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenServiceResponseBody setError(OpenServiceResponseBodyError error) {
        this.error = error;
        return this;
    }
    public OpenServiceResponseBodyError getError() {
        return this.error;
    }

    public OpenServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenServiceResponseBody setSpInstanceId(String spInstanceId) {
        this.spInstanceId = spInstanceId;
        return this;
    }
    public String getSpInstanceId() {
        return this.spInstanceId;
    }

    public OpenServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class OpenServiceResponseBodyError extends TeaModel {
        /**
         * <p>The error code recognizable by programs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid request</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The correlation ID of the current call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open-service-001</p>
         */
        @NameInMap("request_id")
        public String requestId;

        public static OpenServiceResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            OpenServiceResponseBodyError self = new OpenServiceResponseBodyError();
            return TeaModel.build(map, self);
        }

        public OpenServiceResponseBodyError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public OpenServiceResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public OpenServiceResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
