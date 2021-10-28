// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelReceiveShrinkRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("Data")
    public String dataShrink;

    @NameInMap("StartEndPoint")
    public String startEndPoint;

    @NameInMap("StopEndPoint")
    public String stopEndPoint;

    public static TunnelReceiveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TunnelReceiveShrinkRequest self = new TunnelReceiveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TunnelReceiveShrinkRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public TunnelReceiveShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public TunnelReceiveShrinkRequest setStartEndPoint(String startEndPoint) {
        this.startEndPoint = startEndPoint;
        return this;
    }
    public String getStartEndPoint() {
        return this.startEndPoint;
    }

    public TunnelReceiveShrinkRequest setStopEndPoint(String stopEndPoint) {
        this.stopEndPoint = stopEndPoint;
        return this;
    }
    public String getStopEndPoint() {
        return this.stopEndPoint;
    }

}
