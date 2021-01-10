// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutInternaltaskscountRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Status")
    public String status;

    public static GetLinkeBahamutInternaltaskscountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutInternaltaskscountRequest self = new GetLinkeBahamutInternaltaskscountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutInternaltaskscountRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutInternaltaskscountRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
