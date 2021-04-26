// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListDevicesImagesResponseBody extends TeaModel {
    @NameInMap("DeviceImages")
    public java.util.List<ListDevicesImagesResponseBodyDeviceImages> deviceImages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListDevicesImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesImagesResponseBody self = new ListDevicesImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesImagesResponseBody setDeviceImages(java.util.List<ListDevicesImagesResponseBodyDeviceImages> deviceImages) {
        this.deviceImages = deviceImages;
        return this;
    }
    public java.util.List<ListDevicesImagesResponseBodyDeviceImages> getDeviceImages() {
        return this.deviceImages;
    }

    public ListDevicesImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesImagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicesImagesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListDevicesImagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevicesImagesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListDevicesImagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDevicesImagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicesImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDevicesImagesResponseBodyDeviceImages extends TeaModel {
        @NameInMap("IpcId")
        public Long ipcId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        public static ListDevicesImagesResponseBodyDeviceImages build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesImagesResponseBodyDeviceImages self = new ListDevicesImagesResponseBodyDeviceImages();
            return TeaModel.build(map, self);
        }

        public ListDevicesImagesResponseBodyDeviceImages setIpcId(Long ipcId) {
            this.ipcId = ipcId;
            return this;
        }
        public Long getIpcId() {
            return this.ipcId;
        }

        public ListDevicesImagesResponseBodyDeviceImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
