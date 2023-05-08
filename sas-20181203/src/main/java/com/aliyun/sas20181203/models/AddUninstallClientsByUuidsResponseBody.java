// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUninstallClientsByUuidsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUninstallClientsByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUninstallClientsByUuidsResponseBody self = new AddUninstallClientsByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUninstallClientsByUuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
