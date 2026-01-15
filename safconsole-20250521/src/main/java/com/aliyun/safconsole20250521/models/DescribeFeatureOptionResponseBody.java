// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFeatureOptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

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
    public java.util.List<DescribeFeatureOptionResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFeatureOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureOptionResponseBody self = new DescribeFeatureOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureOptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFeatureOptionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFeatureOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFeatureOptionResponseBody setResultObject(java.util.List<DescribeFeatureOptionResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeFeatureOptionResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeFeatureOptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFeatureOptionResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        public static DescribeFeatureOptionResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFeatureOptionResponseBodyResultObject self = new DescribeFeatureOptionResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFeatureOptionResponseBodyResultObject setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

    }

}
