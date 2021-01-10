// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigeturlsignRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    public static GetLinkeBahamutWebapigeturlsignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigeturlsignRequest self = new GetLinkeBahamutWebapigeturlsignRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigeturlsignRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
