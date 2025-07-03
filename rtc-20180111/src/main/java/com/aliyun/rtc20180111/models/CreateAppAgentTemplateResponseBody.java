// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1223131213231313213</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppAgentTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAgentTemplateResponseBody self = new CreateAppAgentTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppAgentTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAppAgentTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
