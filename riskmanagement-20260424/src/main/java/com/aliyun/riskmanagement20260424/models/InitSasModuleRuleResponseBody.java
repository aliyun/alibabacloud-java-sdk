// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitSasModuleRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2E130B0F-9E69-52FA-84FC-187FE1BA9489</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
