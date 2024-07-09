// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>5809</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>250E2C38-D0AD-4518-851D-1C1055805F82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateZoneRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordResponseBody self = new UpdateZoneRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
