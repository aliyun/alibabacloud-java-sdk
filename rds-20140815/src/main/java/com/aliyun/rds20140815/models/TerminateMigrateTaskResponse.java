// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TerminateMigrateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TerminateMigrateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateMigrateTaskResponse self = new TerminateMigrateTaskResponse();
        return TeaModel.build(map, self);
    }

}
