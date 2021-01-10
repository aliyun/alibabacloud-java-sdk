// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutCloudtenantRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutCloudtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutCloudtenantRequest self = new DeleteLinkeBahamutCloudtenantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutCloudtenantRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
