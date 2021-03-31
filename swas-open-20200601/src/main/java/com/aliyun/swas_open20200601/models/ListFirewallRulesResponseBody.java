// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListFirewallRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FirewallRules")
    public java.util.List<ListFirewallRulesResponseBodyFirewallRules> firewallRules;

    public static ListFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFirewallRulesResponseBody self = new ListFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFirewallRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFirewallRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFirewallRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFirewallRulesResponseBody setFirewallRules(java.util.List<ListFirewallRulesResponseBodyFirewallRules> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }
    public java.util.List<ListFirewallRulesResponseBodyFirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    public static class ListFirewallRulesResponseBodyFirewallRules extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("Port")
        public String port;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        public static ListFirewallRulesResponseBodyFirewallRules build(java.util.Map<String, ?> map) throws Exception {
            ListFirewallRulesResponseBodyFirewallRules self = new ListFirewallRulesResponseBodyFirewallRules();
            return TeaModel.build(map, self);
        }

        public ListFirewallRulesResponseBodyFirewallRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListFirewallRulesResponseBodyFirewallRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListFirewallRulesResponseBodyFirewallRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListFirewallRulesResponseBodyFirewallRules setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

    }

}
