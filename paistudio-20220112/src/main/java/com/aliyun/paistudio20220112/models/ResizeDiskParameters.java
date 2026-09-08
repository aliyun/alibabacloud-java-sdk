// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResizeDiskParameters extends TeaModel {
    /**
     * <p>The target disk capacity after the change.</p>
     */
    @NameInMap("NewDiskSize")
    public String newDiskSize;

    public static ResizeDiskParameters build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskParameters self = new ResizeDiskParameters();
        return TeaModel.build(map, self);
    }

    public ResizeDiskParameters setNewDiskSize(String newDiskSize) {
        this.newDiskSize = newDiskSize;
        return this;
    }
    public String getNewDiskSize() {
        return this.newDiskSize;
    }

}
