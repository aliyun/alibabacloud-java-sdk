// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceSeatsRequest extends TeaModel {
    @NameInMap("Label")
    public String label;

    @NameInMap("SeatNo")
    public String seatNo;

    @NameInMap("SerialNoList")
    public java.util.List<String> serialNoList;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ListDeviceSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceSeatsRequest self = new ListDeviceSeatsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceSeatsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListDeviceSeatsRequest setSeatNo(String seatNo) {
        this.seatNo = seatNo;
        return this;
    }
    public String getSeatNo() {
        return this.seatNo;
    }

    public ListDeviceSeatsRequest setSerialNoList(java.util.List<String> serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public java.util.List<String> getSerialNoList() {
        return this.serialNoList;
    }

    public ListDeviceSeatsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListDeviceSeatsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
