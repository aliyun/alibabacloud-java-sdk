// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitSasModuleRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
