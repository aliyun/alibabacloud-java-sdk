// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDiskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BE834C8-3C25-5AF8-BE3E-C8A690602A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDiskResponseBody self = new DeleteRCDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
