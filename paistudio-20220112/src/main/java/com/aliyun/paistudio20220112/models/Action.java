// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Action extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    public static Action build(java.util.Map<String, ?> map) throws Exception {
        Action self = new Action();
        return TeaModel.build(map, self);
    }

    public Action setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

}
