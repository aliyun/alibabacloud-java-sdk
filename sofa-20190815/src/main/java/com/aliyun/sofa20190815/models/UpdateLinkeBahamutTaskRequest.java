// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutTaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static UpdateLinkeBahamutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutTaskRequest self = new UpdateLinkeBahamutTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
