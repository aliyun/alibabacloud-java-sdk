// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DeleteScreenSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScreenSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScreenSettingResponseBody self = new DeleteScreenSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScreenSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
