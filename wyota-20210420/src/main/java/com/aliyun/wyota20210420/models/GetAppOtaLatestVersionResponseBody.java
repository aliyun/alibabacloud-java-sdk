// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetAppOtaLatestVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppOtaLatestVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppOtaLatestVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppOtaLatestVersionResponseBody self = new GetAppOtaLatestVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppOtaLatestVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppOtaLatestVersionResponseBody setData(GetAppOtaLatestVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppOtaLatestVersionResponseBodyData getData() {
        return this.data;
    }

    public GetAppOtaLatestVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppOtaLatestVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppOtaLatestVersionResponseBodyData extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ForceUpgrade")
        public Integer forceUpgrade;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("Size")
        public Long size;

        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("VersionType")
        public String versionType;

        public static GetAppOtaLatestVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppOtaLatestVersionResponseBodyData self = new GetAppOtaLatestVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppOtaLatestVersionResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetAppOtaLatestVersionResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAppOtaLatestVersionResponseBodyData setForceUpgrade(Integer forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        public GetAppOtaLatestVersionResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetAppOtaLatestVersionResponseBodyData setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public GetAppOtaLatestVersionResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetAppOtaLatestVersionResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetAppOtaLatestVersionResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public GetAppOtaLatestVersionResponseBodyData setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

    }

}
