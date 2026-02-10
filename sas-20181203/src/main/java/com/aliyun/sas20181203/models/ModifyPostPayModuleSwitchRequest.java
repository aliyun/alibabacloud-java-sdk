// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchRequest extends TeaModel {
    /**
     * <p>Automatic binding switch for new assets in host and container protection. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Off</li>
     * <li><strong>1</strong>: On</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPaidHostAutoBind")
    public Integer postPaidHostAutoBind;

    /**
     * <p>Version for automatic binding of new assets in host and container protection. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Antivirus Edition    </li>
     * <li><strong>7</strong>: Flagship Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PostPaidHostAutoBindVersion")
    public Integer postPaidHostAutoBindVersion;

    /**
     * <p>Pay-as-you-go instance ID, which must be filled in.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeVersionConfig~~">DescribeVersionConfig</a> interface to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>Status of the pay-as-you-go module switch, in JsonString format. Values:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: Vulnerability Repair Module</li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management Module</li>
     * <li><strong>AGENTLESS</strong>: Agentless Detection Module</li>
     * <li><strong>SERVERLESS</strong>: Serverless Security Module</li>
     * <li><strong>CTDR</strong>: Threat Analysis and Response Module</li>
     * <li><strong>POST_HOST</strong>: Host and Container Security Module</li>
     * <li><strong>SDK</strong>: Malicious File Detection SDK Module</li>
     * <li><strong>RASP</strong>: Application Protection Module</li>
     * <li><strong>CTDR_STORAGE</strong>: Log Management Module</li>
     * <li><strong>ANTI_RANSOMWARE</strong>: Anti-Ransomware Management</li>
     * </ul>
     * </li>
     * <li>Value: 0 means off, 1 means on</li>
     * </ul>
     * <blockquote>
     * <p>The values of modules not passed will not change.</p>
     * </blockquote>
     * <p><notice>The meaning is the same as the PostPayModuleSwitchObj field. When both exist, the value of PostPayModuleSwitch takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1,&quot;CSPM&quot;:0}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>Pay-as-you-go module switch.</p>
     * <blockquote>
     * <p>Notice:  The meaning is the same as the PostPayModuleSwitch field. When both exist, the value of PostPayModuleSwitch takes precedence.</p>
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
         * <p>Agentless Detection Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Agentless")
        public Integer agentless;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiDigital")
        public Integer aiDigital;

        /**
         * <p>Anti-Ransomware Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AntiRansomware")
        public Integer antiRansomware;

        /**
         * <p>Basic service module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The basic service module switch does not support active modification. When other modules are on, this module is also on. If all other modules are off, then this module is off.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicService")
        public Integer basicService;

        /**
         * <p>Cloud Security Configuration Check Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cspm")
        public Integer cspm;

        /**
         * <p>Threat Analysis and Response Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ctdr")
        public Integer ctdr;

        /**
         * <p>Log Management Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CtdrStorage")
        public Integer ctdrStorage;

        /**
         * <p>Host and Container Security Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostHost")
        public Integer postHost;

        /**
         * <p>Application Protection Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rasp")
        public Integer rasp;

        /**
         * <p>Malicious File Detection SDK Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sdk")
        public Integer sdk;

        /**
         * <p>Serverless Security Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serverless")
        public Integer serverless;

        /**
         * <p>Vulnerability Repair Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vul")
        public Integer vul;

        /**
         * <p>File Tamper Protection Module. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
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
