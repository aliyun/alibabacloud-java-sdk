// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutInternaltasksRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static GetLinkeBahamutInternaltasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutInternaltasksRequest self = new GetLinkeBahamutInternaltasksRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutInternaltasksRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public GetLinkeBahamutInternaltasksRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
