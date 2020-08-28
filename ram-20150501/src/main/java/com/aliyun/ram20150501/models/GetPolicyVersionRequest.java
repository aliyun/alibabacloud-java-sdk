// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("VersionId")
    public String versionId;

    public static GetPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionRequest self = new GetPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

}
