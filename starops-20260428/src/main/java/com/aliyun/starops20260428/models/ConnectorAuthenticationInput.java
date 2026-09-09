// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorAuthenticationInput extends TeaModel {
    /**
     * <p>Authenticates by using a username and password.</p>
     */
    @NameInMap("basic")
    public ConnectorAuthenticationInputBasic basic;

    /**
     * <p>Authenticates by using a bot token and a signing key.</p>
     */
    @NameInMap("botToken")
    public ConnectorAuthenticationInputBotToken botToken;

    /**
     * <p>Authenticates by using an OAuth client identity.</p>
     */
    @NameInMap("oauth")
    public ConnectorAuthenticationInputOauth oauth;

    /**
     * <p>Authenticates by using a personal access token.</p>
     */
    @NameInMap("patToken")
    public ConnectorAuthenticationInputPatToken patToken;

    /**
     * <p>Authenticates by using a RAM role ARN.</p>
     */
    @NameInMap("role")
    public ConnectorAuthenticationInputRole role;

    /**
     * <p>Authenticates by using local credential binding.</p>
     */
    @NameInMap("satellite")
    public ConnectorAuthenticationInputSatellite satellite;

    /**
     * <p>Authentication type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN_RESOURCE</p>
     */
    @NameInMap("type")
    public String type;

    public static ConnectorAuthenticationInput build(java.util.Map<String, ?> map) throws Exception {
        ConnectorAuthenticationInput self = new ConnectorAuthenticationInput();
        return TeaModel.build(map, self);
    }

    public ConnectorAuthenticationInput setBasic(ConnectorAuthenticationInputBasic basic) {
        this.basic = basic;
        return this;
    }
    public ConnectorAuthenticationInputBasic getBasic() {
        return this.basic;
    }

    public ConnectorAuthenticationInput setBotToken(ConnectorAuthenticationInputBotToken botToken) {
        this.botToken = botToken;
        return this;
    }
    public ConnectorAuthenticationInputBotToken getBotToken() {
        return this.botToken;
    }

    public ConnectorAuthenticationInput setOauth(ConnectorAuthenticationInputOauth oauth) {
        this.oauth = oauth;
        return this;
    }
    public ConnectorAuthenticationInputOauth getOauth() {
        return this.oauth;
    }

    public ConnectorAuthenticationInput setPatToken(ConnectorAuthenticationInputPatToken patToken) {
        this.patToken = patToken;
        return this;
    }
    public ConnectorAuthenticationInputPatToken getPatToken() {
        return this.patToken;
    }

    public ConnectorAuthenticationInput setRole(ConnectorAuthenticationInputRole role) {
        this.role = role;
        return this;
    }
    public ConnectorAuthenticationInputRole getRole() {
        return this.role;
    }

    public ConnectorAuthenticationInput setSatellite(ConnectorAuthenticationInputSatellite satellite) {
        this.satellite = satellite;
        return this;
    }
    public ConnectorAuthenticationInputSatellite getSatellite() {
        return this.satellite;
    }

    public ConnectorAuthenticationInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ConnectorAuthenticationInputBasic extends TeaModel {
        /**
         * <p>Password</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-password</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>Username</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>starops</p>
         */
        @NameInMap("username")
        public String username;

        public static ConnectorAuthenticationInputBasic build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputBasic self = new ConnectorAuthenticationInputBasic();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputBasic setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConnectorAuthenticationInputBasic setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ConnectorAuthenticationInputBotToken extends TeaModel {
        /**
         * <p>Bot token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bot-token</p>
         */
        @NameInMap("botToken")
        public String botToken;

        /**
         * <p>Signing secret</p>
         * 
         * <strong>example:</strong>
         * <p>example-signing-secret</p>
         */
        @NameInMap("signingSecret")
        public String signingSecret;

        public static ConnectorAuthenticationInputBotToken build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputBotToken self = new ConnectorAuthenticationInputBotToken();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputBotToken setBotToken(String botToken) {
            this.botToken = botToken;
            return this;
        }
        public String getBotToken() {
            return this.botToken;
        }

        public ConnectorAuthenticationInputBotToken setSigningSecret(String signingSecret) {
            this.signingSecret = signingSecret;
            return this;
        }
        public String getSigningSecret() {
            return this.signingSecret;
        }

    }

    public static class ConnectorAuthenticationInputOauth extends TeaModel {
        /**
         * <p>OAuth client ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-id</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>OAuth client secret</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client-secret</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        public static ConnectorAuthenticationInputOauth build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputOauth self = new ConnectorAuthenticationInputOauth();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputOauth setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ConnectorAuthenticationInputOauth setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ConnectorAuthenticationInputPatToken extends TeaModel {
        /**
         * <p>The personal access token used to access the target service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-personal-access-token</p>
         */
        @NameInMap("patToken")
        public String patToken;

        public static ConnectorAuthenticationInputPatToken build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputPatToken self = new ConnectorAuthenticationInputPatToken();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputPatToken setPatToken(String patToken) {
            this.patToken = patToken;
            return this;
        }
        public String getPatToken() {
            return this.patToken;
        }

    }

    public static class ConnectorAuthenticationInputRole extends TeaModel {
        /**
         * <p>Role ARN</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/starops-reader</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        public static ConnectorAuthenticationInputRole build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputRole self = new ConnectorAuthenticationInputRole();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputRole setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class ConnectorAuthenticationInputSatellite extends TeaModel {
        /**
         * <p>Local credential binding name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private-gitlab</p>
         */
        @NameInMap("bindingName")
        public String bindingName;

        public static ConnectorAuthenticationInputSatellite build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationInputSatellite self = new ConnectorAuthenticationInputSatellite();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationInputSatellite setBindingName(String bindingName) {
            this.bindingName = bindingName;
            return this;
        }
        public String getBindingName() {
            return this.bindingName;
        }

    }

}
