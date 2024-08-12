// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaVersionRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Arch")
    public String arch;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("Os")
    public String os;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("OtaType")
    public Integer otaType;

    @NameInMap("Project")
    public String project;

    @NameInMap("ReleaseNote")
    public String releaseNote;

    @NameInMap("ReleaseNoteEn")
    public String releaseNoteEn;

    @NameInMap("ReleaseNoteJp")
    public String releaseNoteJp;

    @NameInMap("Size")
    public Long size;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotRegionId")
    public String snapshotRegionId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("VersionType")
    public String versionType;

    public static CreateAppOtaVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaVersionRequest self = new CreateAppOtaVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppOtaVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public CreateAppOtaVersionRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateAppOtaVersionRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public CreateAppOtaVersionRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateAppOtaVersionRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateAppOtaVersionRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public CreateAppOtaVersionRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateAppOtaVersionRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateAppOtaVersionRequest setOtaType(Integer otaType) {
        this.otaType = otaType;
        return this;
    }
    public Integer getOtaType() {
        return this.otaType;
    }

    public CreateAppOtaVersionRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateAppOtaVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public CreateAppOtaVersionRequest setReleaseNoteEn(String releaseNoteEn) {
        this.releaseNoteEn = releaseNoteEn;
        return this;
    }
    public String getReleaseNoteEn() {
        return this.releaseNoteEn;
    }

    public CreateAppOtaVersionRequest setReleaseNoteJp(String releaseNoteJp) {
        this.releaseNoteJp = releaseNoteJp;
        return this;
    }
    public String getReleaseNoteJp() {
        return this.releaseNoteJp;
    }

    public CreateAppOtaVersionRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CreateAppOtaVersionRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateAppOtaVersionRequest setSnapshotRegionId(String snapshotRegionId) {
        this.snapshotRegionId = snapshotRegionId;
        return this;
    }
    public String getSnapshotRegionId() {
        return this.snapshotRegionId;
    }

    public CreateAppOtaVersionRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateAppOtaVersionRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
