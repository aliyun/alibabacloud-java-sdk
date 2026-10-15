// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRoleResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed. Valid values:</p>
     * <ul>
     * <li>false: Retry is not allowed.</li>
     * <li>true: Retry is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name. The application with this name is queried.</p>
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
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public QueryRbacRoleResponseBodyModule module;

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
     * <p>系统异常</p>
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

    public static QueryRbacRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRoleResponseBody self = new QueryRbacRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRbacRoleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryRbacRoleResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryRbacRoleResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRbacRoleResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryRbacRoleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryRbacRoleResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryRbacRoleResponseBody setModule(QueryRbacRoleResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryRbacRoleResponseBodyModule getModule() {
        return this.module;
    }

    public QueryRbacRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRbacRoleResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryRbacRoleResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryRbacRoleResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryRbacRoleResponseBodyModule extends TeaModel {
        /**
         * <p>The time when the task was created, in ISO 8601 format (such as 2024-01-01T00:00:00+Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T10:20:09Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The default status. Valid values:</p>
         * <ul>
         * <li>0: not default.</li>
         * <li>1: default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>Indicates whether the approval template is system-defined. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://anchashiscan.oss-cn-hangzhou.aliyuncs.com/prodpopscansDZBFBGr</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        public static QueryRbacRoleResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacRoleResponseBodyModule self = new QueryRbacRoleResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryRbacRoleResponseBodyModule setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryRbacRoleResponseBodyModule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRbacRoleResponseBodyModule setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public QueryRbacRoleResponseBodyModule setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public QueryRbacRoleResponseBodyModule setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryRbacRoleResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
