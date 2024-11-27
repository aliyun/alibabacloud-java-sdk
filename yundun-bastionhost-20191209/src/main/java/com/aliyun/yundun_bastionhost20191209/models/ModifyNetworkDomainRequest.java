// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyNetworkDomainRequest extends TeaModel {
    /**
     * <p>The new remarks of the network domain.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host to which the network domain to modify belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-x0r3hyr3f09</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the network domain to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The new name of the network domain.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NetworkDomainName")
    public String networkDomainName;

    /**
     * <p>The new connection mode of the network domain. Valid values:</p>
     * <ul>
     * <li><strong>Direct</strong></li>
     * <li><strong>Proxy</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Proxy</p>
     */
    @NameInMap("NetworkDomainType")
    public String networkDomainType;

    /**
     * <p>The information about the proxy servers in the network domain.</p>
     */
    @NameInMap("Proxies")
    public java.util.List<ModifyNetworkDomainRequestProxies> proxies;

    /**
     * <p>The region ID of the bastion host to which the network domain to modify belongs.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>The new IP address of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>114.21**.**</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The node type of the proxy server to modify. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: primary proxy server.</li>
         * <li><strong>Slave</strong>: secondary proxy server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Slave</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The new password of the proxy server account.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The new port of the proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The new proxy mode. Valid values:</p>
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
         * <p>The new username of the proxy server account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
