// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsResourceGroupRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Id")
    public String id;

    public static DeleteRmsResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsResourceGroupRequest self = new DeleteRmsResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRmsResourceGroupRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public DeleteRmsResourceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
