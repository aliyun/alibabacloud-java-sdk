// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasVpcRequest extends TeaModel {
    @NameInMap("CidrLock")
    public String cidrLock;

    @NameInMap("Name")
    public String name;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateCasVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasVpcRequest self = new CreateCasVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasVpcRequest setCidrLock(String cidrLock) {
        this.cidrLock = cidrLock;
        return this;
    }
    public String getCidrLock() {
        return this.cidrLock;
    }

    public CreateCasVpcRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
