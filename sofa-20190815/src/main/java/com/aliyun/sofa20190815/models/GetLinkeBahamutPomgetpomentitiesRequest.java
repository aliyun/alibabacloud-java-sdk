// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPomgetpomentitiesRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutPomgetpomentitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPomgetpomentitiesRequest self = new GetLinkeBahamutPomgetpomentitiesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPomgetpomentitiesRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutPomgetpomentitiesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
