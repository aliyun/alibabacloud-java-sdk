// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchShrinkRequest extends TeaModel {
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
    public String postPayModuleSwitchObjShrink;

    public static ModifyPostPayModuleSwitchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPostPayModuleSwitchShrinkRequest self = new ModifyPostPayModuleSwitchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPostPayModuleSwitchShrinkRequest setPostPaidHostAutoBind(Integer postPaidHostAutoBind) {
        this.postPaidHostAutoBind = postPaidHostAutoBind;
        return this;
    }
    public Integer getPostPaidHostAutoBind() {
        return this.postPaidHostAutoBind;
    }

    public ModifyPostPayModuleSwitchShrinkRequest setPostPaidHostAutoBindVersion(Integer postPaidHostAutoBindVersion) {
        this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
        return this;
    }
    public Integer getPostPaidHostAutoBindVersion() {
        return this.postPaidHostAutoBindVersion;
    }

    public ModifyPostPayModuleSwitchShrinkRequest setPostPayInstanceId(String postPayInstanceId) {
        this.postPayInstanceId = postPayInstanceId;
        return this;
    }
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    public ModifyPostPayModuleSwitchShrinkRequest setPostPayModuleSwitch(String postPayModuleSwitch) {
        this.postPayModuleSwitch = postPayModuleSwitch;
        return this;
    }
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    public ModifyPostPayModuleSwitchShrinkRequest setPostPayModuleSwitchObjShrink(String postPayModuleSwitchObjShrink) {
        this.postPayModuleSwitchObjShrink = postPayModuleSwitchObjShrink;
        return this;
    }
    public String getPostPayModuleSwitchObjShrink() {
        return this.postPayModuleSwitchObjShrink;
    }

}
