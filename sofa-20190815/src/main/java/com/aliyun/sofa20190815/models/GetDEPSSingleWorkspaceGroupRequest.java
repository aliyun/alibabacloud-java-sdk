// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDEPSSingleWorkspaceGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static GetDEPSSingleWorkspaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDEPSSingleWorkspaceGroupRequest self = new GetDEPSSingleWorkspaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetDEPSSingleWorkspaceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
