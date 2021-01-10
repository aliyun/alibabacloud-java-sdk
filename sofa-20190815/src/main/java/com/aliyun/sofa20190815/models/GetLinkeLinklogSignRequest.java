// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogSignRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    public static GetLinkeLinklogSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogSignRequest self = new GetLinkeLinklogSignRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogSignRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
