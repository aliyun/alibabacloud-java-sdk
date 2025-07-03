// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppAgentTemplateResponseBody extends TeaModel {
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
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppAgentTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAgentTemplateResponseBody self = new DeleteAppAgentTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppAgentTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAppAgentTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
