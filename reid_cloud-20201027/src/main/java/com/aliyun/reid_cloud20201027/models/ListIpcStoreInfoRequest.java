// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ListIpcStoreInfoRequest extends TeaModel {
    @NameInMap("IpcIds")
    public String ipcIds;

    public static ListIpcStoreInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpcStoreInfoRequest self = new ListIpcStoreInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListIpcStoreInfoRequest setIpcIds(String ipcIds) {
        this.ipcIds = ipcIds;
        return this;
    }
    public String getIpcIds() {
        return this.ipcIds;
    }

}
