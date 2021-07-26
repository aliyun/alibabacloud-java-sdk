// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentContentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Version")
    public Long version;

    public static UpdateExperimentContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentContentResponseBody self = new UpdateExperimentContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentContentResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
