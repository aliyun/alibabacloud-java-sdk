// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryModuleSwitchStatusRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 模块开关状态
    @NameInMap("SwitchType")
    public String switchType;

    public static QueryModuleSwitchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModuleSwitchStatusRequest self = new QueryModuleSwitchStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryModuleSwitchStatusRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public QueryModuleSwitchStatusRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
