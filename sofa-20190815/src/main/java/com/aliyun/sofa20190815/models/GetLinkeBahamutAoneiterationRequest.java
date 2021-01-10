// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneiterationRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("NoQuality")
    public String noQuality;

    public static GetLinkeBahamutAoneiterationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneiterationRequest self = new GetLinkeBahamutAoneiterationRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneiterationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeBahamutAoneiterationRequest setNoQuality(String noQuality) {
        this.noQuality = noQuality;
        return this;
    }
    public String getNoQuality() {
        return this.noQuality;
    }

}
