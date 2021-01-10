// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaseexternalidcodediffsRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    public static QueryLinkeBahamutReleaseexternalidcodediffsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaseexternalidcodediffsRequest self = new QueryLinkeBahamutReleaseexternalidcodediffsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaseexternalidcodediffsRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
