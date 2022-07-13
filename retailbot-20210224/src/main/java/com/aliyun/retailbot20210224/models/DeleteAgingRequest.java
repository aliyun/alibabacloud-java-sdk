// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteAgingRequest extends TeaModel {
    // 要删除的时效id列表
    @NameInMap("AgingIds")
    public java.util.List<Long> agingIds;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    public static DeleteAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgingRequest self = new DeleteAgingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgingRequest setAgingIds(java.util.List<Long> agingIds) {
        this.agingIds = agingIds;
        return this;
    }
    public java.util.List<Long> getAgingIds() {
        return this.agingIds;
    }

    public DeleteAgingRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
