// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleBasicInfoResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>055f1546-f465-4c92-a2da-bfb86abe6f56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeCustomerModuleBasicInfoResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the application configuration information was successfully retrieved. Possible values: true: Success; false: Failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomerModuleBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleBasicInfoResponseBody self = new DescribeCustomerModuleBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleBasicInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomerModuleBasicInfoResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeCustomerModuleBasicInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomerModuleBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerModuleBasicInfoResponseBody setResultObject(DescribeCustomerModuleBasicInfoResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeCustomerModuleBasicInfoResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeCustomerModuleBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomerModuleBasicInfoResponseBodyResultObject extends TeaModel {
        /**
         * <p>Customer model name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        @NameInMap("CustomerModuleName")
        public String customerModuleName;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>备注。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        @NameInMap("InnerModuleName")
        public String innerModuleName;

        /**
         * <p>Module type.</p>
         * 
         * <strong>example:</strong>
         * <p>PMML</p>
         */
        @NameInMap("ModuleType")
        public String moduleType;

        /**
         * <p>Test address.</p>
         * 
         * <strong>example:</strong>
         * <p>model.pmml</p>
         */
        @NameInMap("StorePath")
        public String storePath;

        public static DescribeCustomerModuleBasicInfoResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerModuleBasicInfoResponseBodyResultObject self = new DescribeCustomerModuleBasicInfoResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerModuleBasicInfoResponseBodyResultObject setCustomerModuleName(String customerModuleName) {
            this.customerModuleName = customerModuleName;
            return this;
        }
        public String getCustomerModuleName() {
            return this.customerModuleName;
        }

        public DescribeCustomerModuleBasicInfoResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustomerModuleBasicInfoResponseBodyResultObject setInnerModuleName(String innerModuleName) {
            this.innerModuleName = innerModuleName;
            return this;
        }
        public String getInnerModuleName() {
            return this.innerModuleName;
        }

        public DescribeCustomerModuleBasicInfoResponseBodyResultObject setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

        public DescribeCustomerModuleBasicInfoResponseBodyResultObject setStorePath(String storePath) {
            this.storePath = storePath;
            return this;
        }
        public String getStorePath() {
            return this.storePath;
        }

    }

}
