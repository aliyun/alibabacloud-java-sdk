// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadRuleResponseBody self = new UploadRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadRuleResponseBody setData(UploadRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadRuleResponseBodyData getData() {
        return this.data;
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
