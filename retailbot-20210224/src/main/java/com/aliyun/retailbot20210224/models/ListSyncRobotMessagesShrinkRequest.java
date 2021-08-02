// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncRobotMessagesShrinkRequest extends TeaModel {
    // 人机数据集合
    @NameInMap("RobotMessageDTOList")
    public String robotMessageDTOListShrink;

    public static ListSyncRobotMessagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyncRobotMessagesShrinkRequest self = new ListSyncRobotMessagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSyncRobotMessagesShrinkRequest setRobotMessageDTOListShrink(String robotMessageDTOListShrink) {
        this.robotMessageDTOListShrink = robotMessageDTOListShrink;
        return this;
    }
    public String getRobotMessageDTOListShrink() {
        return this.robotMessageDTOListShrink;
    }

}
