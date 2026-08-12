// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionNumberResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Successful.</li>
     * <li><strong>Others (400, 500)</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of pending items.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The message.</p>
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
     * <p>2E130B0F-9E69-52FA-84FC-187FE1BA9489</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSecuritySuggestionNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionNumberResponseBody self = new GetSecuritySuggestionNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecuritySuggestionNumberResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public GetSecuritySuggestionNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecuritySuggestionNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecuritySuggestionNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
