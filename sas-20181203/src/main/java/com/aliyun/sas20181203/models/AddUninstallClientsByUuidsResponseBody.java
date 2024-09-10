// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUninstallClientsByUuidsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB483977</p>
     */
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
