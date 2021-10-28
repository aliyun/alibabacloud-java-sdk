// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelReceiveRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("StartEndPoint")
    public String startEndPoint;

    @NameInMap("StopEndPoint")
    public String stopEndPoint;

    public static TunnelReceiveRequest build(java.util.Map<String, ?> map) throws Exception {
        TunnelReceiveRequest self = new TunnelReceiveRequest();
        return TeaModel.build(map, self);
    }

    public TunnelReceiveRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public TunnelReceiveRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public TunnelReceiveRequest setStartEndPoint(String startEndPoint) {
        this.startEndPoint = startEndPoint;
        return this;
    }
    public String getStartEndPoint() {
        return this.startEndPoint;
    }

    public TunnelReceiveRequest setStopEndPoint(String stopEndPoint) {
        this.stopEndPoint = stopEndPoint;
        return this;
    }
    public String getStopEndPoint() {
        return this.stopEndPoint;
    }

}
