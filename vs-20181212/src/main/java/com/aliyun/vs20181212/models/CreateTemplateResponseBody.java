// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateTemplateResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponseBody self = new CreateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
