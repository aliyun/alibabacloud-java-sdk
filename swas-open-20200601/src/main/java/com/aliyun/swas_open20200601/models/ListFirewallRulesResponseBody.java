// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListFirewallRulesResponseBody extends TeaModel {
    /**
     * <p>Details of the firewall rules.</p>
     */
    @NameInMap("FirewallRules")
    public java.util.List<ListFirewallRulesResponseBodyFirewallRules> firewallRules;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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

    public static class ListFirewallRulesResponseBodyFirewallRulesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFirewallRulesResponseBodyFirewallRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ListFirewallRulesResponseBodyFirewallRulesTags self = new ListFirewallRulesResponseBodyFirewallRulesTags();
            return TeaModel.build(map, self);
        }

        public ListFirewallRulesResponseBodyFirewallRulesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFirewallRulesResponseBodyFirewallRulesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFirewallRulesResponseBodyFirewallRules extends TeaModel {
        /**
         * <p>The firewall policy. Valid values:</p>
         * <ul>
         * <li>accept: Access is allowed.</li>
         * <li>drop: Access is refused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The remarks of the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>eeea34d9867b4d55a4ff8d5fcfbd****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The transport layer protocol. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>TCP+UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The tags of the firewall rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListFirewallRulesResponseBodyFirewallRulesTags> tags;

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

        public ListFirewallRulesResponseBodyFirewallRules setTags(java.util.List<ListFirewallRulesResponseBodyFirewallRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListFirewallRulesResponseBodyFirewallRulesTags> getTags() {
            return this.tags;
        }

    }

}
