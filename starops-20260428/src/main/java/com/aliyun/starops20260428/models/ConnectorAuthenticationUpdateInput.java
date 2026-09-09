// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorAuthenticationUpdateInput extends TeaModel {
    /**
     * <p>The configuration that uses a username and password to replace the existing authentication configuration.</p>
     */
    @NameInMap("basic")
    public ConnectorAuthenticationUpdateInputBasic basic;

    /**
     * <p>The configuration that uses a bot token and signing key to replace the existing authentication configuration.</p>
     */
    @NameInMap("botToken")
    public ConnectorAuthenticationUpdateInputBotToken botToken;

    /**
     * <p>The configuration that uses an OAuth client identity to replace the existing authentication configuration.</p>
     */
    @NameInMap("oauth")
    public ConnectorAuthenticationUpdateInputOauth oauth;

    /**
     * <p>The configuration that uses a personal access token to replace the existing authentication configuration.</p>
     */
    @NameInMap("patToken")
    public ConnectorAuthenticationUpdateInputPatToken patToken;

    /**
     * <p>The configuration that uses a RAM role ARN to replace the existing authentication configuration.</p>
     */
    @NameInMap("role")
    public ConnectorAuthenticationUpdateInputRole role;

    /**
     * <p>The configuration that uses a local credential binding to replace the existing authentication configuration.</p>
     */
    @NameInMap("satellite")
    public ConnectorAuthenticationUpdateInputSatellite satellite;

    /**
     * <p>Authentication type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("type")
    public String type;

    public static ConnectorAuthenticationUpdateInput build(java.util.Map<String, ?> map) throws Exception {
        ConnectorAuthenticationUpdateInput self = new ConnectorAuthenticationUpdateInput();
        return TeaModel.build(map, self);
    }

    public ConnectorAuthenticationUpdateInput setBasic(ConnectorAuthenticationUpdateInputBasic basic) {
        this.basic = basic;
        return this;
    }
    public ConnectorAuthenticationUpdateInputBasic getBasic() {
        return this.basic;
    }

    public ConnectorAuthenticationUpdateInput setBotToken(ConnectorAuthenticationUpdateInputBotToken botToken) {
        this.botToken = botToken;
        return this;
    }
    public ConnectorAuthenticationUpdateInputBotToken getBotToken() {
        return this.botToken;
    }

    public ConnectorAuthenticationUpdateInput setOauth(ConnectorAuthenticationUpdateInputOauth oauth) {
        this.oauth = oauth;
        return this;
    }
    public ConnectorAuthenticationUpdateInputOauth getOauth() {
        return this.oauth;
    }

    public ConnectorAuthenticationUpdateInput setPatToken(ConnectorAuthenticationUpdateInputPatToken patToken) {
        this.patToken = patToken;
        return this;
    }
    public ConnectorAuthenticationUpdateInputPatToken getPatToken() {
        return this.patToken;
    }

    public ConnectorAuthenticationUpdateInput setRole(ConnectorAuthenticationUpdateInputRole role) {
        this.role = role;
        return this;
    }
    public ConnectorAuthenticationUpdateInputRole getRole() {
        return this.role;
    }

    public ConnectorAuthenticationUpdateInput setSatellite(ConnectorAuthenticationUpdateInputSatellite satellite) {
        this.satellite = satellite;
        return this;
    }
    public ConnectorAuthenticationUpdateInputSatellite getSatellite() {
        return this.satellite;
    }

    public ConnectorAuthenticationUpdateInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ConnectorAuthenticationUpdateInputBasic extends TeaModel {
        /**
         * <p>Replacement password</p>
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

        public static ConnectorAuthenticationUpdateInputBasic build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputBasic self = new ConnectorAuthenticationUpdateInputBasic();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputBasic setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConnectorAuthenticationUpdateInputBasic setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ConnectorAuthenticationUpdateInputBotToken extends TeaModel {
        /**
         * <p>Replacement bot token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bot-token</p>
         */
        @NameInMap("botToken")
        public String botToken;

        /**
         * <p>Replacement signing secret</p>
         * 
         * <strong>example:</strong>
         * <p>example-signing-secret</p>
         */
        @NameInMap("signingSecret")
        public String signingSecret;

        public static ConnectorAuthenticationUpdateInputBotToken build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputBotToken self = new ConnectorAuthenticationUpdateInputBotToken();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputBotToken setBotToken(String botToken) {
            this.botToken = botToken;
            return this;
        }
        public String getBotToken() {
            return this.botToken;
        }

        public ConnectorAuthenticationUpdateInputBotToken setSigningSecret(String signingSecret) {
            this.signingSecret = signingSecret;
            return this;
        }
        public String getSigningSecret() {
            return this.signingSecret;
        }

    }

    public static class ConnectorAuthenticationUpdateInputOauth extends TeaModel {
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
         * <p>Replacement OAuth client secret</p>
         * 
         * <strong>example:</strong>
         * <p>example-client-secret</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        public static ConnectorAuthenticationUpdateInputOauth build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputOauth self = new ConnectorAuthenticationUpdateInputOauth();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputOauth setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ConnectorAuthenticationUpdateInputOauth setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ConnectorAuthenticationUpdateInputPatToken extends TeaModel {
        /**
         * <p>The personal access token used to replace the existing credential.</p>
         * 
         * <strong>example:</strong>
         * <p>example-personal-access-token</p>
         */
        @NameInMap("patToken")
        public String patToken;

        public static ConnectorAuthenticationUpdateInputPatToken build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputPatToken self = new ConnectorAuthenticationUpdateInputPatToken();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputPatToken setPatToken(String patToken) {
            this.patToken = patToken;
            return this;
        }
        public String getPatToken() {
            return this.patToken;
        }

    }

    public static class ConnectorAuthenticationUpdateInputRole extends TeaModel {
        /**
         * <p>Role ARN</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/starops-reader</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        public static ConnectorAuthenticationUpdateInputRole build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputRole self = new ConnectorAuthenticationUpdateInputRole();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputRole setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class ConnectorAuthenticationUpdateInputSatellite extends TeaModel {
        /**
         * <p>Local credential binding name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private-gitlab</p>
         */
        @NameInMap("bindingName")
        public String bindingName;

        public static ConnectorAuthenticationUpdateInputSatellite build(java.util.Map<String, ?> map) throws Exception {
            ConnectorAuthenticationUpdateInputSatellite self = new ConnectorAuthenticationUpdateInputSatellite();
            return TeaModel.build(map, self);
        }

        public ConnectorAuthenticationUpdateInputSatellite setBindingName(String bindingName) {
            this.bindingName = bindingName;
            return this;
        }
        public String getBindingName() {
            return this.bindingName;
        }

    }

}
