// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EndDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndDialogueResponseBody self = new EndDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public EndDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
