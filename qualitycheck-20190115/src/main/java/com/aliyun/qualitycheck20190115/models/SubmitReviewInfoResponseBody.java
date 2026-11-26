// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of 200 indicates success.</p>
     * <blockquote>
     * <p>If the value is not 200, the request failed. You can use this field to determine the cause of the failure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quality inspection score after the review. This field is returned when the review results are saved.</p>
     * 
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error details when an error occurs. The value is <strong>successful</strong> when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <p>You can use this field to determine whether the request is successful:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false or null: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitReviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoResponseBody self = new SubmitReviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitReviewInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitReviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitReviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitReviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
