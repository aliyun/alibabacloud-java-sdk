// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D53303DB-AA68-5D09-90C2-A345072DCC5A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordStatusResponseBody self = new ModifyAppRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
