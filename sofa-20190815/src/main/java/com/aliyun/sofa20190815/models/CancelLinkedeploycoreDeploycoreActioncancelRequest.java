// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkedeploycoreDeploycoreActioncancelRequest extends TeaModel {
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ActionIdsRepeatList")
    public java.util.List<Integer> actionIdsRepeatList;

    public static CancelLinkedeploycoreDeploycoreActioncancelRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkedeploycoreDeploycoreActioncancelRequest self = new CancelLinkedeploycoreDeploycoreActioncancelRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkedeploycoreDeploycoreActioncancelRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CancelLinkedeploycoreDeploycoreActioncancelRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CancelLinkedeploycoreDeploycoreActioncancelRequest setActionIdsRepeatList(java.util.List<Integer> actionIdsRepeatList) {
        this.actionIdsRepeatList = actionIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getActionIdsRepeatList() {
        return this.actionIdsRepeatList;
    }

}
