// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SaveModuleSwitchRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 开关状态
    @NameInMap("Status")
    public Integer status;

    // 开关类型
    @NameInMap("SwitchType")
    public String switchType;

    public static SaveModuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveModuleSwitchRequest self = new SaveModuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public SaveModuleSwitchRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SaveModuleSwitchRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SaveModuleSwitchRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
