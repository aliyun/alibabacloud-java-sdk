// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceOtaInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceOtaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoResponseBody self = new GetDeviceOtaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceOtaInfoResponseBody setData(GetDeviceOtaInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceOtaInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceOtaInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceOtaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceOtaInfoResponseBodyDataVersion extends TeaModel {
        @NameInMap("AndroidHorizontalMultiCnImageDownloadUrl")
        public String androidHorizontalMultiCnImageDownloadUrl;

        @NameInMap("AndroidHorizontalMultiEnImageDownloadUrl")
        public String androidHorizontalMultiEnImageDownloadUrl;

        @NameInMap("AndroidVerticalMultiCnImageDownloadUrl")
        public String androidVerticalMultiCnImageDownloadUrl;

        @NameInMap("AndroidVerticalMultiEnImageDownloadUrl")
        public String androidVerticalMultiEnImageDownloadUrl;

        @NameInMap("CnImageDownloadUrl")
        public String cnImageDownloadUrl;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CustomForceUpgrade")
        public Boolean customForceUpgrade;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("EnImageDownloadUrl")
        public String enImageDownloadUrl;

        @NameInMap("ForceUpgrade")
        public Integer forceUpgrade;

        @NameInMap("IsAppDownloadUrl")
        public Boolean isAppDownloadUrl;

        @NameInMap("LocalDownloadUrl")
        public String localDownloadUrl;

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

        @NameInMap("WyForceUpgrade")
        public Boolean wyForceUpgrade;

        public static GetDeviceOtaInfoResponseBodyDataVersion build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaInfoResponseBodyDataVersion self = new GetDeviceOtaInfoResponseBodyDataVersion();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setAndroidHorizontalMultiCnImageDownloadUrl(String androidHorizontalMultiCnImageDownloadUrl) {
            this.androidHorizontalMultiCnImageDownloadUrl = androidHorizontalMultiCnImageDownloadUrl;
            return this;
        }
        public String getAndroidHorizontalMultiCnImageDownloadUrl() {
            return this.androidHorizontalMultiCnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setAndroidHorizontalMultiEnImageDownloadUrl(String androidHorizontalMultiEnImageDownloadUrl) {
            this.androidHorizontalMultiEnImageDownloadUrl = androidHorizontalMultiEnImageDownloadUrl;
            return this;
        }
        public String getAndroidHorizontalMultiEnImageDownloadUrl() {
            return this.androidHorizontalMultiEnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setAndroidVerticalMultiCnImageDownloadUrl(String androidVerticalMultiCnImageDownloadUrl) {
            this.androidVerticalMultiCnImageDownloadUrl = androidVerticalMultiCnImageDownloadUrl;
            return this;
        }
        public String getAndroidVerticalMultiCnImageDownloadUrl() {
            return this.androidVerticalMultiCnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setAndroidVerticalMultiEnImageDownloadUrl(String androidVerticalMultiEnImageDownloadUrl) {
            this.androidVerticalMultiEnImageDownloadUrl = androidVerticalMultiEnImageDownloadUrl;
            return this;
        }
        public String getAndroidVerticalMultiEnImageDownloadUrl() {
            return this.androidVerticalMultiEnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setCnImageDownloadUrl(String cnImageDownloadUrl) {
            this.cnImageDownloadUrl = cnImageDownloadUrl;
            return this;
        }
        public String getCnImageDownloadUrl() {
            return this.cnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setCustomForceUpgrade(Boolean customForceUpgrade) {
            this.customForceUpgrade = customForceUpgrade;
            return this;
        }
        public Boolean getCustomForceUpgrade() {
            return this.customForceUpgrade;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setEnImageDownloadUrl(String enImageDownloadUrl) {
            this.enImageDownloadUrl = enImageDownloadUrl;
            return this;
        }
        public String getEnImageDownloadUrl() {
            return this.enImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setForceUpgrade(Integer forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setIsAppDownloadUrl(Boolean isAppDownloadUrl) {
            this.isAppDownloadUrl = isAppDownloadUrl;
            return this;
        }
        public Boolean getIsAppDownloadUrl() {
            return this.isAppDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setLocalDownloadUrl(String localDownloadUrl) {
            this.localDownloadUrl = localDownloadUrl;
            return this;
        }
        public String getLocalDownloadUrl() {
            return this.localDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setMultiCnImageDownloadUrl(String multiCnImageDownloadUrl) {
            this.multiCnImageDownloadUrl = multiCnImageDownloadUrl;
            return this;
        }
        public String getMultiCnImageDownloadUrl() {
            return this.multiCnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setMultiEnImageDownloadUrl(String multiEnImageDownloadUrl) {
            this.multiEnImageDownloadUrl = multiEnImageDownloadUrl;
            return this;
        }
        public String getMultiEnImageDownloadUrl() {
            return this.multiEnImageDownloadUrl;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

        public GetDeviceOtaInfoResponseBodyDataVersion setWyForceUpgrade(Boolean wyForceUpgrade) {
            this.wyForceUpgrade = wyForceUpgrade;
            return this;
        }
        public Boolean getWyForceUpgrade() {
            return this.wyForceUpgrade;
        }

    }

    public static class GetDeviceOtaInfoResponseBodyData extends TeaModel {
        @NameInMap("Version")
        public GetDeviceOtaInfoResponseBodyDataVersion version;

        public static GetDeviceOtaInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaInfoResponseBodyData self = new GetDeviceOtaInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaInfoResponseBodyData setVersion(GetDeviceOtaInfoResponseBodyDataVersion version) {
            this.version = version;
            return this;
        }
        public GetDeviceOtaInfoResponseBodyDataVersion getVersion() {
            return this.version;
        }

    }

}
