// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteBuildpacksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildpackDetailVo")
    public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVo> buildpackDetailVo;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteBuildpacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBuildpacksResponseBody self = new DeleteBuildpacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBuildpacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBuildpacksResponseBody setBuildpackDetailVo(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVo> buildpackDetailVo) {
        this.buildpackDetailVo = buildpackDetailVo;
        return this;
    }
    public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVo> getBuildpackDetailVo() {
        return this.buildpackDetailVo;
    }

    public DeleteBuildpacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteBuildpacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams extends TeaModel {
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

        @NameInMap("Id")
        public String id;

        @NameInMap("Readonly")
        public Boolean readonly;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams self = new DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoCreator extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoCreator build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoCreator self = new DeleteBuildpacksResponseBodyBuildpackDetailVoCreator();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack extends TeaModel {
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

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack self = new DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Name")
        public String name;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher self = new DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS extends TeaModel {
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

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS self = new DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setOsBitNum(Long osBitNum) {
            this.osBitNum = osBitNum;
            return this;
        }
        public Long getOsBitNum() {
            return this.osBitNum;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
            this.supportedCloudDisplayNames = supportedCloudDisplayNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudDisplayNames() {
            return this.supportedCloudDisplayNames;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
            this.supportedCloudNames = supportedCloudNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudNames() {
            return this.supportedCloudNames;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion self = new DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions extends TeaModel {
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
        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion region;

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

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions self = new DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setFileChecksum(String fileChecksum) {
            this.fileChecksum = fileChecksum;
            return this;
        }
        public String getFileChecksum() {
            return this.fileChecksum;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setBuildpackTenantId(String buildpackTenantId) {
            this.buildpackTenantId = buildpackTenantId;
            return this;
        }
        public String getBuildpackTenantId() {
            return this.buildpackTenantId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setFromRegionId(String fromRegionId) {
            this.fromRegionId = fromRegionId;
            return this;
        }
        public String getFromRegionId() {
            return this.fromRegionId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setRegion(DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion region) {
            this.region = region;
            return this;
        }
        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegionsRegion getRegion() {
            return this.region;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setReadableFileSize(String readableFileSize) {
            this.readableFileSize = readableFileSize;
            return this;
        }
        public String getReadableFileSize() {
            return this.readableFileSize;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("Url")
        public String url;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Bucket")
        public String bucket;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints self = new DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams extends TeaModel {
        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams self = new DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DeleteBuildpacksResponseBodyBuildpackDetailVo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("FullVersion")
        public String fullVersion;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("BuildpackParams")
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams> buildpackParams;

        @NameInMap("Creator")
        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator creator;

        @NameInMap("DebugMode")
        public Boolean debugMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("ContactInfo")
        public String contactInfo;

        @NameInMap("Techstack")
        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack techstack;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("CreatedFrom")
        public String createdFrom;

        @NameInMap("BuildCommand")
        public String buildCommand;

        @NameInMap("Publisher")
        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher publisher;

        @NameInMap("PatchVersion")
        public Long patchVersion;

        @NameInMap("SupportedOS")
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS> supportedOS;

        @NameInMap("AppServiceCount")
        public Long appServiceCount;

        @NameInMap("MinorVersion")
        public Long minorVersion;

        @NameInMap("CreationChain")
        public java.util.List<String> creationChain;

        @NameInMap("SupportedRegions")
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions> supportedRegions;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("AvailableTenantNames")
        public java.util.List<String> availableTenantNames;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("StorageUploadEndpoints")
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints> storageUploadEndpoints;

        @NameInMap("DepracationNote")
        public String depracationNote;

        @NameInMap("MajorVersion")
        public Long majorVersion;

        @NameInMap("Id")
        public String id;

        @NameInMap("PublicationTime")
        public String publicationTime;

        @NameInMap("BuildCommandParams")
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams> buildCommandParams;

        @NameInMap("IndustryLabel")
        public String industryLabel;

        @NameInMap("TenantId")
        public String tenantId;

        public static DeleteBuildpacksResponseBodyBuildpackDetailVo build(java.util.Map<String, ?> map) throws Exception {
            DeleteBuildpacksResponseBodyBuildpackDetailVo self = new DeleteBuildpacksResponseBodyBuildpackDetailVo();
            return TeaModel.build(map, self);
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setBuildpackParams(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams> buildpackParams) {
            this.buildpackParams = buildpackParams;
            return this;
        }
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildpackParams> getBuildpackParams() {
            return this.buildpackParams;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setCreator(DeleteBuildpacksResponseBodyBuildpackDetailVoCreator creator) {
            this.creator = creator;
            return this;
        }
        public DeleteBuildpacksResponseBodyBuildpackDetailVoCreator getCreator() {
            return this.creator;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public Boolean getDebugMode() {
            return this.debugMode;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public String getContactInfo() {
            return this.contactInfo;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setTechstack(DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack techstack) {
            this.techstack = techstack;
            return this;
        }
        public DeleteBuildpacksResponseBodyBuildpackDetailVoTechstack getTechstack() {
            return this.techstack;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setCreatedFrom(String createdFrom) {
            this.createdFrom = createdFrom;
            return this;
        }
        public String getCreatedFrom() {
            return this.createdFrom;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setBuildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }
        public String getBuildCommand() {
            return this.buildCommand;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setPublisher(DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher publisher) {
            this.publisher = publisher;
            return this;
        }
        public DeleteBuildpacksResponseBodyBuildpackDetailVoPublisher getPublisher() {
            return this.publisher;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setPatchVersion(Long patchVersion) {
            this.patchVersion = patchVersion;
            return this;
        }
        public Long getPatchVersion() {
            return this.patchVersion;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setSupportedOS(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS> supportedOS) {
            this.supportedOS = supportedOS;
            return this;
        }
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedOS> getSupportedOS() {
            return this.supportedOS;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setAppServiceCount(Long appServiceCount) {
            this.appServiceCount = appServiceCount;
            return this;
        }
        public Long getAppServiceCount() {
            return this.appServiceCount;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setMinorVersion(Long minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public Long getMinorVersion() {
            return this.minorVersion;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setCreationChain(java.util.List<String> creationChain) {
            this.creationChain = creationChain;
            return this;
        }
        public java.util.List<String> getCreationChain() {
            return this.creationChain;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setSupportedRegions(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions> supportedRegions) {
            this.supportedRegions = supportedRegions;
            return this;
        }
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoSupportedRegions> getSupportedRegions() {
            return this.supportedRegions;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setAvailableTenantNames(java.util.List<String> availableTenantNames) {
            this.availableTenantNames = availableTenantNames;
            return this;
        }
        public java.util.List<String> getAvailableTenantNames() {
            return this.availableTenantNames;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setStorageUploadEndpoints(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints> storageUploadEndpoints) {
            this.storageUploadEndpoints = storageUploadEndpoints;
            return this;
        }
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoStorageUploadEndpoints> getStorageUploadEndpoints() {
            return this.storageUploadEndpoints;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setDepracationNote(String depracationNote) {
            this.depracationNote = depracationNote;
            return this;
        }
        public String getDepracationNote() {
            return this.depracationNote;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setMajorVersion(Long majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public Long getMajorVersion() {
            return this.majorVersion;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setPublicationTime(String publicationTime) {
            this.publicationTime = publicationTime;
            return this;
        }
        public String getPublicationTime() {
            return this.publicationTime;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setBuildCommandParams(java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams> buildCommandParams) {
            this.buildCommandParams = buildCommandParams;
            return this;
        }
        public java.util.List<DeleteBuildpacksResponseBodyBuildpackDetailVoBuildCommandParams> getBuildCommandParams() {
            return this.buildCommandParams;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setIndustryLabel(String industryLabel) {
            this.industryLabel = industryLabel;
            return this;
        }
        public String getIndustryLabel() {
            return this.industryLabel;
        }

        public DeleteBuildpacksResponseBodyBuildpackDetailVo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
