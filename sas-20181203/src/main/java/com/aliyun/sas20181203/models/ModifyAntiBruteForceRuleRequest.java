// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether the defense rule against brute-force attacks is set as the default policy in Settings. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The rule is set as the default policy.</p>
     * </li>
     * <li><p><strong>false</strong>: The rule is not set as the default policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DefaultRule")
    public Boolean defaultRule;

    /**
     * <p>The threshold for the number of logon failures. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: 2 times</li>
     * <li><strong>3</strong>: 3 times</li>
     * <li><strong>4</strong>: 4 times</li>
     * <li><strong>5</strong>: 5 times</li>
     * <li><strong>10</strong>: 10 times</li>
     * <li><strong>50</strong>: 50 times</li>
     * <li><strong>80</strong>: 80 times</li>
     * <li><strong>100</strong>: 100 times.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The duration for which logon is prohibited, in minutes. Valid values:</p>
     * <ul>
     * <li><strong>5</strong>: 5 minutes</li>
     * <li><strong>15</strong>: 15 minutes</li>
     * <li><strong>30</strong>: 30 minutes</li>
     * <li><strong>60</strong>: 1 hour</li>
     * <li><strong>120</strong>: 2 hours</li>
     * <li><strong>360</strong>: 6 hours</li>
     * <li><strong>720</strong>: 12 hours</li>
     * <li><strong>1440</strong>: 24 hours</li>
     * <li><strong>10080</strong>: 7 days</li>
     * <li><strong>52560000</strong>: permanent (100 years).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ForbiddenTime")
    public Integer forbiddenTime;

    /**
     * <p>The ID of the defense rule against brute-force attacks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65778</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the defense rule against brute-force attacks.</p>
     * 
     * <strong>example:</strong>
     * <p>TestRule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol types that the defense rule against brute-force attacks supports for interception.</p>
     */
    @NameInMap("ProtocolType")
    public ModifyAntiBruteForceRuleRequestProtocolType protocolType;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The threshold for the period of time during which logon failures are counted, in minutes. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: 1 minute</li>
     * <li><strong>2</strong>: 2 minutes</li>
     * <li><strong>5</strong>: 5 minutes</li>
     * <li><strong>10</strong>: 10 minutes</li>
     * <li><strong>15</strong>: 15 minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Span")
    public Integer span;

    /**
     * <p>The list of servers to which the defense rule against brute-force attacks applies.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid-13213-dasda</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ModifyAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAntiBruteForceRuleRequest self = new ModifyAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAntiBruteForceRuleRequest setDefaultRule(Boolean defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    public ModifyAntiBruteForceRuleRequest setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public ModifyAntiBruteForceRuleRequest setForbiddenTime(Integer forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
        return this;
    }
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    public ModifyAntiBruteForceRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyAntiBruteForceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAntiBruteForceRuleRequest setProtocolType(ModifyAntiBruteForceRuleRequestProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public ModifyAntiBruteForceRuleRequestProtocolType getProtocolType() {
        return this.protocolType;
    }

    public ModifyAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAntiBruteForceRuleRequest setSpan(Integer span) {
        this.span = span;
        return this;
    }
    public Integer getSpan() {
        return this.span;
    }

    public ModifyAntiBruteForceRuleRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class ModifyAntiBruteForceRuleRequestProtocolType extends TeaModel {
        /**
         * <p>Specifies whether to enable RDP interception. This is enabled by default. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Rdp")
        public String rdp;

        /**
         * <p>Specifies whether to enable SqlServer interception. This is disabled by default. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SqlServer")
        public String sqlServer;

        /**
         * <p>Specifies whether to enable SSH interception. This is enabled by default. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Ssh")
        public String ssh;

        public static ModifyAntiBruteForceRuleRequestProtocolType build(java.util.Map<String, ?> map) throws Exception {
            ModifyAntiBruteForceRuleRequestProtocolType self = new ModifyAntiBruteForceRuleRequestProtocolType();
            return TeaModel.build(map, self);
        }

        public ModifyAntiBruteForceRuleRequestProtocolType setRdp(String rdp) {
            this.rdp = rdp;
            return this;
        }
        public String getRdp() {
            return this.rdp;
        }

        public ModifyAntiBruteForceRuleRequestProtocolType setSqlServer(String sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public String getSqlServer() {
            return this.sqlServer;
        }

        public ModifyAntiBruteForceRuleRequestProtocolType setSsh(String ssh) {
            this.ssh = ssh;
            return this;
        }
        public String getSsh() {
            return this.ssh;
        }

    }

}
