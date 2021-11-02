// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class KeepAliveRequest extends TeaModel {
    @NameInMap("CellId")
    public String cellId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("NetworkType")
    public Integer networkType;

    @NameInMap("Tac")
    public String tac;

    public static KeepAliveRequest build(java.util.Map<String, ?> map) throws Exception {
        KeepAliveRequest self = new KeepAliveRequest();
        return TeaModel.build(map, self);
    }

    public KeepAliveRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public KeepAliveRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public KeepAliveRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public KeepAliveRequest setNetworkType(Integer networkType) {
        this.networkType = networkType;
        return this;
    }
    public Integer getNetworkType() {
        return this.networkType;
    }

    public KeepAliveRequest setTac(String tac) {
        this.tac = tac;
        return this;
    }
    public String getTac() {
        return this.tac;
    }

}
