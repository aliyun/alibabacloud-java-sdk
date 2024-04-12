// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListNetworkDomainsResponseBody extends TeaModel {
    @NameInMap("NetworkDomains")
    public java.util.List<ListNetworkDomainsResponseBodyNetworkDomains> networkDomains;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("NodeType")
        public String nodeType;

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
