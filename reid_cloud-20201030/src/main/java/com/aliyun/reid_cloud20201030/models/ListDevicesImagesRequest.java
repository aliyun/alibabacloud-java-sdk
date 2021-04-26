// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListDevicesImagesRequest extends TeaModel {
    @NameInMap("IpcIdList")
    public String ipcIdList;

    @NameInMap("StoreId")
    public Long storeId;

    public static ListDevicesImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesImagesRequest self = new ListDevicesImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesImagesRequest setIpcIdList(String ipcIdList) {
        this.ipcIdList = ipcIdList;
        return this;
    }
    public String getIpcIdList() {
        return this.ipcIdList;
    }

    public ListDevicesImagesRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

}
