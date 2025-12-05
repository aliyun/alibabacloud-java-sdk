// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListEnvsResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The environments.</p>
     */
    @NameInMap("Envs")
    public java.util.List<ListEnvsResponseBodyEnvs> envs;

    /**
     * <p>The HTTP status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of environments per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of environments.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>61660</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>json.jar</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The OSS address of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
         */
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>788</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The MD5 checksum of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>43B584026CE5E570F3DE638FA7EEF9E0</p>
         */
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
        /**
         * <p>The description of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>远程主机</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>remote_hosts</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
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
        /**
         * <p>The time when the environment was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1637053715165</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>86S1LH</p>
         */
        @NameInMap("EnvId")
        public String envId;

        /**
         * <p>The name of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>test-create</p>
         */
        @NameInMap("EnvName")
        public String envName;

        /**
         * <p>The JMeter version of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("EnvVersion")
        public String envVersion;

        /**
         * <p>The JAR files.</p>
         */
        @NameInMap("Files")
        public java.util.List<ListEnvsResponseBodyEnvsFiles> files;

        /**
         * <p>The time when the environment was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1637053719165</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The JMeter attributes.</p>
         */
        @NameInMap("Properties")
        public java.util.List<ListEnvsResponseBodyEnvsProperties> properties;

        /**
         * <p>The scenarios related to the environment.</p>
         */
        @NameInMap("RelatedScenes")
        public java.util.List<String> relatedScenes;

        /**
         * <p>The IDs of the scenarios that run in the environment.</p>
         */
        @NameInMap("RunningScenes")
        public java.util.List<String> runningScenes;

        /**
         * <p>The total size of the environment file.</p>
         * 
         * <strong>example:</strong>
         * <p>26668</p>
         */
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
