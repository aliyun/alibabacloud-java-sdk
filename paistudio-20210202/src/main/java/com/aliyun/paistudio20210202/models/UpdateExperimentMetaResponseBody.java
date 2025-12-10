// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExperimentMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentMetaResponseBody self = new UpdateExperimentMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
