// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceVersionDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDeviceVersionDetailResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeviceVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceVersionDetailResponseBody self = new DescribeDeviceVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceVersionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDeviceVersionDetailResponseBody setData(java.util.List<DescribeDeviceVersionDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDeviceVersionDetailResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDeviceVersionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDeviceVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDeviceVersionDetailResponseBodyData extends TeaModel {
        @NameInMap("AndroidHorizontalMultiCnImageDownloadUrl")
        public String androidHorizontalMultiCnImageDownloadUrl;

        @NameInMap("AndroidHorizontalMultiEnImageDownloadUrl")
        public String androidHorizontalMultiEnImageDownloadUrl;

        @NameInMap("AndroidVerticalMultiCnImageDownloadUrl")
        public String androidVerticalMultiCnImageDownloadUrl;

        @NameInMap("AndroidVerticalMultiEnImageDownloadUrl")
        public String androidVerticalMultiEnImageDownloadUrl;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("ClientType")
        public Integer clientType;

        @NameInMap("CnImageDownloadUrl")
        public String cnImageDownloadUrl;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("EnImageDownloadUrl")
        public String enImageDownloadUrl;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Model")
        public String model;

        @NameInMap("MultiCnImageDownloadUrl")
        public String multiCnImageDownloadUrl;

        @NameInMap("MultiEnImageDownloadUrl")
        public String multiEnImageDownloadUrl;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("VersionType")
        public String versionType;

        public static DescribeDeviceVersionDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceVersionDetailResponseBodyData self = new DescribeDeviceVersionDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceVersionDetailResponseBodyData setAndroidHorizontalMultiCnImageDownloadUrl(String androidHorizontalMultiCnImageDownloadUrl) {
            this.androidHorizontalMultiCnImageDownloadUrl = androidHorizontalMultiCnImageDownloadUrl;
            return this;
        }
        public String getAndroidHorizontalMultiCnImageDownloadUrl() {
            return this.androidHorizontalMultiCnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setAndroidHorizontalMultiEnImageDownloadUrl(String androidHorizontalMultiEnImageDownloadUrl) {
            this.androidHorizontalMultiEnImageDownloadUrl = androidHorizontalMultiEnImageDownloadUrl;
            return this;
        }
        public String getAndroidHorizontalMultiEnImageDownloadUrl() {
            return this.androidHorizontalMultiEnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setAndroidVerticalMultiCnImageDownloadUrl(String androidVerticalMultiCnImageDownloadUrl) {
            this.androidVerticalMultiCnImageDownloadUrl = androidVerticalMultiCnImageDownloadUrl;
            return this;
        }
        public String getAndroidVerticalMultiCnImageDownloadUrl() {
            return this.androidVerticalMultiCnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setAndroidVerticalMultiEnImageDownloadUrl(String androidVerticalMultiEnImageDownloadUrl) {
            this.androidVerticalMultiEnImageDownloadUrl = androidVerticalMultiEnImageDownloadUrl;
            return this;
        }
        public String getAndroidVerticalMultiEnImageDownloadUrl() {
            return this.androidVerticalMultiEnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeDeviceVersionDetailResponseBodyData setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public DescribeDeviceVersionDetailResponseBodyData setCnImageDownloadUrl(String cnImageDownloadUrl) {
            this.cnImageDownloadUrl = cnImageDownloadUrl;
            return this;
        }
        public String getCnImageDownloadUrl() {
            return this.cnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDeviceVersionDetailResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setEnImageDownloadUrl(String enImageDownloadUrl) {
            this.enImageDownloadUrl = enImageDownloadUrl;
            return this;
        }
        public String getEnImageDownloadUrl() {
            return this.enImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeDeviceVersionDetailResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeDeviceVersionDetailResponseBodyData setMultiCnImageDownloadUrl(String multiCnImageDownloadUrl) {
            this.multiCnImageDownloadUrl = multiCnImageDownloadUrl;
            return this;
        }
        public String getMultiCnImageDownloadUrl() {
            return this.multiCnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setMultiEnImageDownloadUrl(String multiEnImageDownloadUrl) {
            this.multiEnImageDownloadUrl = multiEnImageDownloadUrl;
            return this;
        }
        public String getMultiEnImageDownloadUrl() {
            return this.multiEnImageDownloadUrl;
        }

        public DescribeDeviceVersionDetailResponseBodyData setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDeviceVersionDetailResponseBodyData setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeDeviceVersionDetailResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeDeviceVersionDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeDeviceVersionDetailResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDeviceVersionDetailResponseBodyData setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

    }

}
