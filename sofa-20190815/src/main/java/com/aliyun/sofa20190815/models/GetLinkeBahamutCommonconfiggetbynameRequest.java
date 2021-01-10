// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonconfiggetbynameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutCommonconfiggetbynameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonconfiggetbynameRequest self = new GetLinkeBahamutCommonconfiggetbynameRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonconfiggetbynameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLinkeBahamutCommonconfiggetbynameRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
