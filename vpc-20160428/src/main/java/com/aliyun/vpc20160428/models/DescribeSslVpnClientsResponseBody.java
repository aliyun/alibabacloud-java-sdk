// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientsResponseBody extends TeaModel {
    @NameInMap("ClientInfoList")
    public java.util.List<DescribeSslVpnClientsResponseBodyClientInfoList> clientInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("ConnectedTime")
        public Long connectedTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ReceiveBytes")
        public Long receiveBytes;

        @NameInMap("SendBytes")
        public Long sendBytes;

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
