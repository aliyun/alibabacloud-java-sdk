// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasApplicationRequest extends TeaModel {
    @NameInMap("AppDomainId")
    public String appDomainId;

    @NameInMap("AppLevelId")
    public String appLevelId;

    @NameInMap("Authorization")
    public String authorization;

    @NameInMap("BuildpackVersion")
    public String buildpackVersion;

    @NameInMap("ChineseName")
    public String chineseName;

    @NameInMap("CodeRepositoryExisted")
    public Boolean codeRepositoryExisted;

    @NameInMap("CodeRepositoryGroupName")
    public String codeRepositoryGroupName;

    @NameInMap("CodeRepositoryName")
    public String codeRepositoryName;

    @NameInMap("CodeRepositoryType")
    public String codeRepositoryType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateCasApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasApplicationRequest self = new CreateCasApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasApplicationRequest setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public CreateCasApplicationRequest setAppLevelId(String appLevelId) {
        this.appLevelId = appLevelId;
        return this;
    }
    public String getAppLevelId() {
        return this.appLevelId;
    }

    public CreateCasApplicationRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateCasApplicationRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public CreateCasApplicationRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public CreateCasApplicationRequest setCodeRepositoryExisted(Boolean codeRepositoryExisted) {
        this.codeRepositoryExisted = codeRepositoryExisted;
        return this;
    }
    public Boolean getCodeRepositoryExisted() {
        return this.codeRepositoryExisted;
    }

    public CreateCasApplicationRequest setCodeRepositoryGroupName(String codeRepositoryGroupName) {
        this.codeRepositoryGroupName = codeRepositoryGroupName;
        return this;
    }
    public String getCodeRepositoryGroupName() {
        return this.codeRepositoryGroupName;
    }

    public CreateCasApplicationRequest setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
        return this;
    }
    public String getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    public CreateCasApplicationRequest setCodeRepositoryType(String codeRepositoryType) {
        this.codeRepositoryType = codeRepositoryType;
        return this;
    }
    public String getCodeRepositoryType() {
        return this.codeRepositoryType;
    }

    public CreateCasApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCasApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasApplicationRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateCasApplicationRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateCasApplicationRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
