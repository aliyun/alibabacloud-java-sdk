// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchCidrReservationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the reserved CIDR block.</p>
     */
    @NameInMap("VSwitchCidrReservationId")
    public String vSwitchCidrReservationId;

    public static CreateVSwitchCidrReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchCidrReservationResponseBody self = new CreateVSwitchCidrReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchCidrReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVSwitchCidrReservationResponseBody setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
        this.vSwitchCidrReservationId = vSwitchCidrReservationId;
        return this;
    }
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

}
