// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FCDC80EA-363C-41*****B8-0DF14033D643</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIImageInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIImageInfosResponseBody self = new DeleteAIImageInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIImageInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
