// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsResourcegroupRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("GroupJsonStr")
    public String groupJsonStr;

    @NameInMap("Id")
    public String id;

    public static UpdateRmsResourcegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsResourcegroupRequest self = new UpdateRmsResourcegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRmsResourcegroupRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public UpdateRmsResourcegroupRequest setGroupJsonStr(String groupJsonStr) {
        this.groupJsonStr = groupJsonStr;
        return this;
    }
    public String getGroupJsonStr() {
        return this.groupJsonStr;
    }

    public UpdateRmsResourcegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
