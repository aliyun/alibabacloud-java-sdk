// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeModelDetailsByIdResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribeModelDetailsByIdResponseBodyResultObject> resultObject;

    public static DescribeModelDetailsByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelDetailsByIdResponseBody self = new DescribeModelDetailsByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelDetailsByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelDetailsByIdResponseBody setResultObject(java.util.List<DescribeModelDetailsByIdResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeModelDetailsByIdResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeModelDetailsByIdResponseBodyResultObject extends TeaModel {
        /**
         * <p>Model prediction result.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AUC\&quot;:0.9895246624946594,\&quot;Count\&quot;:2489,\&quot;DecisionMark\&quot;:[0.0,0.0010000000474974513,0.05287817938420348,0.0]}</p>
         */
        @NameInMap("modelEffectEvaluation")
        public String modelEffectEvaluation;

        public static DescribeModelDetailsByIdResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelDetailsByIdResponseBodyResultObject self = new DescribeModelDetailsByIdResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeModelDetailsByIdResponseBodyResultObject setModelEffectEvaluation(String modelEffectEvaluation) {
            this.modelEffectEvaluation = modelEffectEvaluation;
            return this;
        }
        public String getModelEffectEvaluation() {
            return this.modelEffectEvaluation;
        }

    }

}
