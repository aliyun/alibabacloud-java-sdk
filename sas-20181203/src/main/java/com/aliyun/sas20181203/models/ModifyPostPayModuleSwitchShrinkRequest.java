// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchShrinkRequest extends TeaModel {
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
