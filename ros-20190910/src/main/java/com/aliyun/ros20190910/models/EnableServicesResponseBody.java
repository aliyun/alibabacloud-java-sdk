// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServicesResponseBody extends TeaModel {
    @NameInMap("FailedServices")
    public java.util.List<EnableServicesResponseBodyFailedServices> failedServices;

    /**
     * <strong>example:</strong>
     * <p>E1BD3327-6BEE-53AD-8788-D892EB575962</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServicesResponseBody self = new EnableServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServicesResponseBody setFailedServices(java.util.List<EnableServicesResponseBodyFailedServices> failedServices) {
        this.failedServices = failedServices;
        return this;
    }
    public java.util.List<EnableServicesResponseBodyFailedServices> getFailedServices() {
        return this.failedServices;
    }

    public EnableServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnableServicesResponseBodyFailedServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>ACVS</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static EnableServicesResponseBodyFailedServices build(java.util.Map<String, ?> map) throws Exception {
            EnableServicesResponseBodyFailedServices self = new EnableServicesResponseBodyFailedServices();
            return TeaModel.build(map, self);
        }

        public EnableServicesResponseBodyFailedServices setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public EnableServicesResponseBodyFailedServices setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EnableServicesResponseBodyFailedServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
