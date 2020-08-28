// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDevicesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDevicesResponseData data;

    public static ListDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponse self = new ListDevicesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListDevicesResponseDataRecords extends TeaModel {
        @NameInMap("AccessProtocolType")
        @Validation(required = true)
        public String accessProtocolType;

        @NameInMap("BitRate")
        @Validation(required = true)
        public String bitRate;

        @NameInMap("CoverImageUrl")
        @Validation(required = true)
        public String coverImageUrl;

        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("DeviceAddress")
        @Validation(required = true)
        public String deviceAddress;

        @NameInMap("DeviceDirection")
        @Validation(required = true)
        public String deviceDirection;

        @NameInMap("DeviceSite")
        @Validation(required = true)
        public String deviceSite;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("Resolution")
        @Validation(required = true)
        public String resolution;

        @NameInMap("SipGBId")
        @Validation(required = true)
        public String sipGBId;

        @NameInMap("SipPassword")
        @Validation(required = true)
        public String sipPassword;

        @NameInMap("SipServerIp")
        @Validation(required = true)
        public String sipServerIp;

        @NameInMap("SipServerPort")
        @Validation(required = true)
        public String sipServerPort;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DeviceType")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("Vendor")
        @Validation(required = true)
        public String vendor;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static ListDevicesResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseDataRecords self = new ListDevicesResponseDataRecords();
            return TeaModel.build(map, self);
        }

    }

    public static class ListDevicesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListDevicesResponseDataRecords> records;

        public static ListDevicesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseData self = new ListDevicesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
