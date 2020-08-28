// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetStackPolicyRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    public static SetStackPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStackPolicyRequest self = new SetStackPolicyRequest();
        return TeaModel.build(map, self);
    }

}
