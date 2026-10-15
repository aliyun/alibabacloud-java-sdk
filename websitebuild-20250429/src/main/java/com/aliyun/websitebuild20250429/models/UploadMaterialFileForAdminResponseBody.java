// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadMaterialFileForAdminResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The file object.</p>
     */
    @NameInMap("Module")
    public UploadMaterialFileForAdminResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>System exception</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static UploadMaterialFileForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMaterialFileForAdminResponseBody self = new UploadMaterialFileForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMaterialFileForAdminResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UploadMaterialFileForAdminResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public UploadMaterialFileForAdminResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UploadMaterialFileForAdminResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UploadMaterialFileForAdminResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UploadMaterialFileForAdminResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public UploadMaterialFileForAdminResponseBody setModule(UploadMaterialFileForAdminResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public UploadMaterialFileForAdminResponseBodyModule getModule() {
        return this.module;
    }

    public UploadMaterialFileForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMaterialFileForAdminResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public UploadMaterialFileForAdminResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public UploadMaterialFileForAdminResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class UploadMaterialFileForAdminResponseBodyModule extends TeaModel {
        /**
         * <p>The business instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The file content type.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The creation time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03 02:05:01</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the file was moved to the recycle bin or deleted. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-03 02:05:01</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddddwww</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The unique ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>d75e1e9693cc460da218419d67735567</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx.cn/original-data/pdf/mndj_report/cd649b2cc2102c0df57bfa1ae62931d6.zip">https://xxx.xxx.cn/original-data/pdf/mndj_report/cd649b2cc2102c0df57bfa1ae62931d6.zip</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The height of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>FileName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>23M</p>
         */
        @NameInMap("StorageSize")
        public String storageSize;

        /**
         * <p>The file suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>png</p>
         */
        @NameInMap("Suffix")
        public String suffix;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static UploadMaterialFileForAdminResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            UploadMaterialFileForAdminResponseBodyModule self = new UploadMaterialFileForAdminResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public UploadMaterialFileForAdminResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public UploadMaterialFileForAdminResponseBodyModule setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UploadMaterialFileForAdminResponseBodyModule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UploadMaterialFileForAdminResponseBodyModule setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public UploadMaterialFileForAdminResponseBodyModule setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UploadMaterialFileForAdminResponseBodyModule setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public UploadMaterialFileForAdminResponseBodyModule setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public UploadMaterialFileForAdminResponseBodyModule setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public UploadMaterialFileForAdminResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UploadMaterialFileForAdminResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UploadMaterialFileForAdminResponseBodyModule setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public UploadMaterialFileForAdminResponseBodyModule setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public UploadMaterialFileForAdminResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UploadMaterialFileForAdminResponseBodyModule setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
