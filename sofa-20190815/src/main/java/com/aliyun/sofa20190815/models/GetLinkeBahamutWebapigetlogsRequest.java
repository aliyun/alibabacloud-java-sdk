// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlogsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutWebapigetlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlogsRequest self = new GetLinkeBahamutWebapigetlogsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlogsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeBahamutWebapigetlogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
