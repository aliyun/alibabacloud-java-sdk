// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeWorkZonesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWorkZonesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWorkZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkZonesResponseBody self = new DescribeWorkZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWorkZonesResponseBody setData(DescribeWorkZonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWorkZonesResponseBodyData getData() {
        return this.data;
    }

    public DescribeWorkZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWorkZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWorkZonesResponseBodyDataWorkZoneDTOList extends TeaModel {
        @NameInMap("SeatCol")
        public Integer seatCol;

        @NameInMap("SeatRow")
        public Integer seatRow;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeWorkZonesResponseBodyDataWorkZoneDTOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkZonesResponseBodyDataWorkZoneDTOList self = new DescribeWorkZonesResponseBodyDataWorkZoneDTOList();
            return TeaModel.build(map, self);
        }

        public DescribeWorkZonesResponseBodyDataWorkZoneDTOList setSeatCol(Integer seatCol) {
            this.seatCol = seatCol;
            return this;
        }
        public Integer getSeatCol() {
            return this.seatCol;
        }

        public DescribeWorkZonesResponseBodyDataWorkZoneDTOList setSeatRow(Integer seatRow) {
            this.seatRow = seatRow;
            return this;
        }
        public Integer getSeatRow() {
            return this.seatRow;
        }

        public DescribeWorkZonesResponseBodyDataWorkZoneDTOList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeWorkZonesResponseBodyDataWorkZoneDTOList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeWorkZonesResponseBodyDataWorkZoneDTOList setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeWorkZonesResponseBodyData extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("WorkZoneDTOList")
        public java.util.List<DescribeWorkZonesResponseBodyDataWorkZoneDTOList> workZoneDTOList;

        public static DescribeWorkZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkZonesResponseBodyData self = new DescribeWorkZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWorkZonesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeWorkZonesResponseBodyData setWorkZoneDTOList(java.util.List<DescribeWorkZonesResponseBodyDataWorkZoneDTOList> workZoneDTOList) {
            this.workZoneDTOList = workZoneDTOList;
            return this;
        }
        public java.util.List<DescribeWorkZonesResponseBodyDataWorkZoneDTOList> getWorkZoneDTOList() {
            return this.workZoneDTOList;
        }

    }

}
