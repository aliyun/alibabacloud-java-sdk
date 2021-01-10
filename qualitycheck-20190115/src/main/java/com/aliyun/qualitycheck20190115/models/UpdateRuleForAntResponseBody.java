// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleForAntResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateRuleForAntResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRuleForAntResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleForAntResponseBody self = new UpdateRuleForAntResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleForAntResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRuleForAntResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleForAntResponseBody setData(UpdateRuleForAntResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRuleForAntResponseBodyData getData() {
        return this.data;
    }

    public UpdateRuleForAntResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRuleForAntResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRuleForAntResponseBodyData extends TeaModel {
        @NameInMap("RidInfo")
        public java.util.List<String> ridInfo;

        public static UpdateRuleForAntResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleForAntResponseBodyData self = new UpdateRuleForAntResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRuleForAntResponseBodyData setRidInfo(java.util.List<String> ridInfo) {
            this.ridInfo = ridInfo;
            return this;
        }
        public java.util.List<String> getRidInfo() {
            return this.ridInfo;
        }

    }

}
