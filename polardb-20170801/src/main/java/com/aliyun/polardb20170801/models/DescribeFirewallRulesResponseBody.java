// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeFirewallRulesResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public DescribeFirewallRulesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84D7DCD2-54F7-5BD2-B055-F5DE9D2B5264</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallRulesResponseBody self = new DescribeFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallRulesResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeFirewallRulesResponseBody setData(DescribeFirewallRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeFirewallRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeFirewallRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFirewallRulesResponseBodyData extends TeaModel {
        /**
         * <p>The list of firewall rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<String> ruleList;

        public static DescribeFirewallRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallRulesResponseBodyData self = new DescribeFirewallRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallRulesResponseBodyData setRuleList(java.util.List<String> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<String> getRuleList() {
            return this.ruleList;
        }

    }

}
