// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeCameraForInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCameraForInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCameraForInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraForInstanceResponseBody self = new DescribeCameraForInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCameraForInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCameraForInstanceResponseBody setData(DescribeCameraForInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCameraForInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeCameraForInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCameraForInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCameraForInstanceResponseBodyDataRecords extends TeaModel {
        @NameInMap("CameraAddress")
        public String cameraAddress;

        @NameInMap("CameraId")
        public String cameraId;

        @NameInMap("CameraName")
        public String cameraName;

        @NameInMap("CameraStatus")
        public Long cameraStatus;

        public static DescribeCameraForInstanceResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraForInstanceResponseBodyDataRecords self = new DescribeCameraForInstanceResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCameraForInstanceResponseBodyDataRecords setCameraAddress(String cameraAddress) {
            this.cameraAddress = cameraAddress;
            return this;
        }
        public String getCameraAddress() {
            return this.cameraAddress;
        }

        public DescribeCameraForInstanceResponseBodyDataRecords setCameraId(String cameraId) {
            this.cameraId = cameraId;
            return this;
        }
        public String getCameraId() {
            return this.cameraId;
        }

        public DescribeCameraForInstanceResponseBodyDataRecords setCameraName(String cameraName) {
            this.cameraName = cameraName;
            return this;
        }
        public String getCameraName() {
            return this.cameraName;
        }

        public DescribeCameraForInstanceResponseBodyDataRecords setCameraStatus(Long cameraStatus) {
            this.cameraStatus = cameraStatus;
            return this;
        }
        public Long getCameraStatus() {
            return this.cameraStatus;
        }

    }

    public static class DescribeCameraForInstanceResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeCameraForInstanceResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCameraForInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraForInstanceResponseBodyData self = new DescribeCameraForInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCameraForInstanceResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeCameraForInstanceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeCameraForInstanceResponseBodyData setRecords(java.util.List<DescribeCameraForInstanceResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeCameraForInstanceResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeCameraForInstanceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
