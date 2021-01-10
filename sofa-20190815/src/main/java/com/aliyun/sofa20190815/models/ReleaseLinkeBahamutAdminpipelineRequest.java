// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutAdminpipelineRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ReleaseLinkeBahamutAdminpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutAdminpipelineRequest self = new ReleaseLinkeBahamutAdminpipelineRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutAdminpipelineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
