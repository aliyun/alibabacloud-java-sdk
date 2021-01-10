// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackIdVersionPairsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BuildpackCompositeVOs")
    public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs> buildpackCompositeVOs;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeBuildpackIdVersionPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackIdVersionPairsResponseBody self = new DescribeBuildpackIdVersionPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackIdVersionPairsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setBuildpackCompositeVOs(java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs> buildpackCompositeVOs) {
        this.buildpackCompositeVOs = buildpackCompositeVOs;
        return this;
    }
    public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs> getBuildpackCompositeVOs() {
        return this.buildpackCompositeVOs;
    }

    public DescribeBuildpackIdVersionPairsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack extends TeaModel {
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

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS extends TeaModel {
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

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setOsBitNum(Long osBitNum) {
            this.osBitNum = osBitNum;
            return this;
        }
        public Long getOsBitNum() {
            return this.osBitNum;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
            this.supportedCloudDisplayNames = supportedCloudDisplayNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudDisplayNames() {
            return this.supportedCloudDisplayNames;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
            this.supportedCloudNames = supportedCloudNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudNames() {
            return this.supportedCloudNames;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions extends TeaModel {
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
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion region;

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

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setRegion(DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion region) {
            this.region = region;
            return this;
        }
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegionsRegion getRegion() {
            return this.region;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Publisher")
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher publisher;

        @NameInMap("FullVersion")
        public String fullVersion;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("Techstack")
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack techstack;

        @NameInMap("SupportedOS")
        public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS> supportedOS;

        @NameInMap("AppServiceCount")
        public Long appServiceCount;

        @NameInMap("Id")
        public String id;

        @NameInMap("SupportedRegions")
        public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions> supportedRegions;

        @NameInMap("Creator")
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator creator;

        public static DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs self = new DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setPublisher(DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher publisher) {
            this.publisher = publisher;
            return this;
        }
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsPublisher getPublisher() {
            return this.publisher;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setTechstack(DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack techstack) {
            this.techstack = techstack;
            return this;
        }
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsTechstack getTechstack() {
            return this.techstack;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setSupportedOS(java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS> supportedOS) {
            this.supportedOS = supportedOS;
            return this;
        }
        public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedOS> getSupportedOS() {
            return this.supportedOS;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setAppServiceCount(Long appServiceCount) {
            this.appServiceCount = appServiceCount;
            return this;
        }
        public Long getAppServiceCount() {
            return this.appServiceCount;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setSupportedRegions(java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions> supportedRegions) {
            this.supportedRegions = supportedRegions;
            return this;
        }
        public java.util.List<DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsSupportedRegions> getSupportedRegions() {
            return this.supportedRegions;
        }

        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOs setCreator(DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator creator) {
            this.creator = creator;
            return this;
        }
        public DescribeBuildpackIdVersionPairsResponseBodyBuildpackCompositeVOsCreator getCreator() {
            return this.creator;
        }

    }

}
