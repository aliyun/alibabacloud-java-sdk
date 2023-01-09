// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListEnvsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Envs")
    public java.util.List<ListEnvsResponseBodyEnvs> envs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEnvsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvsResponseBody self = new ListEnvsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnvsResponseBody setEnvs(java.util.List<ListEnvsResponseBodyEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<ListEnvsResponseBodyEnvs> getEnvs() {
        return this.envs;
    }

    public ListEnvsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEnvsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnvsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEnvsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEnvsResponseBodyEnvsFiles extends TeaModel {
        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("Md5")
        public String md5;

        public static ListEnvsResponseBodyEnvsFiles build(java.util.Map<String, ?> map) throws Exception {
            ListEnvsResponseBodyEnvsFiles self = new ListEnvsResponseBodyEnvsFiles();
            return TeaModel.build(map, self);
        }

        public ListEnvsResponseBodyEnvsFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListEnvsResponseBodyEnvsFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListEnvsResponseBodyEnvsFiles setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        public ListEnvsResponseBodyEnvsFiles setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListEnvsResponseBodyEnvsFiles setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

    }

    public static class ListEnvsResponseBodyEnvsProperties extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListEnvsResponseBodyEnvsProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEnvsResponseBodyEnvsProperties self = new ListEnvsResponseBodyEnvsProperties();
            return TeaModel.build(map, self);
        }

        public ListEnvsResponseBodyEnvsProperties setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvsResponseBodyEnvsProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvsResponseBodyEnvsProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEnvsResponseBodyEnvs extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvVersion")
        public String envVersion;

        @NameInMap("Files")
        public java.util.List<ListEnvsResponseBodyEnvsFiles> files;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Properties")
        public java.util.List<ListEnvsResponseBodyEnvsProperties> properties;

        @NameInMap("RelatedScenes")
        public java.util.List<String> relatedScenes;

        @NameInMap("RunningScenes")
        public java.util.List<String> runningScenes;

        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        public static ListEnvsResponseBodyEnvs build(java.util.Map<String, ?> map) throws Exception {
            ListEnvsResponseBodyEnvs self = new ListEnvsResponseBodyEnvs();
            return TeaModel.build(map, self);
        }

        public ListEnvsResponseBodyEnvs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListEnvsResponseBodyEnvs setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListEnvsResponseBodyEnvs setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public ListEnvsResponseBodyEnvs setEnvVersion(String envVersion) {
            this.envVersion = envVersion;
            return this;
        }
        public String getEnvVersion() {
            return this.envVersion;
        }

        public ListEnvsResponseBodyEnvs setFiles(java.util.List<ListEnvsResponseBodyEnvsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListEnvsResponseBodyEnvsFiles> getFiles() {
            return this.files;
        }

        public ListEnvsResponseBodyEnvs setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEnvsResponseBodyEnvs setProperties(java.util.List<ListEnvsResponseBodyEnvsProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ListEnvsResponseBodyEnvsProperties> getProperties() {
            return this.properties;
        }

        public ListEnvsResponseBodyEnvs setRelatedScenes(java.util.List<String> relatedScenes) {
            this.relatedScenes = relatedScenes;
            return this;
        }
        public java.util.List<String> getRelatedScenes() {
            return this.relatedScenes;
        }

        public ListEnvsResponseBodyEnvs setRunningScenes(java.util.List<String> runningScenes) {
            this.runningScenes = runningScenes;
            return this;
        }
        public java.util.List<String> getRunningScenes() {
            return this.runningScenes;
        }

        public ListEnvsResponseBodyEnvs setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}
