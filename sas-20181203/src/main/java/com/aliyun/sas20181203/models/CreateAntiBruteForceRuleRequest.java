// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to set the defense rule as the default rule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DefaultRule")
    public Boolean defaultRule;

    /**
     * <p>The maximum number of failed logon attempts from an account. Valid values: 2, 3, 4, 5, 10, 50, 80, and 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:</p>
     * <ul>
     * <li><strong>5</strong></li>
     * <li><strong>15</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>60</strong></li>
     * <li><strong>120</strong></li>
     * <li><strong>360</strong></li>
     * <li><strong>720</strong></li>
     * <li><strong>1440</strong></li>
     * <li><strong>10080</strong></li>
     * <li><strong>52560000</strong>: permanent</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ForbiddenTime")
    public Integer forbiddenTime;

    /**
     * <p>The name of the defense rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestAntiBruteForceRule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The types of protocols supported for interception by the brute force attack rule creation.</p>
     */
    @NameInMap("ProtocolType")
    public CreateAntiBruteForceRuleRequestProtocolType protocolType;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The maximum period of time during which failed logon attempts from an account can occur. Unit: minutes. Valid values:</p>
     * <ul>
     * <li><strong>1</strong></li>
     * <li><strong>2</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>10</strong></li>
     * <li><strong>15</strong></li>
     * </ul>
     * <blockquote>
     * <p> To configure a defense rule, you must specify the Span, FailCount, and ForbiddenTime parameters. If the number of failed logon attempts from an account within the minutes specified by Span exceeds the value specified by FailCount, the account cannot be used for logons within the minutes specified by ForbiddenTime.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Span")
    public Integer span;

    /**
     * <p>The UUIDs of the servers to which you want to apply the defense rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiBruteForceRuleRequest self = new CreateAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntiBruteForceRuleRequest setDefaultRule(Boolean defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    public CreateAntiBruteForceRuleRequest setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public CreateAntiBruteForceRuleRequest setForbiddenTime(Integer forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
        return this;
    }
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    public CreateAntiBruteForceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntiBruteForceRuleRequest setProtocolType(CreateAntiBruteForceRuleRequestProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public CreateAntiBruteForceRuleRequestProtocolType getProtocolType() {
        return this.protocolType;
    }

    public CreateAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateAntiBruteForceRuleRequest setSpan(Integer span) {
        this.span = span;
        return this;
    }
    public Integer getSpan() {
        return this.span;
    }

    public CreateAntiBruteForceRuleRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class CreateAntiBruteForceRuleRequestProtocolType extends TeaModel {
        /**
         * <p>Whether to enable RDP interception, default is on. Values: </p>
         * <ul>
         * <li><strong>on</strong>: Enable </li>
         * <li><strong>off</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Rdp")
        public String rdp;

        /**
         * <p>Whether to enable the SqlServer interception method, default is off. Values: </p>
         * <ul>
         * <li><strong>on</strong>: Enable </li>
         * <li><strong>off</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SqlServer")
        public String sqlServer;

        /**
         * <p>Whether to enable SSH interception, default is on. Values: </p>
         * <ul>
         * <li><strong>on</strong>: Enable </li>
         * <li><strong>off</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Ssh")
        public String ssh;

        public static CreateAntiBruteForceRuleRequestProtocolType build(java.util.Map<String, ?> map) throws Exception {
            CreateAntiBruteForceRuleRequestProtocolType self = new CreateAntiBruteForceRuleRequestProtocolType();
            return TeaModel.build(map, self);
        }

        public CreateAntiBruteForceRuleRequestProtocolType setRdp(String rdp) {
            this.rdp = rdp;
            return this;
        }
        public String getRdp() {
            return this.rdp;
        }

        public CreateAntiBruteForceRuleRequestProtocolType setSqlServer(String sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public String getSqlServer() {
            return this.sqlServer;
        }

        public CreateAntiBruteForceRuleRequestProtocolType setSsh(String ssh) {
            this.ssh = ssh;
            return this;
        }
        public String getSsh() {
            return this.ssh;
        }

    }

}
