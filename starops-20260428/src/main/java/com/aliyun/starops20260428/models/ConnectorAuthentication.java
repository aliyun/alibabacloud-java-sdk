// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorAuthentication extends TeaModel {
    /**
     * <p>The security identity information for basic authentication, excluding the password.</p>
     */
    @NameInMap("basic")
    public ConnectorAuthenticationBasic basic;

    /**
     * <p>The security identity information for the bot, excluding the token and signing key.</p>
     */
    @NameInMap("botToken")
    public ConnectorAuthenticationBotToken botToken;

    /**
     * <p>The security identity information for OAuth, excluding the client secret.</p>
     */
    @NameInMap("oauth")
    public ConnectorAuthenticationOauth oauth;

    /**
     * <p>The security identity information based on the RAM role ARN.</p>
     */
    @NameInMap("role")
    public ConnectorAuthenticationRole role;

    /**
     * <p>The security identity information based on local credential binding.</p>
     */
    @NameInMap("satellite")
    public ConnectorAuthenticationSatellite satellite;

    /**
     * <p>Authentication type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("type")
    public String type;

    public static ConnectorAuthentication build(java.util.Map<String, ?> map) throws Exception {
        ConnectorAuthentication self = new ConnectorAuthentication();
        return TeaModel.build(map, self);
    }

    public ConnectorAuthentication setBasic(ConnectorAuthenticationBasic basic) {
        this.basic = basic;
        return this;
    }
    public ConnectorAuthenticationBasic getBasic() {
        return this.basic;
    }

    public ConnectorAuthentication setBotToken(ConnectorAuthenticationBotToken botToken) {
        this.botToken = botToken;
        return this;
    }
    public ConnectorAuthenticationBotToken getBotToken() {
        return this.botToken;
    }

    public ConnectorAuthentication setOauth(ConnectorAuthenticationOauth oauth) {
        this.oauth = oauth;
        return this;
    }
    public ConnectorAuthenticationOauth getOauth() {
        return this.oauth;
    }

    public ConnectorAuthentication setRole(ConnectorAuthenticationRole role) {
        this.role = role;
        return this;
    }
    public ConnectorAuthenticationRole getRole() {
        return this.role;
    }

    public ConnectorAuthentication setSatellite(ConnectorAuthenticationSatellite satellite) {
        this.satellite = satellite;
        return this;
    }
    public ConnectorAuthenticationSatellite getSatellite() {
        return this.satellite;
    }

    public ConnectorAuthentication setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ConnectorAuthenticationBasic extends TeaModel {
        /**
         * <p>Username</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>starops</p>
         */
        @NameInMap("username")
        public String username;

        public static ConnectorAuthenticationBasic build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationBasic self = new ConnectorAuthenticationBasic();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationBasic setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ConnectorAuthenticationBotToken extends TeaModel {
        /**
         * <p>Bot ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bot-123456</p>
         */
        @NameInMap("botId")
        public String botId;

        public static ConnectorAuthenticationBotToken build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationBotToken self = new ConnectorAuthenticationBotToken();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationBotToken setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

    }

    public static class ConnectorAuthenticationOauth extends TeaModel {
        /**
         * <p>OAuth client ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-id</p>
         */
        @NameInMap("clientId")
        public String clientId;

        public static ConnectorAuthenticationOauth build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationOauth self = new ConnectorAuthenticationOauth();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationOauth setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class ConnectorAuthenticationRole extends TeaModel {
        /**
         * <p>Role ARN</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/starops-reader</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        public static ConnectorAuthenticationRole build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationRole self = new ConnectorAuthenticationRole();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationRole setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class ConnectorAuthenticationSatellite extends TeaModel {
        /**
         * <p>Local credential binding name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private-gitlab</p>
         */
        @NameInMap("bindingName")
        public String bindingName;

        public static ConnectorAuthenticationSatellite build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationSatellite self = new ConnectorAuthenticationSatellite();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationSatellite setBindingName(String bindingName) {
            this.bindingName = bindingName;
            return this;
        }
        public String getBindingName() {
            return this.bindingName;
        }

    }

}
