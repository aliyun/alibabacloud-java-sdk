// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionRequest extends TeaModel {
    /**
     * <p>The document of the policy. The document can be up to 6,144 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:[&quot;oss:<em>&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Resource&quot;:[&quot;acs:oss:</em>:<em>:</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The rotation strategy of the policy. The rotation strategy can be used to delete an early policy version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>None</code>: disables the rotation strategy.</li>
     * <li><code>DeleteOldestNonDefaultVersionWhenLimitExceeded</code>: deletes the earliest non-active version if the number of versions exceeds the limit.</li>
     * </ul>
     * <p>Default value: <code>None</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("RotateStrategy")
    public String rotateStrategy;

    /**
     * <p>Specifies whether to set this policy as the default policy. Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SetAsDefault")
    public Boolean setAsDefault;

    public static CreatePolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionRequest self = new CreatePolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreatePolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyVersionRequest setRotateStrategy(String rotateStrategy) {
        this.rotateStrategy = rotateStrategy;
        return this;
    }
    public String getRotateStrategy() {
        return this.rotateStrategy;
    }

    public CreatePolicyVersionRequest setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

}
