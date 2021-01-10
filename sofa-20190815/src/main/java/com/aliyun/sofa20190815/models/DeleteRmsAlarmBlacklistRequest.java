// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlarmBlacklistRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    public static DeleteRmsAlarmBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlarmBlacklistRequest self = new DeleteRmsAlarmBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlarmBlacklistRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public DeleteRmsAlarmBlacklistRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
