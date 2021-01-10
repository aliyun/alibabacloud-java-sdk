// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasqueryserversRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    public static QueryLinkeBahamutPaasqueryserversRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasqueryserversRequest self = new QueryLinkeBahamutPaasqueryserversRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasqueryserversRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

}
