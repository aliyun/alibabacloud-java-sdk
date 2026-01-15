// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateModelFileResponseBody extends TeaModel {
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
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public ValidateModelFileResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ValidateModelFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateModelFileResponseBody self = new ValidateModelFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateModelFileResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ValidateModelFileResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ValidateModelFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateModelFileResponseBody setResultObject(ValidateModelFileResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ValidateModelFileResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ValidateModelFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateModelFileResponseBodyResultObject extends TeaModel {
        /**
         * <p>Validation result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FileValid")
        public Boolean fileValid;

        public static ValidateModelFileResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ValidateModelFileResponseBodyResultObject self = new ValidateModelFileResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ValidateModelFileResponseBodyResultObject setFileValid(Boolean fileValid) {
            this.fileValid = fileValid;
            return this;
        }
        public Boolean getFileValid() {
            return this.fileValid;
        }

    }

}
