// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetBuildRiskDefineRuleConfigResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public SetBuildRiskDefineRuleConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>BA674E4B-00CF-5DEA-8B92-360862FB5133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetBuildRiskDefineRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBuildRiskDefineRuleConfigResponseBody self = new SetBuildRiskDefineRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBuildRiskDefineRuleConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetBuildRiskDefineRuleConfigResponseBody setData(SetBuildRiskDefineRuleConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetBuildRiskDefineRuleConfigResponseBodyData getData() {
        return this.data;
    }

    public SetBuildRiskDefineRuleConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetBuildRiskDefineRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetBuildRiskDefineRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetBuildRiskDefineRuleConfigResponseBodyData extends TeaModel {
        /**
         * <p>The configuration ID for scanning image build command risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        public static SetBuildRiskDefineRuleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetBuildRiskDefineRuleConfigResponseBodyData self = new SetBuildRiskDefineRuleConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetBuildRiskDefineRuleConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
