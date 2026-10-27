// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use different tokens for different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li>true: Only prechecks the request and does not perform the actual operation.</li>
     * <li>false: Performs the actual operation.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The switch configuration for the EDR module.</p>
     */
    @NameInMap("EdrModuleSwitch")
    public ModifyPostPayModuleSwitchRequestEdrModuleSwitch edrModuleSwitch;

    /**
     * <p>Specifies whether to automatically bind new assets to the host and container protection feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPaidHostAutoBind")
    public Integer postPaidHostAutoBind;

    /**
     * <p>The edition to which new assets are automatically bound for host and container protection. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Premium Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition</li>
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
     * <p>The switch status of the pay-as-you-go modules. The value is a JSON string. Valid values:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: Vulnerability fixing module</li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management module</li>
     * <li><strong>AGENTLESS</strong>: Agentless detection module</li>
     * <li><strong>SERVERLESS</strong>: Serverless security module</li>
     * <li><strong>CTDR</strong>: Cloud Threat Detection and Response module</li>
     * <li><strong>POST_HOST</strong>: Host and container security module</li>
     * <li><strong>SDK</strong>: Malicious file detection SDK module</li>
     * <li><strong>RASP</strong>: Application protection module</li>
     * <li><strong>CTDR_STORAGE</strong>: Log management module</li>
     * <li><strong>ANTI_RANSOMWARE</strong>: Anti-ransomware management</li>
     * </ul>
     * </li>
     * <li>Value: 0 indicates disabled, and 1 indicates enabled.</li>
     * </ul>
     * <blockquote>
     * <p>The values of modules that are not specified remain unchanged.</p>
     * </blockquote>
     * <p><notice>This parameter has the same meaning as the PostPayModuleSwitchObj parameter. If both parameters are specified, the value of PostPayModuleSwitch takes precedence.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1,&quot;CSPM&quot;:0}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>The switch status of the pay-as-you-go modules.</p>
     * <blockquote>
     * <p>Notice: This parameter has the same meaning as the PostPayModuleSwitch parameter. If both parameters are specified, the value of PostPayModuleSwitch takes precedence.</notice></p>
     * </blockquote>
     */
    @NameInMap("PostPayModuleSwitchObj")
    public ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj postPayModuleSwitchObj;

    public static ModifyPostPayModuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPostPayModuleSwitchRequest self = new ModifyPostPayModuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPostPayModuleSwitchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPostPayModuleSwitchRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyPostPayModuleSwitchRequest setEdrModuleSwitch(ModifyPostPayModuleSwitchRequestEdrModuleSwitch edrModuleSwitch) {
        this.edrModuleSwitch = edrModuleSwitch;
        return this;
    }
    public ModifyPostPayModuleSwitchRequestEdrModuleSwitch getEdrModuleSwitch() {
        return this.edrModuleSwitch;
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

    public static class ModifyPostPayModuleSwitchRequestEdrModuleSwitch extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic binding of new assets to the EDR module. Valid values: 0: disabled. 1: enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoBind")
        public Integer autoBind;

        /**
         * <p>The authorized quota for EDR hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EDR_HOST_USAGE")
        public Long EDR_HOST_USAGE;

        public static ModifyPostPayModuleSwitchRequestEdrModuleSwitch build(java.util.Map<String, ?> map) throws Exception {
            ModifyPostPayModuleSwitchRequestEdrModuleSwitch self = new ModifyPostPayModuleSwitchRequestEdrModuleSwitch();
            return TeaModel.build(map, self);
        }

        public ModifyPostPayModuleSwitchRequestEdrModuleSwitch setAutoBind(Integer autoBind) {
            this.autoBind = autoBind;
            return this;
        }
        public Integer getAutoBind() {
            return this.autoBind;
        }

        public ModifyPostPayModuleSwitchRequestEdrModuleSwitch setEDR_HOST_USAGE(Long EDR_HOST_USAGE) {
            this.EDR_HOST_USAGE = EDR_HOST_USAGE;
            return this;
        }
        public Long getEDR_HOST_USAGE() {
            return this.EDR_HOST_USAGE;
        }

    }

    public static class ModifyPostPayModuleSwitchRequestPostPayModuleSwitchObj extends TeaModel {
        /**
         * <p>The Agentless detection module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Agentless")
        public Integer agentless;

        /**
         * <p>The AI digitalization feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiDigital")
        public Integer aiDigital;

        /**
         * <p>The anti-ransomware module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The switch for the basic service module cannot be manually modified. This module is enabled when any other module is enabled, and disabled when all other modules are disabled.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicService")
        public Integer basicService;

        /**
         * <p>The Cloud Security Posture Management module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cspm")
        public Integer cspm;

        /**
         * <p>The Cloud Threat Detection and Response module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sdk")
        public Integer sdk;

        /**
         * <p>The Serverless security module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serverless")
        public Integer serverless;

        /**
         * <p>The vulnerability fixing module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vul")
        public Integer vul;

        /**
         * <p>The file tamper-proofing module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
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
