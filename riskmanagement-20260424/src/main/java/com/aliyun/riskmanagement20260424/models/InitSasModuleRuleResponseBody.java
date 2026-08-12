// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, refer to error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The approval result.</p>
     */
    @NameInMap("Data")
    public InitSasModuleRuleResponseBodyData data;

    /**
     * <p>The error message. The value is the same as the Code parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
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
     * <p>Indicates whether the call is successful. true: The call is successful. false: The call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InitSasModuleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitSasModuleRuleResponseBody self = new InitSasModuleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitSasModuleRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitSasModuleRuleResponseBody setData(InitSasModuleRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitSasModuleRuleResponseBodyData getData() {
        return this.data;
    }

    public InitSasModuleRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitSasModuleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitSasModuleRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitSasModuleRuleResponseBodyData extends TeaModel {
        /**
         * <p>The Security Center request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14492571-0707-5130-85B4-4DDABB6BDF76</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static InitSasModuleRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitSasModuleRuleResponseBodyData self = new InitSasModuleRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitSasModuleRuleResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
