// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneLaboratoryResponseBody extends TeaModel {
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneLaboratoryResponseBody self = new CloneLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneLaboratoryResponseBody setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public CloneLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
