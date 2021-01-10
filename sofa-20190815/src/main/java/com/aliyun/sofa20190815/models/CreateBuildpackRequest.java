// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateBuildpackRequest extends TeaModel {
    @NameInMap("BuildCommand")
    public String buildCommand;

    @NameInMap("ContactInfo")
    public String contactInfo;

    @NameInMap("DebugMode")
    public Boolean debugMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("FullVersion")
    public String fullVersion;

    @NameInMap("Id")
    public String id;

    @NameInMap("MajorVersion")
    public Long majorVersion;

    @NameInMap("MinorVersion")
    public Long minorVersion;

    @NameInMap("PatchVersion")
    public Long patchVersion;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Status")
    public String status;

    @NameInMap("StorageUploadEndpoints")
    public String storageUploadEndpoints;

    @NameInMap("TechstackJsonStr")
    public String techstackJsonStr;

    @NameInMap("TechstackId")
    public Long techstackId;

    @NameInMap("AvailableTenantNamesRepeatList")
    public java.util.List<String> availableTenantNamesRepeatList;

    @NameInMap("BuildpackParams")
    public java.util.List<CreateBuildpackRequestBuildpackParams> buildpackParams;

    @NameInMap("BuildCommandParams")
    public java.util.List<CreateBuildpackRequestBuildCommandParams> buildCommandParams;

    @NameInMap("SupportedOsRepeatList")
    public java.util.List<Integer> supportedOsRepeatList;

    @NameInMap("SupportedRegions")
    public java.util.List<CreateBuildpackRequestSupportedRegions> supportedRegions;

    public static CreateBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackRequest self = new CreateBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public CreateBuildpackRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public CreateBuildpackRequest setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }
    public Boolean getDebugMode() {
        return this.debugMode;
    }

    public CreateBuildpackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public CreateBuildpackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBuildpackRequest setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public CreateBuildpackRequest setMinorVersion(Long minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public Long getMinorVersion() {
        return this.minorVersion;
    }

    public CreateBuildpackRequest setPatchVersion(Long patchVersion) {
        this.patchVersion = patchVersion;
        return this;
    }
    public Long getPatchVersion() {
        return this.patchVersion;
    }

    public CreateBuildpackRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateBuildpackRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateBuildpackRequest setStorageUploadEndpoints(String storageUploadEndpoints) {
        this.storageUploadEndpoints = storageUploadEndpoints;
        return this;
    }
    public String getStorageUploadEndpoints() {
        return this.storageUploadEndpoints;
    }

    public CreateBuildpackRequest setTechstackJsonStr(String techstackJsonStr) {
        this.techstackJsonStr = techstackJsonStr;
        return this;
    }
    public String getTechstackJsonStr() {
        return this.techstackJsonStr;
    }

    public CreateBuildpackRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public CreateBuildpackRequest setAvailableTenantNamesRepeatList(java.util.List<String> availableTenantNamesRepeatList) {
        this.availableTenantNamesRepeatList = availableTenantNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAvailableTenantNamesRepeatList() {
        return this.availableTenantNamesRepeatList;
    }

    public CreateBuildpackRequest setBuildpackParams(java.util.List<CreateBuildpackRequestBuildpackParams> buildpackParams) {
        this.buildpackParams = buildpackParams;
        return this;
    }
    public java.util.List<CreateBuildpackRequestBuildpackParams> getBuildpackParams() {
        return this.buildpackParams;
    }

    public CreateBuildpackRequest setBuildCommandParams(java.util.List<CreateBuildpackRequestBuildCommandParams> buildCommandParams) {
        this.buildCommandParams = buildCommandParams;
        return this;
    }
    public java.util.List<CreateBuildpackRequestBuildCommandParams> getBuildCommandParams() {
        return this.buildCommandParams;
    }

    public CreateBuildpackRequest setSupportedOsRepeatList(java.util.List<Integer> supportedOsRepeatList) {
        this.supportedOsRepeatList = supportedOsRepeatList;
        return this;
    }
    public java.util.List<Integer> getSupportedOsRepeatList() {
        return this.supportedOsRepeatList;
    }

    public CreateBuildpackRequest setSupportedRegions(java.util.List<CreateBuildpackRequestSupportedRegions> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<CreateBuildpackRequestSupportedRegions> getSupportedRegions() {
        return this.supportedRegions;
    }

    public static class CreateBuildpackRequestBuildpackParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("Key")
        public String key;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Description")
        public String description;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("Id")
        public String id;

        public static CreateBuildpackRequestBuildpackParams build(java.util.Map<String, ?> map) throws Exception {
            CreateBuildpackRequestBuildpackParams self = new CreateBuildpackRequestBuildpackParams();
            return TeaModel.build(map, self);
        }

        public CreateBuildpackRequestBuildpackParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public CreateBuildpackRequestBuildpackParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBuildpackRequestBuildpackParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateBuildpackRequestBuildpackParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBuildpackRequestBuildpackParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateBuildpackRequestBuildpackParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public CreateBuildpackRequestBuildpackParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateBuildpackRequestBuildCommandParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        public static CreateBuildpackRequestBuildCommandParams build(java.util.Map<String, ?> map) throws Exception {
            CreateBuildpackRequestBuildCommandParams self = new CreateBuildpackRequestBuildCommandParams();
            return TeaModel.build(map, self);
        }

        public CreateBuildpackRequestBuildCommandParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public CreateBuildpackRequestBuildCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBuildpackRequestBuildCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateBuildpackRequestBuildCommandParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class CreateBuildpackRequestSupportedRegions extends TeaModel {
        @NameInMap("FileChecksum")
        public String fileChecksum;

        @NameInMap("BuildpackTenantId")
        public String buildpackTenantId;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("FromRegionId")
        public String fromRegionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("FileLocation")
        public String fileLocation;

        @NameInMap("ReadableFileSize")
        public String readableFileSize;

        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("RegionIdentity")
        public String regionIdentity;

        @NameInMap("FileSize")
        public Long fileSize;

        public static CreateBuildpackRequestSupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            CreateBuildpackRequestSupportedRegions self = new CreateBuildpackRequestSupportedRegions();
            return TeaModel.build(map, self);
        }

        public CreateBuildpackRequestSupportedRegions setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public CreateBuildpackRequestSupportedRegions setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public CreateBuildpackRequestSupportedRegions setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public CreateBuildpackRequestSupportedRegions setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public CreateBuildpackRequestSupportedRegions setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public CreateBuildpackRequestSupportedRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateBuildpackRequestSupportedRegions setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public CreateBuildpackRequestSupportedRegions setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public CreateBuildpackRequestSupportedRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public CreateBuildpackRequestSupportedRegions setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public CreateBuildpackRequestSupportedRegions setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public CreateBuildpackRequestSupportedRegions setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public CreateBuildpackRequestSupportedRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBuildpackRequestSupportedRegions setRegionIdentity(String regionIdentity) {
            this.regionIdentity = regionIdentity;
            return this;
        }
        public String getRegionIdentity() {
            return this.regionIdentity;
        }

        public CreateBuildpackRequestSupportedRegions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

}
