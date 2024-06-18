// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21383BB3-3845-4628-B422-B4FB5C83DEBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySQLCollectorRetentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorRetentionResponseBody self = new ModifySQLCollectorRetentionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
