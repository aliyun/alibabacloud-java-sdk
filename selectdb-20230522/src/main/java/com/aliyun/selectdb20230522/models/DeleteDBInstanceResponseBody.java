// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BD0D0B17-C145-5B91-BFC2-6791927EE973</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponseBody self = new DeleteDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
