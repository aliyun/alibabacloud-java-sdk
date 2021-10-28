// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelSendRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("StartEndPoint")
    public String startEndPoint;

    @NameInMap("StopEndPoint")
    public String stopEndPoint;

    public static TunnelSendRequest build(java.util.Map<String, ?> map) throws Exception {
        TunnelSendRequest self = new TunnelSendRequest();
        return TeaModel.build(map, self);
    }

    public TunnelSendRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public TunnelSendRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public TunnelSendRequest setStartEndPoint(String startEndPoint) {
        this.startEndPoint = startEndPoint;
        return this;
    }
    public String getStartEndPoint() {
        return this.startEndPoint;
    }

    public TunnelSendRequest setStopEndPoint(String stopEndPoint) {
        this.stopEndPoint = stopEndPoint;
        return this;
    }
    public String getStopEndPoint() {
        return this.stopEndPoint;
    }

}
