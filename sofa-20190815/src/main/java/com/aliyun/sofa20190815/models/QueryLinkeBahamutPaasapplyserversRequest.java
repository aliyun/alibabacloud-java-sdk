// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasapplyserversRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("ServersRepeatList")
    public java.util.List<String> serversRepeatList;

    public static QueryLinkeBahamutPaasapplyserversRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasapplyserversRequest self = new QueryLinkeBahamutPaasapplyserversRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasapplyserversRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutPaasapplyserversRequest setServersRepeatList(java.util.List<String> serversRepeatList) {
        this.serversRepeatList = serversRepeatList;
        return this;
    }
    public java.util.List<String> getServersRepeatList() {
        return this.serversRepeatList;
    }

}
