// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapimakeupprepubRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static QueryLinkeBahamutWebapimakeupprepubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapimakeupprepubRequest self = new QueryLinkeBahamutWebapimakeupprepubRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapimakeupprepubRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
