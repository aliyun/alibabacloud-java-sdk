// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientsResponseBody extends TeaModel {
    /**
     * <p>The list of clients.</p>
     */
    @NameInMap("ClientInfoList")
    public java.util.List<DescribeSslVpnClientsResponseBodyClientInfoList> clientInfoList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-central-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>885E117D-06A9-38A3-8DD2-40BDAC429FFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-gw8gfb947ctddabja****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static DescribeSslVpnClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientsResponseBody self = new DescribeSslVpnClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientsResponseBody setClientInfoList(java.util.List<DescribeSslVpnClientsResponseBodyClientInfoList> clientInfoList) {
        this.clientInfoList = clientInfoList;
        return this;
    }
    public java.util.List<DescribeSslVpnClientsResponseBodyClientInfoList> getClientInfoList() {
        return this.clientInfoList;
    }

    public DescribeSslVpnClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSslVpnClientsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSslVpnClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSslVpnClientsResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class DescribeSslVpnClientsResponseBodyClientInfoList extends TeaModel {
        /**
         * <p>The SSL client certificate used by the client.</p>
         * <blockquote>
         * <p> If the client uses two-factor authentication to establish an SSL-VPN connection to Alibaba Cloud, the return value is the username of the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CN=vsc-gw8gkh6gtilf1whgc****</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The timestamp that indicates when the client connected to Alibaba Cloud through an SSL-VPN connection. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1670985008000</p>
         */
        @NameInMap("ConnectedTime")
        public Long connectedTime;

        /**
         * <p>The actual public IP address used by the client when the client established an SSL-VPN connection to Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>8.XX.XX.15</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port used by the client when the client established an SSL-VPN connection to Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>4****</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The private IP address allocated to the client by the VPN gateway when the client established an SSL-VPN connection to Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The amount of data transferred from the client to the VPN gateway through the SSL-VPN connection. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>60782</p>
         */
        @NameInMap("ReceiveBytes")
        public Long receiveBytes;

        /**
         * <p>The amount of data transferred from the VPN gateway to the client through the SSL-VPN connection. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>57144</p>
         */
        @NameInMap("SendBytes")
        public Long sendBytes;

        /**
         * <p>The status of the SSL-VPN connection.</p>
         * <p>The value is set to <strong>online</strong>, which indicates that the client has connected to Alibaba Cloud through an SSL-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSslVpnClientsResponseBodyClientInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientsResponseBodyClientInfoList self = new DescribeSslVpnClientsResponseBodyClientInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setConnectedTime(Long connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }
        public Long getConnectedTime() {
            return this.connectedTime;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setReceiveBytes(Long receiveBytes) {
            this.receiveBytes = receiveBytes;
            return this;
        }
        public Long getReceiveBytes() {
            return this.receiveBytes;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setSendBytes(Long sendBytes) {
            this.sendBytes = sendBytes;
            return this;
        }
        public Long getSendBytes() {
            return this.sendBytes;
        }

        public DescribeSslVpnClientsResponseBodyClientInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
