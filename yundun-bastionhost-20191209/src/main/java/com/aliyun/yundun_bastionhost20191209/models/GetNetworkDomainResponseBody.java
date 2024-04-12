// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetNetworkDomainResponseBody extends TeaModel {
    @NameInMap("NetworkDomain")
    public GetNetworkDomainResponseBodyNetworkDomain networkDomain;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ProxyState")
        public String proxyState;

        @NameInMap("ProxyStateErrorCode")
        public String proxyStateErrorCode;

        @NameInMap("ProxyType")
        public String proxyType;

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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Default")
        public Boolean _default;

        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        @NameInMap("NetworkDomainName")
        public String networkDomainName;

        @NameInMap("NetworkDomainType")
        public String networkDomainType;

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
