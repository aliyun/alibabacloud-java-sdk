// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceOtaInfoTestResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceOtaInfoTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoTestResponseBody self = new GetDeviceOtaInfoTestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoTestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceOtaInfoTestResponseBody setData(GetDeviceOtaInfoTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceOtaInfoTestResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceOtaInfoTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceOtaInfoTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceOtaInfoTestResponseBodyDataVersion extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ForceUpgrade")
        public Integer forceUpgrade;

        @NameInMap("LocalDownloadUrl")
        public String localDownloadUrl;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Model")
        public String model;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("VersionType")
        public String versionType;

        public static GetDeviceOtaInfoTestResponseBodyDataVersion build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaInfoTestResponseBodyDataVersion self = new GetDeviceOtaInfoTestResponseBodyDataVersion();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setForceUpgrade(Integer forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setLocalDownloadUrl(String localDownloadUrl) {
            this.localDownloadUrl = localDownloadUrl;
            return this;
        }
        public String getLocalDownloadUrl() {
            return this.localDownloadUrl;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public GetDeviceOtaInfoTestResponseBodyDataVersion setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

    }

    public static class GetDeviceOtaInfoTestResponseBodyData extends TeaModel {
        @NameInMap("Version")
        public GetDeviceOtaInfoTestResponseBodyDataVersion version;

        public static GetDeviceOtaInfoTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaInfoTestResponseBodyData self = new GetDeviceOtaInfoTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaInfoTestResponseBodyData setVersion(GetDeviceOtaInfoTestResponseBodyDataVersion version) {
            this.version = version;
            return this;
        }
        public GetDeviceOtaInfoTestResponseBodyDataVersion getVersion() {
            return this.version;
        }

    }

}
