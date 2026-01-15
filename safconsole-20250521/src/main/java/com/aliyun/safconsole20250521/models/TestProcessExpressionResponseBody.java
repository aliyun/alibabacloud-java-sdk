// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestProcessExpressionResponseBody extends TeaModel {
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
    public TestProcessExpressionResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TestProcessExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestProcessExpressionResponseBody self = new TestProcessExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public TestProcessExpressionResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TestProcessExpressionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TestProcessExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestProcessExpressionResponseBody setResultObject(TestProcessExpressionResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public TestProcessExpressionResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public TestProcessExpressionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestProcessExpressionResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Score")
        public Double score;

        public static TestProcessExpressionResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            TestProcessExpressionResponseBodyResultObject self = new TestProcessExpressionResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public TestProcessExpressionResponseBodyResultObject setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

}
