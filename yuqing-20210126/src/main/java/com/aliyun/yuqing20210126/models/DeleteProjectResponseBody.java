// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class DeleteProjectResponseBody extends TeaModel {
    // 被删除的项目id
    @NameInMap("id")
    public Long id;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectResponseBody self = new DeleteProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
