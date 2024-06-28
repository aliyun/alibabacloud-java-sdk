// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchCidrReservationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the reserved CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>vcr-bp1m12saqteraw3rp****</p>
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
