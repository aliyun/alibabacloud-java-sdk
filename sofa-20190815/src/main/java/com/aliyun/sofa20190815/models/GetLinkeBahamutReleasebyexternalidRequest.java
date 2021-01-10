// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasebyexternalidRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    public static GetLinkeBahamutReleasebyexternalidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasebyexternalidRequest self = new GetLinkeBahamutReleasebyexternalidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasebyexternalidRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
