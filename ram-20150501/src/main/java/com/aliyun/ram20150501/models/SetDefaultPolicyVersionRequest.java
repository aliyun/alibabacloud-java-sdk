// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("VersionId")
    public String versionId;

    public static SetDefaultPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionRequest self = new SetDefaultPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

}
