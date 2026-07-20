// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRoleResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public QueryRbacRoleResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IsSystem")
        public Boolean isSystem;

        @NameInMap("Label")
        public String label;

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
