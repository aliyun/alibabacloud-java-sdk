// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteRobotRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Memo")
    public String memo;

    public static DeleteRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotRequest self = new DeleteRobotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRobotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteRobotRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
