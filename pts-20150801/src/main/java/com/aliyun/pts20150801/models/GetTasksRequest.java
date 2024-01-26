// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetTasksRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static GetTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTasksRequest self = new GetTasksRequest();
        return TeaModel.build(map, self);
    }

    public GetTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
