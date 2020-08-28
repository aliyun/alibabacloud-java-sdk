// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateOnlineDatabaseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineDatabaseTaskResponse self = new CreateOnlineDatabaseTaskResponse();
        return TeaModel.build(map, self);
    }

}
