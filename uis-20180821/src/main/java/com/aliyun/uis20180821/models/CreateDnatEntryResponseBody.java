// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateDnatEntryResponseBody extends TeaModel {
    @NameInMap("UisDnatId")
    public String uisDnatId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDnatEntryResponseBody self = new CreateDnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDnatEntryResponseBody setUisDnatId(String uisDnatId) {
        this.uisDnatId = uisDnatId;
        return this;
    }
    public String getUisDnatId() {
        return this.uisDnatId;
    }

    public CreateDnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
