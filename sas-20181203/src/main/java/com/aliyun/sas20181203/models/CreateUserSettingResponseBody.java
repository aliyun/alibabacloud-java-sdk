// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUserSettingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1EE5AFD-0867-5F4F-9BE1-EBDD2C35****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSettingResponseBody self = new CreateUserSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
