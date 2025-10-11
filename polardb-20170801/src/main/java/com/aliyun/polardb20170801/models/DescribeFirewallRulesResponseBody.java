// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeFirewallRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Data")
    public DescribeFirewallRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>84D7DCD2-54F7-5BD2-B055-F5DE9D2B5264</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
