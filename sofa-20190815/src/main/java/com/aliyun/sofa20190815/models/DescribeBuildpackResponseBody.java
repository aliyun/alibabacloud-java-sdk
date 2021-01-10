// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Buildpacks")
    public java.util.List<DescribeBuildpackResponseBodyBuildpacks> buildpacks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeBuildpackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackResponseBody self = new DescribeBuildpackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeBuildpackResponseBody setBuildpacks(java.util.List<DescribeBuildpackResponseBodyBuildpacks> buildpacks) {
        this.buildpacks = buildpacks;
        return this;
    }
    public java.util.List<DescribeBuildpackResponseBodyBuildpacks> getBuildpacks() {
        return this.buildpacks;
    }

    public DescribeBuildpackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBuildpackResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBuildpackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeBuildpackResponseBodyBuildpacksSupportedOs extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("OsBit")
        public Long osBit;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public String version;

        @NameInMap("OsBitNum")
        public Long osBitNum;

        @NameInMap("SupportedCloudDisplayNames")
        public java.util.List<String> supportedCloudDisplayNames;

        @NameInMap("SupportedCloudNames")
        public java.util.List<String> supportedCloudNames;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DescribeBuildpackResponseBodyBuildpacksSupportedOs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackResponseBodyBuildpacksSupportedOs self = new DescribeBuildpackResponseBodyBuildpacksSupportedOs();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setOsBitNum(Long osBitNum) {
            this.osBitNum = osBitNum;
            return this;
        }
        public Long getOsBitNum() {
            return this.osBitNum;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
            this.supportedCloudDisplayNames = supportedCloudDisplayNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudDisplayNames() {
            return this.supportedCloudDisplayNames;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
            this.supportedCloudNames = supportedCloudNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudNames() {
            return this.supportedCloudNames;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedOs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeBuildpackResponseBodyBuildpacksTechstack extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeBuildpackResponseBodyBuildpacksTechstack build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackResponseBodyBuildpacksTechstack self = new DescribeBuildpackResponseBodyBuildpacksTechstack();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackResponseBodyBuildpacksTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("BuildpackTenantId")
        public String buildpackTenantId;

        @NameInMap("FileChecksum")
        public String fileChecksum;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("State")
        public String state;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("ZoneDtos")
        public String zoneDtos;

        @NameInMap("FromRegionId")
        public String fromRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("IaasProviderId")
        public String iaasProviderId;

        @NameInMap("FileLocation")
        public String fileLocation;

        @NameInMap("ReadableFileSize")
        public String readableFileSize;

        @NameInMap("Name")
        public String name;

        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("FileSize")
        public Long fileSize;

        public static DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion self = new DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setZoneDtos(String zoneDtos) {
            this.zoneDtos = zoneDtos;
            return this;
        }
        public String getZoneDtos() {
            return this.zoneDtos;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setIaasProviderId(String iaasProviderId) {
            this.iaasProviderId = iaasProviderId;
            return this;
        }
        public String getIaasProviderId() {
            return this.iaasProviderId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

    public static class DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FileChecksum")
        public String fileChecksum;

        @NameInMap("BuildpackTenantId")
        public String buildpackTenantId;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("FromRegionId")
        public String fromRegionId;

        @NameInMap("Region")
        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion region;

        @NameInMap("FileLocation")
        public String fileLocation;

        @NameInMap("ReadableFileSize")
        public String readableFileSize;

        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("FileSize")
        public Long fileSize;

        public static DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList self = new DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setRegion(DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion region) {
            this.region = region;
            return this;
        }
        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsListRegion getRegion() {
            return this.region;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

    public static class DescribeBuildpackResponseBodyBuildpacks extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("FullVersion")
        public String fullVersion;

        @NameInMap("SupportedOs")
        public java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedOs> supportedOs;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("DebugMode")
        public Boolean debugMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("ContactInfo")
        public String contactInfo;

        @NameInMap("Techstack")
        public DescribeBuildpackResponseBodyBuildpacksTechstack techstack;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("CreatedFrom")
        public String createdFrom;

        @NameInMap("BuildCommand")
        public String buildCommand;

        @NameInMap("TechstackId")
        public Long techstackId;

        @NameInMap("PublicationTimeDate")
        public String publicationTimeDate;

        @NameInMap("PatchVersion")
        public Long patchVersion;

        @NameInMap("AppServiceCount")
        public Long appServiceCount;

        @NameInMap("MinorVersion")
        public Long minorVersion;

        @NameInMap("SupportedRegions")
        public java.util.List<String> supportedRegions;

        @NameInMap("CreationChain")
        public java.util.List<String> creationChain;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("AvailableTenantNames")
        public java.util.List<String> availableTenantNames;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("SupportedRegionsList")
        public java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList> supportedRegionsList;

        @NameInMap("DepracationNote")
        public String depracationNote;

        @NameInMap("MajorVersion")
        public Long majorVersion;

        @NameInMap("Id")
        public String id;

        @NameInMap("PublicationTime")
        public String publicationTime;

        @NameInMap("IndustryLabel")
        public String industryLabel;

        @NameInMap("TenantId")
        public String tenantId;

        public static DescribeBuildpackResponseBodyBuildpacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackResponseBodyBuildpacks self = new DescribeBuildpackResponseBodyBuildpacks();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackResponseBodyBuildpacks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBuildpackResponseBodyBuildpacks setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeBuildpackResponseBodyBuildpacks setSupportedOs(java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedOs> supportedOs) {
            this.supportedOs = supportedOs;
            return this;
        }
        public java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedOs> getSupportedOs() {
            return this.supportedOs;
        }

        public DescribeBuildpackResponseBodyBuildpacks setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacks setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public Boolean getDebugMode() {
            return this.debugMode;
        }

        public DescribeBuildpackResponseBodyBuildpacks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackResponseBodyBuildpacks setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public String getContactInfo() {
            return this.contactInfo;
        }

        public DescribeBuildpackResponseBodyBuildpacks setTechstack(DescribeBuildpackResponseBodyBuildpacksTechstack techstack) {
            this.techstack = techstack;
            return this;
        }
        public DescribeBuildpackResponseBodyBuildpacksTechstack getTechstack() {
            return this.techstack;
        }

        public DescribeBuildpackResponseBodyBuildpacks setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeBuildpackResponseBodyBuildpacks setCreatedFrom(String createdFrom) {
            this.createdFrom = createdFrom;
            return this;
        }
        public String getCreatedFrom() {
            return this.createdFrom;
        }

        public DescribeBuildpackResponseBodyBuildpacks setBuildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }
        public String getBuildCommand() {
            return this.buildCommand;
        }

        public DescribeBuildpackResponseBodyBuildpacks setTechstackId(Long techstackId) {
            this.techstackId = techstackId;
            return this;
        }
        public Long getTechstackId() {
            return this.techstackId;
        }

        public DescribeBuildpackResponseBodyBuildpacks setPublicationTimeDate(String publicationTimeDate) {
            this.publicationTimeDate = publicationTimeDate;
            return this;
        }
        public String getPublicationTimeDate() {
            return this.publicationTimeDate;
        }

        public DescribeBuildpackResponseBodyBuildpacks setPatchVersion(Long patchVersion) {
            this.patchVersion = patchVersion;
            return this;
        }
        public Long getPatchVersion() {
            return this.patchVersion;
        }

        public DescribeBuildpackResponseBodyBuildpacks setAppServiceCount(Long appServiceCount) {
            this.appServiceCount = appServiceCount;
            return this;
        }
        public Long getAppServiceCount() {
            return this.appServiceCount;
        }

        public DescribeBuildpackResponseBodyBuildpacks setMinorVersion(Long minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public Long getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeBuildpackResponseBodyBuildpacks setSupportedRegions(java.util.List<String> supportedRegions) {
            this.supportedRegions = supportedRegions;
            return this;
        }
        public java.util.List<String> getSupportedRegions() {
            return this.supportedRegions;
        }

        public DescribeBuildpackResponseBodyBuildpacks setCreationChain(java.util.List<String> creationChain) {
            this.creationChain = creationChain;
            return this;
        }
        public java.util.List<String> getCreationChain() {
            return this.creationChain;
        }

        public DescribeBuildpackResponseBodyBuildpacks setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackResponseBodyBuildpacks setAvailableTenantNames(java.util.List<String> availableTenantNames) {
            this.availableTenantNames = availableTenantNames;
            return this;
        }
        public java.util.List<String> getAvailableTenantNames() {
            return this.availableTenantNames;
        }

        public DescribeBuildpackResponseBodyBuildpacks setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeBuildpackResponseBodyBuildpacks setSupportedRegionsList(java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList> supportedRegionsList) {
            this.supportedRegionsList = supportedRegionsList;
            return this;
        }
        public java.util.List<DescribeBuildpackResponseBodyBuildpacksSupportedRegionsList> getSupportedRegionsList() {
            return this.supportedRegionsList;
        }

        public DescribeBuildpackResponseBodyBuildpacks setDepracationNote(String depracationNote) {
            this.depracationNote = depracationNote;
            return this;
        }
        public String getDepracationNote() {
            return this.depracationNote;
        }

        public DescribeBuildpackResponseBodyBuildpacks setMajorVersion(Long majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public Long getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeBuildpackResponseBodyBuildpacks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBuildpackResponseBodyBuildpacks setPublicationTime(String publicationTime) {
            this.publicationTime = publicationTime;
            return this;
        }
        public String getPublicationTime() {
            return this.publicationTime;
        }

        public DescribeBuildpackResponseBodyBuildpacks setIndustryLabel(String industryLabel) {
            this.industryLabel = industryLabel;
            return this;
        }
        public String getIndustryLabel() {
            return this.industryLabel;
        }

        public DescribeBuildpackResponseBodyBuildpacks setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
