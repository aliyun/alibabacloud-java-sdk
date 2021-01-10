// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminpipelineRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutAdminpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminpipelineRequest self = new DeleteLinkeBahamutAdminpipelineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminpipelineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
