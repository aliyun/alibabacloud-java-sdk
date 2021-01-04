// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordId")
    public Long recordId;

    public static UpdateZoneRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordResponseBody self = new UpdateZoneRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateZoneRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
