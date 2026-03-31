// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteChatConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Chat configuration deleted successfully.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChatConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatConfigurationResponseBody self = new DeleteChatConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChatConfigurationResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeleteChatConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
