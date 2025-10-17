// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccountZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountZonalResponseBody self = new CreateAccountZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
