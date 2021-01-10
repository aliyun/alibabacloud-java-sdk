// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsResourcegroupRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("GroupJsonStr")
    public String groupJsonStr;

    public static AddRmsResourcegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRmsResourcegroupRequest self = new AddRmsResourcegroupRequest();
        return TeaModel.build(map, self);
    }

    public AddRmsResourcegroupRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public AddRmsResourcegroupRequest setGroupJsonStr(String groupJsonStr) {
        this.groupJsonStr = groupJsonStr;
        return this;
    }
    public String getGroupJsonStr() {
        return this.groupJsonStr;
    }

}
