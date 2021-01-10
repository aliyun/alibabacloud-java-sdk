// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminworkspaceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutAdminworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminworkspaceRequest self = new DeleteLinkeBahamutAdminworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminworkspaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
