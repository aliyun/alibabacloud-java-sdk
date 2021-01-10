// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmincreatebasejarRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BaseJarInfo")
    public String baseJarInfo;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoUrl")
    public String repoUrl;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("DevOwnerRepeatList")
    public java.util.List<String> devOwnerRepeatList;

    @NameInMap("ModuleListRepeatList")
    public java.util.List<String> moduleListRepeatList;

    @NameInMap("TestOwnerRepeatList")
    public java.util.List<String> testOwnerRepeatList;

    public static AddLinkeBahamutAdmincreatebasejarRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmincreatebasejarRequest self = new AddLinkeBahamutAdmincreatebasejarRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setBaseJarInfo(String baseJarInfo) {
        this.baseJarInfo = baseJarInfo;
        return this;
    }
    public String getBaseJarInfo() {
        return this.baseJarInfo;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setDevOwnerRepeatList(java.util.List<String> devOwnerRepeatList) {
        this.devOwnerRepeatList = devOwnerRepeatList;
        return this;
    }
    public java.util.List<String> getDevOwnerRepeatList() {
        return this.devOwnerRepeatList;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setModuleListRepeatList(java.util.List<String> moduleListRepeatList) {
        this.moduleListRepeatList = moduleListRepeatList;
        return this;
    }
    public java.util.List<String> getModuleListRepeatList() {
        return this.moduleListRepeatList;
    }

    public AddLinkeBahamutAdmincreatebasejarRequest setTestOwnerRepeatList(java.util.List<String> testOwnerRepeatList) {
        this.testOwnerRepeatList = testOwnerRepeatList;
        return this;
    }
    public java.util.List<String> getTestOwnerRepeatList() {
        return this.testOwnerRepeatList;
    }

}
