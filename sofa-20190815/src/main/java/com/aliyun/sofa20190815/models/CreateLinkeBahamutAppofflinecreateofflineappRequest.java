// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppofflinecreateofflineappRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("ArchDomainId")
    public String archDomainId;

    @NameInMap("ArchDomainName")
    public String archDomainName;

    @NameInMap("CnName")
    public String cnName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Level")
    public String level;

    @NameInMap("PriArchDomainId")
    public String priArchDomainId;

    @NameInMap("PriArchDomainName")
    public String priArchDomainName;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoUrl")
    public String repoUrl;

    @NameInMap("Station")
    public String station;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneMode")
    public String zoneMode;

    @NameInMap("DevOwnersRepeatList")
    public java.util.List<String> devOwnersRepeatList;

    @NameInMap("PeOwnersRepeatList")
    public java.util.List<String> peOwnersRepeatList;

    @NameInMap("TestOwnersRepeatList")
    public java.util.List<String> testOwnersRepeatList;

    public static CreateLinkeBahamutAppofflinecreateofflineappRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppofflinecreateofflineappRequest self = new CreateLinkeBahamutAppofflinecreateofflineappRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setArchDomainId(String archDomainId) {
        this.archDomainId = archDomainId;
        return this;
    }
    public String getArchDomainId() {
        return this.archDomainId;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setArchDomainName(String archDomainName) {
        this.archDomainName = archDomainName;
        return this;
    }
    public String getArchDomainName() {
        return this.archDomainName;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }
    public String getCnName() {
        return this.cnName;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setPriArchDomainId(String priArchDomainId) {
        this.priArchDomainId = priArchDomainId;
        return this;
    }
    public String getPriArchDomainId() {
        return this.priArchDomainId;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setPriArchDomainName(String priArchDomainName) {
        this.priArchDomainName = priArchDomainName;
        return this;
    }
    public String getPriArchDomainName() {
        return this.priArchDomainName;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setStation(String station) {
        this.station = station;
        return this;
    }
    public String getStation() {
        return this.station;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setDevOwnersRepeatList(java.util.List<String> devOwnersRepeatList) {
        this.devOwnersRepeatList = devOwnersRepeatList;
        return this;
    }
    public java.util.List<String> getDevOwnersRepeatList() {
        return this.devOwnersRepeatList;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setPeOwnersRepeatList(java.util.List<String> peOwnersRepeatList) {
        this.peOwnersRepeatList = peOwnersRepeatList;
        return this;
    }
    public java.util.List<String> getPeOwnersRepeatList() {
        return this.peOwnersRepeatList;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappRequest setTestOwnersRepeatList(java.util.List<String> testOwnersRepeatList) {
        this.testOwnersRepeatList = testOwnersRepeatList;
        return this;
    }
    public java.util.List<String> getTestOwnersRepeatList() {
        return this.testOwnersRepeatList;
    }

}
