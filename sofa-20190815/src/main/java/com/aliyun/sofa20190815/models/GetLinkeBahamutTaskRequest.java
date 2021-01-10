// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeBahamutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTaskRequest self = new GetLinkeBahamutTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
