// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> means success. Any other value indicates failure. Use this field to diagnose errors.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadRuleResponseBodyData data;

    /**
     * <p>Error details if the call fails. <strong>successful</strong> if successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request succeeded. Use this field to verify success:</p>
     * <ul>
     * <li><p><strong>true</strong> means success.</p>
     * </li>
     * <li><p>false or <strong>null</strong> means failure.</p>
     * </li>
     * </ul>
     * 
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
