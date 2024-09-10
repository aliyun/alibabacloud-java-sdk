// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetRegistryScanDayNumResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>48483161-F328-5A12-AB78-3EB81F37****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetRegistryScanDayNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRegistryScanDayNumResponseBody self = new SetRegistryScanDayNumResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRegistryScanDayNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
