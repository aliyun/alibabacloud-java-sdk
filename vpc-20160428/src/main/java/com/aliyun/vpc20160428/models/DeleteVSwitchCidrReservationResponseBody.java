// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVSwitchCidrReservationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVSwitchCidrReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchCidrReservationResponseBody self = new DeleteVSwitchCidrReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchCidrReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
