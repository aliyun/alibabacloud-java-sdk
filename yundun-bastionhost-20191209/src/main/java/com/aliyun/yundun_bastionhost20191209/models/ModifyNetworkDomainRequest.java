// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyNetworkDomainRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    @NameInMap("NetworkDomainType")
    public String networkDomainType;

    @NameInMap("Proxies")
    public java.util.List<ModifyNetworkDomainRequestProxies> proxies;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkDomainRequest self = new ModifyNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkDomainRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyNetworkDomainRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ModifyNetworkDomainRequest setNetworkDomainName(String networkDomainName) {
        this.networkDomainName = networkDomainName;
        return this;
    }
    public String getNetworkDomainName() {
        return this.networkDomainName;
    }

    public ModifyNetworkDomainRequest setNetworkDomainType(String networkDomainType) {
        this.networkDomainType = networkDomainType;
        return this;
    }
    public String getNetworkDomainType() {
        return this.networkDomainType;
    }

    public ModifyNetworkDomainRequest setProxies(java.util.List<ModifyNetworkDomainRequestProxies> proxies) {
        this.proxies = proxies;
        return this;
    }
    public java.util.List<ModifyNetworkDomainRequestProxies> getProxies() {
        return this.proxies;
    }

    public ModifyNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyNetworkDomainRequestProxies extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ProxyType")
        public String proxyType;

        @NameInMap("User")
        public String user;

        public static ModifyNetworkDomainRequestProxies build(java.util.Map<String, ?> map) throws Exception {
            ModifyNetworkDomainRequestProxies self = new ModifyNetworkDomainRequestProxies();
            return TeaModel.build(map, self);
        }

        public ModifyNetworkDomainRequestProxies setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ModifyNetworkDomainRequestProxies setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ModifyNetworkDomainRequestProxies setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyNetworkDomainRequestProxies setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyNetworkDomainRequestProxies setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public ModifyNetworkDomainRequestProxies setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
