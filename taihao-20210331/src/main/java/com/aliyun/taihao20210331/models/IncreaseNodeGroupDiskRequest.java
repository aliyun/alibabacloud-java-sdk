// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupDiskRequest extends TeaModel {
    // IncreaseDiskParam
    @NameInMap("increaseDiskParam")
    public IncreaseDiskParam increaseDiskParam;

    public static IncreaseNodeGroupDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupDiskRequest self = new IncreaseNodeGroupDiskRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupDiskRequest setIncreaseDiskParam(IncreaseDiskParam increaseDiskParam) {
        this.increaseDiskParam = increaseDiskParam;
        return this;
    }
    public IncreaseDiskParam getIncreaseDiskParam() {
        return this.increaseDiskParam;
    }

}
