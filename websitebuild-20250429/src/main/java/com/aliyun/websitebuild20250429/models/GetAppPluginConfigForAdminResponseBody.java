// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginConfigForAdminResponseBody extends TeaModel {
    /**
     * <p>The API operation status or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Module")
    public GetAppPluginConfigForAdminResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppPluginConfigForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginConfigForAdminResponseBody self = new GetAppPluginConfigForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPluginConfigForAdminResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppPluginConfigForAdminResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppPluginConfigForAdminResponseBody setModule(GetAppPluginConfigForAdminResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppPluginConfigForAdminResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppPluginConfigForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppPluginConfigForAdminResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppPluginConfigForAdminResponseBodyModule extends TeaModel {
        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The plugin configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>The plugin description.</p>
         * 
         * <strong>example:</strong>
         * <p>a simple test plugin</p>
         */
        @NameInMap("PluginDesc")
        public String pluginDesc;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_testaccapigatewayplugin29311</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAppPluginConfigForAdminResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppPluginConfigForAdminResponseBodyModule self = new GetAppPluginConfigForAdminResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppPluginConfigForAdminResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setPluginDesc(String pluginDesc) {
            this.pluginDesc = pluginDesc;
            return this;
        }
        public String getPluginDesc() {
            return this.pluginDesc;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public GetAppPluginConfigForAdminResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
