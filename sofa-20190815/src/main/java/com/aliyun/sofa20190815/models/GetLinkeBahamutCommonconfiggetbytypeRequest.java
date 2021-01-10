// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonconfiggetbytypeRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutCommonconfiggetbytypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonconfiggetbytypeRequest self = new GetLinkeBahamutCommonconfiggetbytypeRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonconfiggetbytypeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
