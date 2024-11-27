// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListNetworkDomainsResponseBody extends TeaModel {
    /**
     * <p>The network domains that are returned.</p>
     */
    @NameInMap("NetworkDomains")
    public java.util.List<ListNetworkDomainsResponseBodyNetworkDomains> networkDomains;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of network domains that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListNetworkDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkDomainsResponseBody self = new ListNetworkDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkDomainsResponseBody setNetworkDomains(java.util.List<ListNetworkDomainsResponseBodyNetworkDomains> networkDomains) {
        this.networkDomains = networkDomains;
        return this;
    }
    public java.util.List<ListNetworkDomainsResponseBodyNetworkDomains> getNetworkDomains() {
        return this.networkDomains;
    }

    public ListNetworkDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkDomainsResponseBodyNetworkDomainsProxiesState extends TeaModel {
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
         * <p>The status of the proxy server.</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Unavailable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ProxyState")
        public String proxyState;

        public static ListNetworkDomainsResponseBodyNetworkDomainsProxiesState build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkDomainsResponseBodyNetworkDomainsProxiesState self = new ListNetworkDomainsResponseBodyNetworkDomainsProxiesState();
            return TeaModel.build(map, self);
        }

        public ListNetworkDomainsResponseBodyNetworkDomainsProxiesState setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListNetworkDomainsResponseBodyNetworkDomainsProxiesState setProxyState(String proxyState) {
            this.proxyState = proxyState;
            return this;
        }
        public String getProxyState() {
            return this.proxyState;
        }

    }

    public static class ListNetworkDomainsResponseBodyNetworkDomains extends TeaModel {
        /**
         * <p>The remarks of the network domain.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the network domain is built-in.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>test</p>
         */
        @NameInMap("NetworkDomainName")
        public String networkDomainName;

        /**
         * <p>The connection mode of the network domain. Valid values:</p>
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

        @NameInMap("ProxiesState")
        public java.util.List<ListNetworkDomainsResponseBodyNetworkDomainsProxiesState> proxiesState;

        public static ListNetworkDomainsResponseBodyNetworkDomains build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkDomainsResponseBodyNetworkDomains self = new ListNetworkDomainsResponseBodyNetworkDomains();
            return TeaModel.build(map, self);
        }

        public ListNetworkDomainsResponseBodyNetworkDomains setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListNetworkDomainsResponseBodyNetworkDomains set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public ListNetworkDomainsResponseBodyNetworkDomains setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public ListNetworkDomainsResponseBodyNetworkDomains setNetworkDomainName(String networkDomainName) {
            this.networkDomainName = networkDomainName;
            return this;
        }
        public String getNetworkDomainName() {
            return this.networkDomainName;
        }

        public ListNetworkDomainsResponseBodyNetworkDomains setNetworkDomainType(String networkDomainType) {
            this.networkDomainType = networkDomainType;
            return this;
        }
        public String getNetworkDomainType() {
            return this.networkDomainType;
        }

        public ListNetworkDomainsResponseBodyNetworkDomains setProxiesState(java.util.List<ListNetworkDomainsResponseBodyNetworkDomainsProxiesState> proxiesState) {
            this.proxiesState = proxiesState;
            return this;
        }
        public java.util.List<ListNetworkDomainsResponseBodyNetworkDomainsProxiesState> getProxiesState() {
            return this.proxiesState;
        }

    }

}
