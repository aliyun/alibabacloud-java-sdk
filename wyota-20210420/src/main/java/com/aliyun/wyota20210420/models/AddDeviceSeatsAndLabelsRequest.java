// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDeviceSeatsAndLabelsRequest extends TeaModel {
    @NameInMap("IsUnique")
    public Boolean isUnique;

    @NameInMap("Label")
    public String label;

    @NameInMap("LabelList")
    public java.util.List<String> labelList;

    @NameInMap("SeatName")
    public String seatName;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static AddDeviceSeatsAndLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceSeatsAndLabelsRequest self = new AddDeviceSeatsAndLabelsRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceSeatsAndLabelsRequest setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
        return this;
    }
    public Boolean getIsUnique() {
        return this.isUnique;
    }

    public AddDeviceSeatsAndLabelsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public AddDeviceSeatsAndLabelsRequest setLabelList(java.util.List<String> labelList) {
        this.labelList = labelList;
        return this;
    }
    public java.util.List<String> getLabelList() {
        return this.labelList;
    }

    public AddDeviceSeatsAndLabelsRequest setSeatName(String seatName) {
        this.seatName = seatName;
        return this;
    }
    public String getSeatName() {
        return this.seatName;
    }

    public AddDeviceSeatsAndLabelsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public AddDeviceSeatsAndLabelsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddDeviceSeatsAndLabelsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
