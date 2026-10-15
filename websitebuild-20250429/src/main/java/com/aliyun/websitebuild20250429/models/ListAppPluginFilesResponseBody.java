// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginFilesResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
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
     * <p>spring-cloud-b</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListAppPluginFilesResponseBodyModule module;

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
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>System exception.</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppPluginFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginFilesResponseBody self = new ListAppPluginFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPluginFilesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppPluginFilesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppPluginFilesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppPluginFilesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppPluginFilesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppPluginFilesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppPluginFilesResponseBody setModule(ListAppPluginFilesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppPluginFilesResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppPluginFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPluginFilesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppPluginFilesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppPluginFilesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppPluginFilesResponseBodyModuleFiles extends TeaModel {
        /**
         * <p>The file content, returned when POP displays SKILL.md.</p>
         * 
         * <strong>example:</strong>
         * <p>domain cnamen</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>blob / tree</p>
         * 
         * <strong>example:</strong>
         * <p>baidu</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The number of returned results. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListAppPluginFilesResponseBodyModuleFiles build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginFilesResponseBodyModuleFiles self = new ListAppPluginFilesResponseBodyModuleFiles();
            return TeaModel.build(map, self);
        }

        public ListAppPluginFilesResponseBodyModuleFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAppPluginFilesResponseBodyModuleFiles setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAppPluginFilesResponseBodyModuleFiles setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListAppPluginFilesResponseBodyModuleFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class ListAppPluginFilesResponseBodyModule extends TeaModel {
        /**
         * <p>The task execution progress.</p>
         */
        @NameInMap("Files")
        public java.util.List<ListAppPluginFilesResponseBodyModuleFiles> files;

        /**
         * <p>The application instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAppPluginFilesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginFilesResponseBodyModule self = new ListAppPluginFilesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppPluginFilesResponseBodyModule setFiles(java.util.List<ListAppPluginFilesResponseBodyModuleFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListAppPluginFilesResponseBodyModuleFiles> getFiles() {
            return this.files;
        }

        public ListAppPluginFilesResponseBodyModule setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
