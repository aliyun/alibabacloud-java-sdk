// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRecordResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddZoneRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRecordResponseBody self = new AddZoneRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddZoneRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public AddZoneRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddZoneRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
