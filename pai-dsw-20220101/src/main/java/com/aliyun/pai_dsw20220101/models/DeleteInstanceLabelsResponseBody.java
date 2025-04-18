// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceLabelsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceLabelsResponseBody self = new DeleteInstanceLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
