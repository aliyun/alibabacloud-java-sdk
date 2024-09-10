// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulAutoRepairConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB48****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVulAutoRepairConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulAutoRepairConfigResponseBody self = new DeleteVulAutoRepairConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVulAutoRepairConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
