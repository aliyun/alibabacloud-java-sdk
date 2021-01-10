// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleaseRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleaseRequest self = new DeleteLinkeBahamutReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
