// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EnableEventLog")
    @Validation(required = true)
    public String enableEventLog;

    public static DescribeActionEventPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActionEventPolicyResponse self = new DescribeActionEventPolicyResponse();
        return TeaModel.build(map, self);
    }

}
