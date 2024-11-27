// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetNetworkDomainResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the network domain.</p>
     */
    @NameInMap("NetworkDomain")
    public GetNetworkDomainResponseBodyNetworkDomain networkDomain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05F59944-2E24-595C-B21A-8C9955E60FAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkDomainResponseBody self = new GetNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkDomainResponseBody setNetworkDomain(GetNetworkDomainResponseBodyNetworkDomain networkDomain) {
        this.networkDomain = networkDomain;
        return this;
    }
    public GetNetworkDomainResponseBodyNetworkDomain getNetworkDomain() {
        return this.networkDomain;
    }

    public GetNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkDomainResponseBodyNetworkDomainProxies extends TeaModel {
        /**
         * <p>The IP address of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p><code>47.102.**.**</code></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Indicates whether the proxy server has a password. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The node type of the proxy server. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: primary proxy server.</li>
         * <li><strong>Slave</strong>: secondary proxy server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The status of the proxy server.</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Unavailable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unavailable</p>
         */
        @NameInMap("ProxyState")
        public String proxyState;

        /**
         * <p>The error code that indicates the status of the proxy server.</p>
         * <ul>
         * <li><strong>CHECK_PWD_FAILED</strong>: The password is invalid.</li>
         * <li><strong>CHECK_PWD_TIMEOUT</strong>: The password verification session timed out.</li>
         * <li><strong>CHECK_PWD_NETWORK_ERR</strong>: A network error occurred.</li>
         * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHECK_PWD_TIMEOUT</p>
         */
        @NameInMap("ProxyStateErrorCode")
        public String proxyStateErrorCode;

        /**
         * <p>The proxy type. Valid values:</p>
         * <ul>
         * <li><strong>SSHProxy</strong></li>
         * <li><strong>HTTPProxy</strong></li>
         * <li><strong>Socks5Proxy</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPProxy</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The username of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("User")
        public String user;

        public static GetNetworkDomainResponseBodyNetworkDomainProxies build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkDomainResponseBodyNetworkDomainProxies self = new GetNetworkDomainResponseBodyNetworkDomainProxies();
            return TeaModel.build(map, self);
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setProxyState(String proxyState) {
            this.proxyState = proxyState;
            return this;
        }
        public String getProxyState() {
            return this.proxyState;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setProxyStateErrorCode(String proxyStateErrorCode) {
            this.proxyStateErrorCode = proxyStateErrorCode;
            return this;
        }
        public String getProxyStateErrorCode() {
            return this.proxyStateErrorCode;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public GetNetworkDomainResponseBodyNetworkDomainProxies setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetNetworkDomainResponseBodyNetworkDomain extends TeaModel {
        /**
         * <p>The remarks of the network domain.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the network domain is a built-in network domain.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Default")
        public Boolean _default;

        /**
         * <p>The network domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        /**
         * <p>The name of the network domain.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH Proxy</p>
         */
        @NameInMap("NetworkDomainName")
        public String networkDomainName;

        /**
         * <p>The connection mode of the network domain. Valid values:</p>
         * <ul>
         * <li>Direct</li>
         * <li>Proxy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Proxy</p>
         */
        @NameInMap("NetworkDomainType")
        public String networkDomainType;

        /**
         * <p>The information about the proxy servers.</p>
         */
        @NameInMap("Proxies")
        public java.util.List<GetNetworkDomainResponseBodyNetworkDomainProxies> proxies;

        public static GetNetworkDomainResponseBodyNetworkDomain build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkDomainResponseBodyNetworkDomain self = new GetNetworkDomainResponseBodyNetworkDomain();
            return TeaModel.build(map, self);
        }

        public GetNetworkDomainResponseBodyNetworkDomain setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetNetworkDomainResponseBodyNetworkDomain set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public GetNetworkDomainResponseBodyNetworkDomain setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public GetNetworkDomainResponseBodyNetworkDomain setNetworkDomainName(String networkDomainName) {
            this.networkDomainName = networkDomainName;
            return this;
        }
        public String getNetworkDomainName() {
            return this.networkDomainName;
        }

        public GetNetworkDomainResponseBodyNetworkDomain setNetworkDomainType(String networkDomainType) {
            this.networkDomainType = networkDomainType;
            return this;
        }
        public String getNetworkDomainType() {
            return this.networkDomainType;
        }

        public GetNetworkDomainResponseBodyNetworkDomain setProxies(java.util.List<GetNetworkDomainResponseBodyNetworkDomainProxies> proxies) {
            this.proxies = proxies;
            return this;
        }
        public java.util.List<GetNetworkDomainResponseBodyNetworkDomainProxies> getProxies() {
            return this.proxies;
        }

    }

}
