// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplateRulesApplyResultResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("data")
    public java.util.List<DescribeFirewallTemplateRulesApplyResultResponseBodyData> data;

    public static DescribeFirewallTemplateRulesApplyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplateRulesApplyResultResponseBody self = new DescribeFirewallTemplateRulesApplyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplateRulesApplyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallTemplateRulesApplyResultResponseBody setData(java.util.List<DescribeFirewallTemplateRulesApplyResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeFirewallTemplateRulesApplyResultResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeFirewallTemplateRulesApplyResultResponseBodyData extends TeaModel {
        /**
         * <p>The error codes when the firewall template rule fails to be applied.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is displayed when the firewall template rule fails to be applied.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while processing your request.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

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
         * <p>The remarks of the firewall rule.</p>
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

        /**
         * <p>The status of applying the firewall template rule to the simple application servers.</p>
         * <ul>
         * <li>Pending: The template rule does not start to be applied to the simple application servers.</li>
         * <li>Applying: The template rule is being applied to the simple application servers.</li>
         * <li>Success: The template rule is successfully applied to the simple application servers.</li>
         * <li>PartFailed: The template rule fails to be applied to some simple application servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DescribeFirewallTemplateRulesApplyResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTemplateRulesApplyResultResponseBodyData self = new DescribeFirewallTemplateRulesApplyResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
