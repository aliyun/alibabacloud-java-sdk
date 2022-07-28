// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteRobotShrinkRequest extends TeaModel {
    @NameInMap("Memo")
    public String memo;

    @NameInMap("Operator")
    public String operatorShrink;

    @NameInMap("RobotCode")
    public String robotCode;

    public static DeleteRobotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotShrinkRequest self = new DeleteRobotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRobotShrinkRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public DeleteRobotShrinkRequest setOperatorShrink(String operatorShrink) {
        this.operatorShrink = operatorShrink;
        return this;
    }
    public String getOperatorShrink() {
        return this.operatorShrink;
    }

    public DeleteRobotShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
