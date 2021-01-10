// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetBuildpackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BuildpackDetailVO")
    public GetBuildpackResponseBodyBuildpackDetailVO buildpackDetailVO;

    public static GetBuildpackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackResponseBody self = new GetBuildpackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBuildpackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBuildpackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBuildpackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetBuildpackResponseBody setBuildpackDetailVO(GetBuildpackResponseBodyBuildpackDetailVO buildpackDetailVO) {
        this.buildpackDetailVO = buildpackDetailVO;
        return this;
    }
    public GetBuildpackResponseBodyBuildpackDetailVO getBuildpackDetailVO() {
        return this.buildpackDetailVO;
    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams extends TeaModel {
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

        public static GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams self = new GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams self = new GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Url")
        public String url;

        public static GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints self = new GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOSupportedOS extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsBit")
        public Long osBit;

        @NameInMap("OsBitNum")
        public Long osBitNum;

        @NameInMap("Version")
        public String version;

        @NameInMap("SupportedCloudDisplayNames")
        public java.util.List<String> supportedCloudDisplayNames;

        @NameInMap("SupportedCloudNames")
        public java.util.List<String> supportedCloudNames;

        public static GetBuildpackResponseBodyBuildpackDetailVOSupportedOS build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOSupportedOS self = new GetBuildpackResponseBodyBuildpackDetailVOSupportedOS();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setOsBitNum(Long osBitNum) {
            this.osBitNum = osBitNum;
            return this;
        }
        public Long getOsBitNum() {
            return this.osBitNum;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
            this.supportedCloudDisplayNames = supportedCloudDisplayNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudDisplayNames() {
            return this.supportedCloudDisplayNames;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedOS setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
            this.supportedCloudNames = supportedCloudNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudNames() {
            return this.supportedCloudNames;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion self = new GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("BuildpackTenantId")
        public String buildpackTenantId;

        @NameInMap("CreationTime")
        public String creationTime;

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

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("ReadableFileSize")
        public String readableFileSize;

        @NameInMap("Region")
        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion region;

        public static GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions self = new GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions setRegion(GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion region) {
            this.region = region;
            return this;
        }
        public GetBuildpackResponseBodyBuildpackDetailVOSupportedRegionsRegion getRegion() {
            return this.region;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOCreator extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Type")
        public String type;

        public static GetBuildpackResponseBodyBuildpackDetailVOCreator build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOCreator self = new GetBuildpackResponseBodyBuildpackDetailVOCreator();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOCreator setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOCreator setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOCreator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOPublisher extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Type")
        public String type;

        public static GetBuildpackResponseBodyBuildpackDetailVOPublisher build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOPublisher self = new GetBuildpackResponseBodyBuildpackDetailVOPublisher();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOPublisher setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOPublisher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOPublisher setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOPublisher setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVOTechstack extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Status")
        public String status;

        public static GetBuildpackResponseBodyBuildpackDetailVOTechstack build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVOTechstack self = new GetBuildpackResponseBodyBuildpackDetailVOTechstack();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetBuildpackResponseBodyBuildpackDetailVOTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBuildpackResponseBodyBuildpackDetailVO extends TeaModel {
        @NameInMap("AppServiceCount")
        public Long appServiceCount;

        @NameInMap("BuildCommand")
        public String buildCommand;

        @NameInMap("ContactInfo")
        public String contactInfo;

        @NameInMap("CreatedFrom")
        public String createdFrom;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DebugMode")
        public Boolean debugMode;

        @NameInMap("DepracationNote")
        public String depracationNote;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("FullVersion")
        public String fullVersion;

        @NameInMap("Id")
        public String id;

        @NameInMap("IndustryLabel")
        public String industryLabel;

        @NameInMap("MajorVersion")
        public Long majorVersion;

        @NameInMap("MinorVersion")
        public Long minorVersion;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PatchVersion")
        public Long patchVersion;

        @NameInMap("PublicationTime")
        public String publicationTime;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("AvailableTenantNames")
        public java.util.List<String> availableTenantNames;

        @NameInMap("CreationChain")
        public java.util.List<String> creationChain;

        @NameInMap("BuildpackParams")
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams> buildpackParams;

        @NameInMap("BuildCommandParams")
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams> buildCommandParams;

        @NameInMap("StorageUploadEndpoints")
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints> storageUploadEndpoints;

        @NameInMap("SupportedOS")
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedOS> supportedOS;

        @NameInMap("SupportedRegions")
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions> supportedRegions;

        @NameInMap("Creator")
        public GetBuildpackResponseBodyBuildpackDetailVOCreator creator;

        @NameInMap("Publisher")
        public GetBuildpackResponseBodyBuildpackDetailVOPublisher publisher;

        @NameInMap("Techstack")
        public GetBuildpackResponseBodyBuildpackDetailVOTechstack techstack;

        public static GetBuildpackResponseBodyBuildpackDetailVO build(java.util.Map<String, ?> map) throws Exception {
            GetBuildpackResponseBodyBuildpackDetailVO self = new GetBuildpackResponseBodyBuildpackDetailVO();
            return TeaModel.build(map, self);
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setAppServiceCount(Long appServiceCount) {
            this.appServiceCount = appServiceCount;
            return this;
        }
        public Long getAppServiceCount() {
            return this.appServiceCount;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setBuildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }
        public String getBuildCommand() {
            return this.buildCommand;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public String getContactInfo() {
            return this.contactInfo;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setCreatedFrom(String createdFrom) {
            this.createdFrom = createdFrom;
            return this;
        }
        public String getCreatedFrom() {
            return this.createdFrom;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public Boolean getDebugMode() {
            return this.debugMode;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setDepracationNote(String depracationNote) {
            this.depracationNote = depracationNote;
            return this;
        }
        public String getDepracationNote() {
            return this.depracationNote;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setIndustryLabel(String industryLabel) {
            this.industryLabel = industryLabel;
            return this;
        }
        public String getIndustryLabel() {
            return this.industryLabel;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setMajorVersion(Long majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public Long getMajorVersion() {
            return this.majorVersion;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setMinorVersion(Long minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public Long getMinorVersion() {
            return this.minorVersion;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setPatchVersion(Long patchVersion) {
            this.patchVersion = patchVersion;
            return this;
        }
        public Long getPatchVersion() {
            return this.patchVersion;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setPublicationTime(String publicationTime) {
            this.publicationTime = publicationTime;
            return this;
        }
        public String getPublicationTime() {
            return this.publicationTime;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setAvailableTenantNames(java.util.List<String> availableTenantNames) {
            this.availableTenantNames = availableTenantNames;
            return this;
        }
        public java.util.List<String> getAvailableTenantNames() {
            return this.availableTenantNames;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setCreationChain(java.util.List<String> creationChain) {
            this.creationChain = creationChain;
            return this;
        }
        public java.util.List<String> getCreationChain() {
            return this.creationChain;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setBuildpackParams(java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams> buildpackParams) {
            this.buildpackParams = buildpackParams;
            return this;
        }
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildpackParams> getBuildpackParams() {
            return this.buildpackParams;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setBuildCommandParams(java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams> buildCommandParams) {
            this.buildCommandParams = buildCommandParams;
            return this;
        }
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOBuildCommandParams> getBuildCommandParams() {
            return this.buildCommandParams;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setStorageUploadEndpoints(java.util.List<GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints> storageUploadEndpoints) {
            this.storageUploadEndpoints = storageUploadEndpoints;
            return this;
        }
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOStorageUploadEndpoints> getStorageUploadEndpoints() {
            return this.storageUploadEndpoints;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setSupportedOS(java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedOS> supportedOS) {
            this.supportedOS = supportedOS;
            return this;
        }
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedOS> getSupportedOS() {
            return this.supportedOS;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setSupportedRegions(java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions> supportedRegions) {
            this.supportedRegions = supportedRegions;
            return this;
        }
        public java.util.List<GetBuildpackResponseBodyBuildpackDetailVOSupportedRegions> getSupportedRegions() {
            return this.supportedRegions;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setCreator(GetBuildpackResponseBodyBuildpackDetailVOCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetBuildpackResponseBodyBuildpackDetailVOCreator getCreator() {
            return this.creator;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setPublisher(GetBuildpackResponseBodyBuildpackDetailVOPublisher publisher) {
            this.publisher = publisher;
            return this;
        }
        public GetBuildpackResponseBodyBuildpackDetailVOPublisher getPublisher() {
            return this.publisher;
        }

        public GetBuildpackResponseBodyBuildpackDetailVO setTechstack(GetBuildpackResponseBodyBuildpackDetailVOTechstack techstack) {
            this.techstack = techstack;
            return this;
        }
        public GetBuildpackResponseBodyBuildpackDetailVOTechstack getTechstack() {
            return this.techstack;
        }

    }

}
