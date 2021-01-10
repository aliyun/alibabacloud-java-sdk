// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcinfoRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static GetLinkeBahamutStcinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcinfoRequest self = new GetLinkeBahamutStcinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcinfoRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
