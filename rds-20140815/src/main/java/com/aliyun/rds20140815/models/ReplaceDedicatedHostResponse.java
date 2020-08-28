// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    public static ReplaceDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostResponse self = new ReplaceDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

}
