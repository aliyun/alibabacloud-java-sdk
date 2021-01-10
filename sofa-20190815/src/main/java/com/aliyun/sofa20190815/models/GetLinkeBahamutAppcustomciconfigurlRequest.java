// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppcustomciconfigurlRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeBahamutAppcustomciconfigurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppcustomciconfigurlRequest self = new GetLinkeBahamutAppcustomciconfigurlRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppcustomciconfigurlRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
