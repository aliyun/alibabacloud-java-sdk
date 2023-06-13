// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListFirewallRulesResponseBody extends TeaModel {
    /**
     * <p>Details about the firewall rules.</p>
     */
    @NameInMap("FirewallRules")
    public java.util.List<ListFirewallRulesResponseBodyFirewallRules> firewallRules;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of firewall rules.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFirewallRulesResponseBody self = new ListFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFirewallRulesResponseBody setFirewallRules(java.util.List<ListFirewallRulesResponseBodyFirewallRules> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }
    public java.util.List<ListFirewallRulesResponseBodyFirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    public ListFirewallRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFirewallRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFirewallRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFirewallRulesResponseBodyFirewallRules extends TeaModel {
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The remarks of the firewall rule.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the firewall rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The transport layer protocol. Valid values:</p>
         * <br>
         * <p>*   TCP: the TCP protocol.</p>
         * <p>*   UDP: the UDP protocol.</p>
         * <p>*   TCP+UDP: the TCP and UDP protocols.</p>
         */
        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static ListFirewallRulesResponseBodyFirewallRules build(java.util.Map<String, ?> map) throws Exception {
            ListFirewallRulesResponseBodyFirewallRules self = new ListFirewallRulesResponseBodyFirewallRules();
            return TeaModel.build(map, self);
        }

        public ListFirewallRulesResponseBodyFirewallRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListFirewallRulesResponseBodyFirewallRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListFirewallRulesResponseBodyFirewallRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
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

        public ListFirewallRulesResponseBodyFirewallRules setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
