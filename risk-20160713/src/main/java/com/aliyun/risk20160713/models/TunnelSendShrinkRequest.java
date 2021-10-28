// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelSendShrinkRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("Data")
    public String dataShrink;

    @NameInMap("StartEndPoint")
    public String startEndPoint;

    @NameInMap("StopEndPoint")
    public String stopEndPoint;

    public static TunnelSendShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TunnelSendShrinkRequest self = new TunnelSendShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TunnelSendShrinkRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public TunnelSendShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public TunnelSendShrinkRequest setStartEndPoint(String startEndPoint) {
        this.startEndPoint = startEndPoint;
        return this;
    }
    public String getStartEndPoint() {
        return this.startEndPoint;
    }

    public TunnelSendShrinkRequest setStopEndPoint(String stopEndPoint) {
        this.stopEndPoint = stopEndPoint;
        return this;
    }
    public String getStopEndPoint() {
        return this.stopEndPoint;
    }

}
