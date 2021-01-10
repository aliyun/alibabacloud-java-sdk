// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UploadRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static UploadRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadRuleResponseBody self = new UploadRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadRuleResponseBody setData(UploadRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadRuleResponseBodyData getData() {
        return this.data;
    }

    public UploadRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadRuleResponseBodyData extends TeaModel {
        @NameInMap("RidInfo")
        public java.util.List<String> ridInfo;

        public static UploadRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadRuleResponseBodyData self = new UploadRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadRuleResponseBodyData setRidInfo(java.util.List<String> ridInfo) {
            this.ridInfo = ridInfo;
            return this;
        }
        public java.util.List<String> getRidInfo() {
            return this.ridInfo;
        }

    }

}
