// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFeatureTemplateListResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribeFeatureTemplateListResponseBodyResultObject> resultObject;

    /**
     * <p>Success flag</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFeatureTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureTemplateListResponseBody self = new DescribeFeatureTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureTemplateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFeatureTemplateListResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFeatureTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFeatureTemplateListResponseBody setResultObject(java.util.List<DescribeFeatureTemplateListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeFeatureTemplateListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeFeatureTemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFeatureTemplateListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Parameter label.</p>
         * 
         * <strong>example:</strong>
         * <p>51维特征</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Label value.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE_51</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFeatureTemplateListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFeatureTemplateListResponseBodyResultObject self = new DescribeFeatureTemplateListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFeatureTemplateListResponseBodyResultObject setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeFeatureTemplateListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
