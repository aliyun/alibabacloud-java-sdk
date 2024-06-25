// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMaskingRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("Data")
    public DescribeMaskingRulesResponseBodyData data;

    /**
     * <p>The message that is returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, Successful is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F83D131-1C18-4599-889D-729A9D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid value:</p>
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

    public static DescribeMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaskingRulesResponseBody self = new DescribeMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaskingRulesResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMaskingRulesResponseBody setData(DescribeMaskingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMaskingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeMaskingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMaskingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMaskingRulesResponseBodyData extends TeaModel {
        /**
         * <p>Details about the masking rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<String> ruleList;

        @NameInMap("RuleVersion")
        public String ruleVersion;

        public static DescribeMaskingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaskingRulesResponseBodyData self = new DescribeMaskingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMaskingRulesResponseBodyData setRuleList(java.util.List<String> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<String> getRuleList() {
            return this.ruleList;
        }

        public DescribeMaskingRulesResponseBodyData setRuleVersion(String ruleVersion) {
            this.ruleVersion = ruleVersion;
            return this;
        }
        public String getRuleVersion() {
            return this.ruleVersion;
        }

    }

}
