// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateResponseBody extends TeaModel {
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
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppAgentTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentTemplateResponseBody self = new ModifyAppAgentTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyAppAgentTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
