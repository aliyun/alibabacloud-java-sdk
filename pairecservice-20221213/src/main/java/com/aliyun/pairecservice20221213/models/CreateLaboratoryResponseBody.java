// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateLaboratoryResponseBody extends TeaModel {
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLaboratoryResponseBody self = new CreateLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLaboratoryResponseBody setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public CreateLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
