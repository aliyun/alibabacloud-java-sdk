// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("Description")
    public String description;

    @NameInMap("PolicyDocument")
    public String policyDocument;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

}
