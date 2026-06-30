// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifyFileResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> indicates success. Other values indicate failure. Callers can determine the failure reason using this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Current detection accuracy: Number of incorrect characters in verified files / Total number of characters in verified files.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9485294</p>
     */
    @NameInMap("Data")
    public Float data;

    /**
     * <p>Error details when an error occurs. Successful when successful.</p>
     * 
     * <strong>example:</strong>
     * <p>s</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Callers can determine if the request was successful using this field: true indicates success; false/null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VerifyFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyFileResponseBody self = new VerifyFileResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyFileResponseBody setData(Float data) {
        this.data = data;
        return this;
    }
    public Float getData() {
        return this.data;
    }

    public VerifyFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
