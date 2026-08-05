// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteExperienceDataResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>65C620DA-D6BE-5F56-BBCD-6F2282BB7BAD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteExperienceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperienceDataResponseBody self = new DeleteExperienceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperienceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
