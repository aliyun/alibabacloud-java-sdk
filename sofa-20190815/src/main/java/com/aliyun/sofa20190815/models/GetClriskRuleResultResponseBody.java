// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Result")
    public String result;

    @NameInMap("Status")
    public String status;

    @NameInMap("Heads")
    public java.util.List<String> heads;

    @NameInMap("Values")
    public java.util.List<GetClriskRuleResultResponseBodyValues> values;

    public static GetClriskRuleResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleResultResponseBody self = new GetClriskRuleResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskRuleResultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskRuleResultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskRuleResultResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetClriskRuleResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClriskRuleResultResponseBody setHeads(java.util.List<String> heads) {
        this.heads = heads;
        return this;
    }
    public java.util.List<String> getHeads() {
        return this.heads;
    }

    public GetClriskRuleResultResponseBody setValues(java.util.List<GetClriskRuleResultResponseBodyValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<GetClriskRuleResultResponseBodyValues> getValues() {
        return this.values;
    }

    public static class GetClriskRuleResultResponseBodyValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetClriskRuleResultResponseBodyValues build(java.util.Map<String, ?> map) throws Exception {
            GetClriskRuleResultResponseBodyValues self = new GetClriskRuleResultResponseBodyValues();
            return TeaModel.build(map, self);
        }

        public GetClriskRuleResultResponseBodyValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
