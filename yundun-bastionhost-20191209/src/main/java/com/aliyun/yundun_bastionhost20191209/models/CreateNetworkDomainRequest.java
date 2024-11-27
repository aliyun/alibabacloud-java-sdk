// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateNetworkDomainRequest extends TeaModel {
    /**
     * <p>The remarks of the network domain. The remarks can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host for which you want to create a network domain.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-lbj3bw4ma02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the network domain that you want to create. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    /**
     * <p>The connection mode of the network domain to be created. Valid values:</p>
     * <ul>
     * <li>Direct</li>
     * <li>Proxy</li>
     * </ul>
     * <p>This parameter is required.</p>
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
    public java.util.List<CreateNetworkDomainRequestProxies> proxies;

    /**
     * <p>The region ID of the bastion host for which you want to create a network domain.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>The IP address of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p><code>47.104.**.**</code></p>
         */
        @NameInMap("Address")
        public String address;

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
         * <p>The Base64-encoded password of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The port of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The proxy type. Valid values:</p>
         * <ul>
         * <li><strong>SSHProxy</strong></li>
         * <li><strong>HTTPProxy</strong></li>
         * <li><strong>Socks5Proxy</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSHProxy</p>
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
