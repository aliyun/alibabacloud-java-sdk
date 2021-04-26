// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeIpcLiveAddressRequest extends TeaModel {
    @NameInMap("IpcId")
    public Long ipcId;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("ProtocolType")
    public String protocolType;

    public static DescribeIpcLiveAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcLiveAddressRequest self = new DescribeIpcLiveAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpcLiveAddressRequest setIpcId(Long ipcId) {
        this.ipcId = ipcId;
        return this;
    }
    public Long getIpcId() {
        return this.ipcId;
    }

    public DescribeIpcLiveAddressRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeIpcLiveAddressRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

}
