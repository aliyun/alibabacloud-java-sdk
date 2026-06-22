// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically bind newly added assets for host and container protection. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPaidHostAutoBind")
    public Integer postPaidHostAutoBind;

    /**
     * <p>The version to which newly added assets are automatically bound for host and container protection. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition. </li>
     * <li><strong>3</strong>: Enterprise Edition.</li>
     * <li><strong>5</strong>: Advanced Edition.</li>
     * <li><strong>6</strong>: Anti-virus Edition.    </li>
     * <li><strong>7</strong>: Ultimate Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PostPaidHostAutoBindVersion")
    public Integer postPaidHostAutoBindVersion;

    /**
     * <p>The pay-as-you-go instance ID. This parameter is required.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeVersionConfig~~">DescribeVersionConfig</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>The switch status of pay-as-you-go modules in JSON string format. Valid values:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: vulnerability fix module</li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management (CSPM) module</li>
     * <li><strong>AGENTLESS</strong>: agentless detection module</li>
     * <li><strong>SERVERLESS</strong>: serverless security module</li>
     * <li><strong>CTDR</strong>: threat detection and response module</li>
     * <li><strong>POST_HOST</strong>: host and container security module</li>
     * <li><strong>SDK</strong>: malicious file detection SDK module</li>
     * <li><strong>RASP</strong>: application protection module</li>
     * <li><strong>CTDR_STORAGE</strong>: log management module</li>
     * <li><strong>ANTI_RANSOMWARE</strong>: anti-ransomware management</li>
     * </ul>
     * </li>
     * <li>Value: 0 indicates disabled. 1 indicates enabled.</li>
     * </ul>
     * <blockquote>
     * <p>Modules for which no value is specified remain unchanged.</p>
     * </blockquote>
     * <p><notice>This parameter has the same meaning as PostPayModuleSwitchObj. If both parameters are specified, the value of PostPayModuleSwitch takes precedence..</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1,&quot;CSPM&quot;:0}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>The pay-as-you-go module switch.</p>
     * <blockquote>
     * <p>Notice: This parameter has the same meaning as PostPayModuleSwitch. If both parameters are specified, the value of PostPayModuleSwitch takes precedence..</p>
     * </blockquote>
     */
    @NameInMap("PostPayModuleSwitchObj")
    public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj postPayModuleSwitchObj;

    public static ModifyPostPayModuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPostPayModuleSwitchRequest self = new ModifyPostPayModuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPostPayModuleSwitchRequest setPostPaidHostAutoBind(Integer postPaidHostAutoBind) {
        this.postPaidHostAutoBind = postPaidHostAutoBind;
        return this;
    }
    public Integer getPostPaidHostAutoBind() {
        return this.postPaidHostAutoBind;
    }

    public ModifyPostPayModuleSwitchRequest setPostPaidHostAutoBindVersion(Integer postPaidHostAutoBindVersion) {
        this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
        return this;
    }
    public Integer getPostPaidHostAutoBindVersion() {
        return this.postPaidHostAutoBindVersion;
    }

    public ModifyPostPayModuleSwitchRequest setPostPayInstanceId(String postPayInstanceId) {
        this.postPayInstanceId = postPayInstanceId;
        return this;
    }
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    public ModifyPostPayModuleSwitchRequest setPostPayModuleSwitch(String postPayModuleSwitch) {
        this.postPayModuleSwitch = postPayModuleSwitch;
        return this;
    }
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    public ModifyPostPayModuleSwitchRequest setPostPayModuleSwitchObj(ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj postPayModuleSwitchObj) {
        this.postPayModuleSwitchObj = postPayModuleSwitchObj;
        return this;
    }
    public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj getPostPayModuleSwitchObj() {
        return this.postPayModuleSwitchObj;
    }

    public static class ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj extends TeaModel {
        /**
         * <p>The agentless detection module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Agentless")
        public Integer agentless;

        /**
         * <p>The AI digitalization module.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiDigital")
        public Integer aiDigital;

        /**
         * <p>The anti-ransomware module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AntiRansomware")
        public Integer antiRansomware;

        /**
         * <p>The basic service module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: shutdown.</li>
         * <li><strong>1</strong>: enabling status.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The basic service module switch cannot be manually modified. This module is in the enabling status when any other module is in the enabling status, and is in the shutdown state only when all other modules are in the shutdown state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicService")
        public Integer basicService;

        /**
         * <p>The cloud security configuration check module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cspm")
        public Integer cspm;

        /**
         * <p>The threat detection and response module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ctdr")
        public Integer ctdr;

        /**
         * <p>The log management module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CtdrStorage")
        public Integer ctdrStorage;

        /**
         * <p>The host and container security module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostHost")
        public Integer postHost;

        /**
         * <p>The application protection module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rasp")
        public Integer rasp;

        /**
         * <p>The malicious file detection SDK module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sdk")
        public Integer sdk;

        /**
         * <p>The serverless security module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serverless")
        public Integer serverless;

        /**
         * <p>The vulnerability fix module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vul")
        public Integer vul;

        /**
         * <p>The tamper-proofing module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WebLock")
        public Integer webLock;

        public static ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj build(java.util.Map<String, ?> map) throws Exception {
            ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj self = new ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj();
            return TeaModel.build(map, self);
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setAgentless(Integer agentless) {
            this.agentless = agentless;
            return this;
        }
        public Integer getAgentless() {
            return this.agentless;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setAiDigital(Integer aiDigital) {
            this.aiDigital = aiDigital;
            return this;
        }
        public Integer getAiDigital() {
            return this.aiDigital;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setAntiRansomware(Integer antiRansomware) {
            this.antiRansomware = antiRansomware;
            return this;
        }
        public Integer getAntiRansomware() {
            return this.antiRansomware;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setBasicService(Integer basicService) {
            this.basicService = basicService;
            return this;
        }
        public Integer getBasicService() {
            return this.basicService;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setCspm(Integer cspm) {
            this.cspm = cspm;
            return this;
        }
        public Integer getCspm() {
            return this.cspm;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setCtdr(Integer ctdr) {
            this.ctdr = ctdr;
            return this;
        }
        public Integer getCtdr() {
            return this.ctdr;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setCtdrStorage(Integer ctdrStorage) {
            this.ctdrStorage = ctdrStorage;
            return this;
        }
        public Integer getCtdrStorage() {
            return this.ctdrStorage;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setPostHost(Integer postHost) {
            this.postHost = postHost;
            return this;
        }
        public Integer getPostHost() {
            return this.postHost;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setRasp(Integer rasp) {
            this.rasp = rasp;
            return this;
        }
        public Integer getRasp() {
            return this.rasp;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setSdk(Integer sdk) {
            this.sdk = sdk;
            return this;
        }
        public Integer getSdk() {
            return this.sdk;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setServerless(Integer serverless) {
            this.serverless = serverless;
            return this;
        }
        public Integer getServerless() {
            return this.serverless;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setVul(Integer vul) {
            this.vul = vul;
            return this;
        }
        public Integer getVul() {
            return this.vul;
        }

        public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj setWebLock(Integer webLock) {
            this.webLock = webLock;
            return this;
        }
        public Integer getWebLock() {
            return this.webLock;
        }

    }

}
