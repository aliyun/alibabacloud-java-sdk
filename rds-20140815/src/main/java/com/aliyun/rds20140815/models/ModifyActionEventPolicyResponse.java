// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EnableEventLog")
    @Validation(required = true)
    public String enableEventLog;

    public static ModifyActionEventPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventPolicyResponse self = new ModifyActionEventPolicyResponse();
        return TeaModel.build(map, self);
    }

}
