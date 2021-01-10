// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyBuildpackRequest extends TeaModel {
    @NameInMap("AvailableTenantNamesRepeatList")
    public java.util.List<String> availableTenantNamesRepeatList;

    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("BuildpackParams")
    public java.util.List<ModifyBuildpackRequestBuildpackParams> buildpackParams;

    @NameInMap("ContactInfo")
    public String contactInfo;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvParams")
    public java.util.List<ModifyBuildpackRequestEnvParams> envParams;

    @NameInMap("FullVersion")
    public String fullVersion;

    @NameInMap("Id")
    public String id;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportedOsRepeatList")
    public java.util.List<Long> supportedOsRepeatList;

    @NameInMap("SupportedRegions")
    public java.util.List<ModifyBuildpackRequestSupportedRegions> supportedRegions;

    @NameInMap("TechstackId")
    public String techstackId;

    public static ModifyBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuildpackRequest self = new ModifyBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBuildpackRequest setAvailableTenantNamesRepeatList(java.util.List<String> availableTenantNamesRepeatList) {
        this.availableTenantNamesRepeatList = availableTenantNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAvailableTenantNamesRepeatList() {
        return this.availableTenantNamesRepeatList;
    }

    public ModifyBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public ModifyBuildpackRequest setBuildpackParams(java.util.List<ModifyBuildpackRequestBuildpackParams> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<ModifyBuildpackRequestBuildpackParams> getBuildpackParams() {
        return this.buildpackParams;
    }

    public ModifyBuildpackRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public ModifyBuildpackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBuildpackRequest setEnvParams(java.util.List<ModifyBuildpackRequestEnvParams> envParams) {
        this.envParams = envParams;
        return this;
    }
    public java.util.List<ModifyBuildpackRequestEnvParams> getEnvParams() {
        return this.envParams;
    }

    public ModifyBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public ModifyBuildpackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyBuildpackRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ModifyBuildpackRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyBuildpackRequest setSupportedOsRepeatList(java.util.List<Long> supportedOsRepeatList) {
        this.supportedOsRepeatList = supportedOsRepeatList;
        return this;
    }
    public java.util.List<Long> getSupportedOsRepeatList() {
        return this.supportedOsRepeatList;
    }

    public ModifyBuildpackRequest setSupportedRegions(java.util.List<ModifyBuildpackRequestSupportedRegions> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<ModifyBuildpackRequestSupportedRegions> getSupportedRegions() {
        return this.supportedRegions;
    }

    public ModifyBuildpackRequest setTechstackId(String techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public String getTechstackId() {
        return this.techstackId;
    }

    public static class ModifyBuildpackRequestBuildpackParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("Required")
        public Boolean required;

        public static ModifyBuildpackRequestBuildpackParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyBuildpackRequestBuildpackParams self = new ModifyBuildpackRequestBuildpackParams();
            return TeaModel.build(map, self);
        }

        public ModifyBuildpackRequestBuildpackParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public ModifyBuildpackRequestBuildpackParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ModifyBuildpackRequestBuildpackParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyBuildpackRequestBuildpackParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyBuildpackRequestBuildpackParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyBuildpackRequestBuildpackParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ModifyBuildpackRequestBuildpackParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class ModifyBuildpackRequestEnvParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("Required")
        public Boolean required;

        public static ModifyBuildpackRequestEnvParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyBuildpackRequestEnvParams self = new ModifyBuildpackRequestEnvParams();
            return TeaModel.build(map, self);
        }

        public ModifyBuildpackRequestEnvParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public ModifyBuildpackRequestEnvParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ModifyBuildpackRequestEnvParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyBuildpackRequestEnvParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyBuildpackRequestEnvParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyBuildpackRequestEnvParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ModifyBuildpackRequestEnvParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class ModifyBuildpackRequestSupportedRegions extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("BuildpackTenantId")
        public String buildpackTenantId;

        @NameInMap("FileChecksum")
        public String fileChecksum;

        @NameInMap("FileLocation")
        public String fileLocation;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("FromRegionId")
        public String fromRegionId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("ReadableFileSize")
        public String readableFileSize;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionIdentity")
        public String regionIdentity;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("StorageType")
        public String storageType;

        public static ModifyBuildpackRequestSupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            ModifyBuildpackRequestSupportedRegions self = new ModifyBuildpackRequestSupportedRegions();
            return TeaModel.build(map, self);
        }

        public ModifyBuildpackRequestSupportedRegions setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public ModifyBuildpackRequestSupportedRegions setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public ModifyBuildpackRequestSupportedRegions setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public ModifyBuildpackRequestSupportedRegions setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public ModifyBuildpackRequestSupportedRegions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ModifyBuildpackRequestSupportedRegions setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public ModifyBuildpackRequestSupportedRegions setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public ModifyBuildpackRequestSupportedRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyBuildpackRequestSupportedRegions setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ModifyBuildpackRequestSupportedRegions setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public ModifyBuildpackRequestSupportedRegions setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public ModifyBuildpackRequestSupportedRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyBuildpackRequestSupportedRegions setRegionIdentity(String regionIdentity) {
            this.regionIdentity = regionIdentity;
            return this;
        }
        public String getRegionIdentity() {
            return this.regionIdentity;
        }

        public ModifyBuildpackRequestSupportedRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ModifyBuildpackRequestSupportedRegions setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
