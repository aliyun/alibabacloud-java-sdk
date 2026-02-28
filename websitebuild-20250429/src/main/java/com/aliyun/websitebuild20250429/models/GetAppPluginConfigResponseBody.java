// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Instance <code>wget h33E1En5.popscan.xaliyun.com</code> does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Module")
    public GetAppPluginConfigResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppPluginConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginConfigResponseBody self = new GetAppPluginConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPluginConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppPluginConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppPluginConfigResponseBody setModule(GetAppPluginConfigResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppPluginConfigResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppPluginConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppPluginConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppPluginConfigResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <strong>example:</strong>
         * <p>a simple test plugin</p>
         */
        @NameInMap("PluginDesc")
        public String pluginDesc;

        /**
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <strong>example:</strong>
         * <p>tf_testaccapigatewayplugin29311</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAppPluginConfigResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppPluginConfigResponseBodyModule self = new GetAppPluginConfigResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppPluginConfigResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppPluginConfigResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppPluginConfigResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppPluginConfigResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppPluginConfigResponseBodyModule setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public GetAppPluginConfigResponseBodyModule setPluginDesc(String pluginDesc) {
            this.pluginDesc = pluginDesc;
            return this;
        }
        public String getPluginDesc() {
            return this.pluginDesc;
        }

        public GetAppPluginConfigResponseBodyModule setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetAppPluginConfigResponseBodyModule setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public GetAppPluginConfigResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
