// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchRequest extends TeaModel {
    /**
     * <p>The ID of the pay-as-you-go instance. This parameter is required.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/421770.html">DescribeVersionConfig</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>The switch status of the pay-as-you-go module. The value is a JSON string. Valid values:</p>
     * <ul>
     * <li><p>Key:</p>
     * <ul>
     * <li><strong>VUL</strong>: vulnerability fixing module</li>
     * <li><strong>CSPM</strong>: cloud service configuration check module</li>
     * <li><strong>AGENTLESS</strong>: agentless detection module</li>
     * <li><strong>SERVERLESS</strong>: serverless asset module</li>
     * </ul>
     * </li>
     * <li><p>Value: A value of 0 specifies disabled. A value of 1 specifies enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify a value for a module, the original value of the module is retained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1,&quot;CSPM&quot;:0}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    public static ModifyPostPayModuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPostPayModuleSwitchRequest self = new ModifyPostPayModuleSwitchRequest();
        return TeaModel.build(map, self);
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

}
