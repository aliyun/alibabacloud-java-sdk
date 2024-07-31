// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplatesResponseBody extends TeaModel {
    /**
     * <p>The information about the queried firewall templates.</p>
     */
    @NameInMap("FirewallTemplates")
    public java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplates> firewallTemplates;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFirewallTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplatesResponseBody self = new DescribeFirewallTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplatesResponseBody setFirewallTemplates(java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplates> firewallTemplates) {
        this.firewallTemplates = firewallTemplates;
        return this;
    }
    public java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplates> getFirewallTemplates() {
        return this.firewallTemplates;
    }

    public DescribeFirewallTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFirewallTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFirewallTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules extends TeaModel {
        /**
         * <p>The ID of the firewall template rule.</p>
         * 
         * <strong>example:</strong>
         * <p>eeea34d9867b4d55a4ff8d5fcfbd****</p>
         */
        @NameInMap("FirewallTemplateRuleId")
        public String firewallTemplateRuleId;

        /**
         * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
         * <blockquote>
         * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The remarks of the firewall template rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The transport layer protocol that the rule supports. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>TCP+UDP</li>
         * <li>ICMP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        /**
         * <p>The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>119.145.XX.XX</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules self = new DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules setFirewallTemplateRuleId(String firewallTemplateRuleId) {
            this.firewallTemplateRuleId = firewallTemplateRuleId;
            return this;
        }
        public String getFirewallTemplateRuleId() {
            return this.firewallTemplateRuleId;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class DescribeFirewallTemplatesResponseBodyFirewallTemplates extends TeaModel {
        /**
         * <p>The time when the firewall template was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-04-29T02:01:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the firewall template was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-10T02:10:14Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>ft-bcf1a7hrdq717****</p>
         */
        @NameInMap("FirewallTemplateId")
        public String firewallTemplateId;

        /**
         * <p>The details of the firewall template rules.</p>
         */
        @NameInMap("FirewallTemplateRules")
        public java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules> firewallTemplateRules;

        /**
         * <p>The name of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFirewallTemplatesResponseBodyFirewallTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTemplatesResponseBodyFirewallTemplates self = new DescribeFirewallTemplatesResponseBodyFirewallTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setFirewallTemplateId(String firewallTemplateId) {
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }
        public String getFirewallTemplateId() {
            return this.firewallTemplateId;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setFirewallTemplateRules(java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules> firewallTemplateRules) {
            this.firewallTemplateRules = firewallTemplateRules;
            return this;
        }
        public java.util.List<DescribeFirewallTemplatesResponseBodyFirewallTemplatesFirewallTemplateRules> getFirewallTemplateRules() {
            return this.firewallTemplateRules;
        }

        public DescribeFirewallTemplatesResponseBodyFirewallTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
