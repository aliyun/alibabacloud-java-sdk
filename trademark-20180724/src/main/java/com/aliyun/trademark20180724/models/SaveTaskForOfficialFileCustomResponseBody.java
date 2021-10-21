// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTaskForOfficialFileCustomResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SaveTaskForOfficialFileCustomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForOfficialFileCustomResponseBody self = new SaveTaskForOfficialFileCustomResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForOfficialFileCustomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveTaskForOfficialFileCustomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
