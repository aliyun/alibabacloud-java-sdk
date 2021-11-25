// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeCameraForInstanceResponseBody extends TeaModel {
    // 返回错误码
    @NameInMap("Code")
    public String code;

    // 返回数据
    @NameInMap("Data")
    public DescribeCameraForInstanceResponseBodyData data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
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
        // 设备地址
        @NameInMap("CameraAddress")
        public String cameraAddress;

        // 设备编号
        @NameInMap("CameraId")
        public String cameraId;

        // 设备名称
        @NameInMap("CameraName")
        public String cameraName;

        // 设备在线状态。 1表示在线，0表示离线, 2表示待注册
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
        // 当前页序号
        @NameInMap("PageNumber")
        public Long pageNumber;

        // 每页显示多少条
        @NameInMap("PageSize")
        public Long pageSize;

        // 返回数据条目
        @NameInMap("Records")
        public java.util.List<DescribeCameraForInstanceResponseBodyDataRecords> records;

        // 总数据数
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
