// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAvailableConfigsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>可用的组织同步配置列表</p>
     */
    @NameInMap("configs")
    public java.util.List<ListAvailableConfigsResponseBodyConfigs> configs;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAvailableConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableConfigsResponseBody self = new ListAvailableConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableConfigsResponseBody setConfigs(java.util.List<ListAvailableConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListAvailableConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListAvailableConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>企业标识（wecom=corpId, saml=idpEntityId, oauth2=clientId, custom=客户自定义）。注意：OAuth2 多 IdP 配置使用相同 clientId 时，需在 syncOrgStructure 中显式传 ssoSettingsId</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>企业展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("corpName")
        public String corpName;

        /**
         * <p>平台类型: wecom / saml / oauth2 / custom</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("platformType")
        public String platformType;

        /**
         * <p>SSO 配置 ID（仅 SAML/OAuth2/WeCom 有值，custom 为 null）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSsoSettingsId</p>
         */
        @NameInMap("ssoSettingsId")
        public String ssoSettingsId;

        /**
         * <p>SSO 配置名称（仅 SAML/OAuth2/WeCom 有值，custom 为 null）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("ssoSettingsName")
        public String ssoSettingsName;

        public static ListAvailableConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableConfigsResponseBodyConfigs self = new ListAvailableConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListAvailableConfigsResponseBodyConfigs setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListAvailableConfigsResponseBodyConfigs setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListAvailableConfigsResponseBodyConfigs setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public ListAvailableConfigsResponseBodyConfigs setSsoSettingsId(String ssoSettingsId) {
            this.ssoSettingsId = ssoSettingsId;
            return this;
        }
        public String getSsoSettingsId() {
            return this.ssoSettingsId;
        }

        public ListAvailableConfigsResponseBodyConfigs setSsoSettingsName(String ssoSettingsName) {
            this.ssoSettingsName = ssoSettingsName;
            return this;
        }
        public String getSsoSettingsName() {
            return this.ssoSettingsName;
        }

    }

}
