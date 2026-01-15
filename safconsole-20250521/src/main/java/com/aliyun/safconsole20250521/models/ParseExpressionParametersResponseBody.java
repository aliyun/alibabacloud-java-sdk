// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ParseExpressionParametersResponseBody extends TeaModel {
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
    public ParseExpressionParametersResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ParseExpressionParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseExpressionParametersResponseBody self = new ParseExpressionParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseExpressionParametersResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ParseExpressionParametersResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ParseExpressionParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseExpressionParametersResponseBody setResultObject(ParseExpressionParametersResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ParseExpressionParametersResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ParseExpressionParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ParseExpressionParametersResponseBodyResultObject extends TeaModel {
        @NameInMap("Params")
        public java.util.List<String> params;

        public static ParseExpressionParametersResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ParseExpressionParametersResponseBodyResultObject self = new ParseExpressionParametersResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ParseExpressionParametersResponseBodyResultObject setParams(java.util.List<String> params) {
            this.params = params;
            return this;
        }
        public java.util.List<String> getParams() {
            return this.params;
        }

    }

}
