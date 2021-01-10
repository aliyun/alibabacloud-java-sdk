// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaseexternalidjarsRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    public static QueryLinkeBahamutReleaseexternalidjarsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaseexternalidjarsRequest self = new QueryLinkeBahamutReleaseexternalidjarsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaseexternalidjarsRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
