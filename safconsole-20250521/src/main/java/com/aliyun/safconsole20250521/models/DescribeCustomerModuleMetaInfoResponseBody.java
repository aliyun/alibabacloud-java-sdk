// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleMetaInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>055f1546-f465-4c92-a2da-bfb86abe6f56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeCustomerModuleMetaInfoResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomerModuleMetaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleMetaInfoResponseBody self = new DescribeCustomerModuleMetaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleMetaInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeCustomerModuleMetaInfoResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeCustomerModuleMetaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerModuleMetaInfoResponseBody setResultObject(DescribeCustomerModuleMetaInfoResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeCustomerModuleMetaInfoResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeCustomerModuleMetaInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <strong>example:</strong>
         * <p>double</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList self = new DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeCustomerModuleMetaInfoResponseBodyResultObject extends TeaModel {
        @NameInMap("FeatureList")
        public java.util.List<DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList> featureList;

        /**
         * <strong>example:</strong>
         * <p>FINANCE_60</p>
         */
        @NameInMap("FeatureTemplate")
        public String featureTemplate;

        public static DescribeCustomerModuleMetaInfoResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerModuleMetaInfoResponseBodyResultObject self = new DescribeCustomerModuleMetaInfoResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObject setFeatureList(java.util.List<DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<DescribeCustomerModuleMetaInfoResponseBodyResultObjectFeatureList> getFeatureList() {
            return this.featureList;
        }

        public DescribeCustomerModuleMetaInfoResponseBodyResultObject setFeatureTemplate(String featureTemplate) {
            this.featureTemplate = featureTemplate;
            return this;
        }
        public String getFeatureTemplate() {
            return this.featureTemplate;
        }

    }

}
