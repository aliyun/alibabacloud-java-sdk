// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ClearDedicatedHostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    public static ClearDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearDedicatedHostResponse self = new ClearDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

}
