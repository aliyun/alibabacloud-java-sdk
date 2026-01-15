// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelFeatureResponseBody extends TeaModel {
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
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public java.util.List<DescribeModelFeatureResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelFeatureResponseBody self = new DescribeModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelFeatureResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeModelFeatureResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelFeatureResponseBody setResultObject(java.util.List<DescribeModelFeatureResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeModelFeatureResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeModelFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeModelFeatureResponseBodyResultObject extends TeaModel {
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

        public static DescribeModelFeatureResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelFeatureResponseBodyResultObject self = new DescribeModelFeatureResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeModelFeatureResponseBodyResultObject setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeModelFeatureResponseBodyResultObject setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public DescribeModelFeatureResponseBodyResultObject setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public DescribeModelFeatureResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
