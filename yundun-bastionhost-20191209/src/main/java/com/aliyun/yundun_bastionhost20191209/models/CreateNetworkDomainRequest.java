// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateNetworkDomainRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    @NameInMap("NetworkDomainType")
    public String networkDomainType;

    @NameInMap("Proxies")
    public java.util.List<CreateNetworkDomainRequestProxies> proxies;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkDomainRequest self = new CreateNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkDomainRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNetworkDomainRequest setNetworkDomainName(String networkDomainName) {
        this.networkDomainName = networkDomainName;
        return this;
    }
    public String getNetworkDomainName() {
        return this.networkDomainName;
    }

    public CreateNetworkDomainRequest setNetworkDomainType(String networkDomainType) {
        this.networkDomainType = networkDomainType;
        return this;
    }
    public String getNetworkDomainType() {
        return this.networkDomainType;
    }

    public CreateNetworkDomainRequest setProxies(java.util.List<CreateNetworkDomainRequestProxies> proxies) {
        this.proxies = proxies;
        return this;
    }
    public java.util.List<CreateNetworkDomainRequestProxies> getProxies() {
        return this.proxies;
    }

    public CreateNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateNetworkDomainRequestProxies extends TeaModel {
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

        public static CreateNetworkDomainRequestProxies build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkDomainRequestProxies self = new CreateNetworkDomainRequestProxies();
            return TeaModel.build(map, self);
        }

        public CreateNetworkDomainRequestProxies setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateNetworkDomainRequestProxies setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public CreateNetworkDomainRequestProxies setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateNetworkDomainRequestProxies setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateNetworkDomainRequestProxies setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public CreateNetworkDomainRequestProxies setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
