// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAvailableConfigsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of queried Logtail configurations.</p>
     */
    @NameInMap("configs")
    public java.util.List<ListAvailableConfigsResponseBodyConfigs> configs;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <p>The enterprise ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("corpName")
        public String corpName;

        /**
         * <p>The platform type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("platformType")
        public String platformType;

        /**
         * <p>The SSO configuration ID. This field has a value only for SAML, OAuth2, or WeCom types. The value is null for custom types.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSsoSettingsId</p>
         */
        @NameInMap("ssoSettingsId")
        public String ssoSettingsId;

        /**
         * <p>The SSO configuration name. This field has a value only for SAML, OAuth2, or WeCom types. The value is null for custom types.</p>
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
