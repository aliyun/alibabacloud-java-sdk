// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateTestFileResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

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
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public ValidateTestFileResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ValidateTestFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateTestFileResponseBody self = new ValidateTestFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateTestFileResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ValidateTestFileResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ValidateTestFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTestFileResponseBody setResultObject(ValidateTestFileResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ValidateTestFileResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ValidateTestFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateTestFileResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether the test file is valid.</p>
         */
        @NameInMap("FileValid")
        public Boolean fileValid;

        public static ValidateTestFileResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ValidateTestFileResponseBodyResultObject self = new ValidateTestFileResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ValidateTestFileResponseBodyResultObject setFileValid(Boolean fileValid) {
            this.fileValid = fileValid;
            return this;
        }
        public Boolean getFileValid() {
            return this.fileValid;
        }

    }

}
