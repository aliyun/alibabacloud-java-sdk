// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceSeatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDeviceSeatsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDeviceSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceSeatsResponseBody self = new DescribeDeviceSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDeviceSeatsResponseBody setData(java.util.List<DescribeDeviceSeatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDeviceSeatsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDeviceSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDeviceSeatsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeviceSeatsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceSeatsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeviceSeatsResponseBodyData extends TeaModel {
        @NameInMap("SeatCol")
        public Integer seatCol;

        @NameInMap("SeatName")
        public String seatName;

        @NameInMap("SeatNo")
        public String seatNo;

        @NameInMap("SeatRow")
        public Integer seatRow;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("SiteName")
        public String siteName;

        public static DescribeDeviceSeatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceSeatsResponseBodyData self = new DescribeDeviceSeatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceSeatsResponseBodyData setSeatCol(Integer seatCol) {
            this.seatCol = seatCol;
            return this;
        }
        public Integer getSeatCol() {
            return this.seatCol;
        }

        public DescribeDeviceSeatsResponseBodyData setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public DescribeDeviceSeatsResponseBodyData setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public DescribeDeviceSeatsResponseBodyData setSeatRow(Integer seatRow) {
            this.seatRow = seatRow;
            return this;
        }
        public Integer getSeatRow() {
            return this.seatRow;
        }

        public DescribeDeviceSeatsResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public DescribeDeviceSeatsResponseBodyData setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public DescribeDeviceSeatsResponseBodyData setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

}
