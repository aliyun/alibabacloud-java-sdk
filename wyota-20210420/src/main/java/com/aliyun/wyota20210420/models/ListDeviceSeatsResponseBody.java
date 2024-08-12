// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceSeatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDeviceSeatsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceSeatsResponseBody self = new ListDeviceSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceSeatsResponseBody setData(ListDeviceSeatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceSeatsResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceSeatsResponseBodyDataDeviceSeatDTOList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("SeatName")
        public String seatName;

        @NameInMap("SeatNo")
        public String seatNo;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("SiteName")
        public String siteName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListDeviceSeatsResponseBodyDataDeviceSeatDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceSeatsResponseBodyDataDeviceSeatDTOList self = new ListDeviceSeatsResponseBodyDataDeviceSeatDTOList();
            return TeaModel.build(map, self);
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListDeviceSeatsResponseBodyDataDeviceSeatDTOList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListDeviceSeatsResponseBodyData extends TeaModel {
        @NameInMap("DeviceSeatDTOList")
        public java.util.List<ListDeviceSeatsResponseBodyDataDeviceSeatDTOList> deviceSeatDTOList;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDeviceSeatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceSeatsResponseBodyData self = new ListDeviceSeatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceSeatsResponseBodyData setDeviceSeatDTOList(java.util.List<ListDeviceSeatsResponseBodyDataDeviceSeatDTOList> deviceSeatDTOList) {
            this.deviceSeatDTOList = deviceSeatDTOList;
            return this;
        }
        public java.util.List<ListDeviceSeatsResponseBodyDataDeviceSeatDTOList> getDeviceSeatDTOList() {
            return this.deviceSeatDTOList;
        }

        public ListDeviceSeatsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
