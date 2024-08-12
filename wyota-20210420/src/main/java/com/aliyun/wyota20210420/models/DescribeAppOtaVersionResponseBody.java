// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeAppOtaVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAppOtaVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppOtaVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppOtaVersionResponseBody self = new DescribeAppOtaVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppOtaVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppOtaVersionResponseBody setData(DescribeAppOtaVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAppOtaVersionResponseBodyData getData() {
        return this.data;
    }

    public DescribeAppOtaVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppOtaVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FullDownloadUrl")
        public String fullDownloadUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Project")
        public String project;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        @NameInMap("SessionType")
        public String sessionType;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("VersionCode")
        public Long versionCode;

        @NameInMap("VersionType")
        public String versionType;

        @NameInMap("VersionUid")
        public String versionUid;

        public static DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList self = new DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList();
            return TeaModel.build(map, self);
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setFullDownloadUrl(String fullDownloadUrl) {
            this.fullDownloadUrl = fullDownloadUrl;
            return this;
        }
        public String getFullDownloadUrl() {
            return this.fullDownloadUrl;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setVersionCode(Long versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public Long getVersionCode() {
            return this.versionCode;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

        public DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

    public static class DescribeAppOtaVersionResponseBodyData extends TeaModel {
        @NameInMap("AppOtaInfoDTOList")
        public java.util.List<DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList> appOtaInfoDTOList;

        public static DescribeAppOtaVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppOtaVersionResponseBodyData self = new DescribeAppOtaVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAppOtaVersionResponseBodyData setAppOtaInfoDTOList(java.util.List<DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList> appOtaInfoDTOList) {
            this.appOtaInfoDTOList = appOtaInfoDTOList;
            return this;
        }
        public java.util.List<DescribeAppOtaVersionResponseBodyDataAppOtaInfoDTOList> getAppOtaInfoDTOList() {
            return this.appOtaInfoDTOList;
        }

    }

}
