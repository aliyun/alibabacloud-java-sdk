// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCASApplicationRequest extends TeaModel {
    @NameInMap("AppDomainId")
    public String appDomainId;

    @NameInMap("AppExtraInfos")
    public java.util.List<UpdateCASApplicationRequestAppExtraInfos> appExtraInfos;

    @NameInMap("AppLevelJsonStr")
    public String appLevelJsonStr;

    @NameInMap("AppOwnerJsonStr")
    public String appOwnerJsonStr;

    @NameInMap("ArchetypeJsonStr")
    public String archetypeJsonStr;

    @NameInMap("BuildpackVersion")
    public String buildpackVersion;

    @NameInMap("ChineseName")
    public String chineseName;

    @NameInMap("CodeRepositoryJsonStr")
    public String codeRepositoryJsonStr;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Id")
    public String id;

    @NameInMap("IsService")
    public Boolean isService;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("UtcCreate")
    public String utcCreate;

    @NameInMap("UtcModified")
    public String utcModified;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateCASApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCASApplicationRequest self = new UpdateCASApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCASApplicationRequest setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public UpdateCASApplicationRequest setAppExtraInfos(java.util.List<UpdateCASApplicationRequestAppExtraInfos> appExtraInfos) {
        this.appExtraInfos = appExtraInfos;
        return this;
    }
    public java.util.List<UpdateCASApplicationRequestAppExtraInfos> getAppExtraInfos() {
        return this.appExtraInfos;
    }

    public UpdateCASApplicationRequest setAppLevelJsonStr(String appLevelJsonStr) {
        this.appLevelJsonStr = appLevelJsonStr;
        return this;
    }
    public String getAppLevelJsonStr() {
        return this.appLevelJsonStr;
    }

    public UpdateCASApplicationRequest setAppOwnerJsonStr(String appOwnerJsonStr) {
        this.appOwnerJsonStr = appOwnerJsonStr;
        return this;
    }
    public String getAppOwnerJsonStr() {
        return this.appOwnerJsonStr;
    }

    public UpdateCASApplicationRequest setArchetypeJsonStr(String archetypeJsonStr) {
        this.archetypeJsonStr = archetypeJsonStr;
        return this;
    }
    public String getArchetypeJsonStr() {
        return this.archetypeJsonStr;
    }

    public UpdateCASApplicationRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public UpdateCASApplicationRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public UpdateCASApplicationRequest setCodeRepositoryJsonStr(String codeRepositoryJsonStr) {
        this.codeRepositoryJsonStr = codeRepositoryJsonStr;
        return this;
    }
    public String getCodeRepositoryJsonStr() {
        return this.codeRepositoryJsonStr;
    }

    public UpdateCASApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCASApplicationRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UpdateCASApplicationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCASApplicationRequest setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public UpdateCASApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCASApplicationRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateCASApplicationRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateCASApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCASApplicationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateCASApplicationRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public UpdateCASApplicationRequest setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public UpdateCASApplicationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateCASApplicationRequestAppExtraInfos extends TeaModel {
        @NameInMap("AppExtrainfoId")
        public String appExtrainfoId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateDataId")
        public String templateDataId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Value")
        public String value;

        public static UpdateCASApplicationRequestAppExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateCASApplicationRequestAppExtraInfos self = new UpdateCASApplicationRequestAppExtraInfos();
            return TeaModel.build(map, self);
        }

        public UpdateCASApplicationRequestAppExtraInfos setAppExtrainfoId(String appExtrainfoId) {
            this.appExtrainfoId = appExtrainfoId;
            return this;
        }
        public String getAppExtrainfoId() {
            return this.appExtrainfoId;
        }

        public UpdateCASApplicationRequestAppExtraInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateCASApplicationRequestAppExtraInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCASApplicationRequestAppExtraInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCASApplicationRequestAppExtraInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCASApplicationRequestAppExtraInfos setTemplateDataId(String templateDataId) {
            this.templateDataId = templateDataId;
            return this;
        }
        public String getTemplateDataId() {
            return this.templateDataId;
        }

        public UpdateCASApplicationRequestAppExtraInfos setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateCASApplicationRequestAppExtraInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCASApplicationRequestAppExtraInfos setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public UpdateCASApplicationRequestAppExtraInfos setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public UpdateCASApplicationRequestAppExtraInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
