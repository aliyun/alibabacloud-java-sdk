// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayNFSClientsResponseBody extends TeaModel {
    @NameInMap("ClientInfoList")
    public DescribeGatewayNFSClientsResponseBodyClientInfoList clientInfoList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Version3Enabled")
    public Boolean version3Enabled;

    @NameInMap("Version40Enabled")
    public Boolean version40Enabled;

    @NameInMap("Version41Enabled")
    public Boolean version41Enabled;

    public static DescribeGatewayNFSClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayNFSClientsResponseBody self = new DescribeGatewayNFSClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayNFSClientsResponseBody setClientInfoList(DescribeGatewayNFSClientsResponseBodyClientInfoList clientInfoList) {
        this.clientInfoList = clientInfoList;
        return this;
    }
    public DescribeGatewayNFSClientsResponseBodyClientInfoList getClientInfoList() {
        return this.clientInfoList;
    }

    public DescribeGatewayNFSClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayNFSClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayNFSClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewayNFSClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewayNFSClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayNFSClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayNFSClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGatewayNFSClientsResponseBody setVersion3Enabled(Boolean version3Enabled) {
        this.version3Enabled = version3Enabled;
        return this;
    }
    public Boolean getVersion3Enabled() {
        return this.version3Enabled;
    }

    public DescribeGatewayNFSClientsResponseBody setVersion40Enabled(Boolean version40Enabled) {
        this.version40Enabled = version40Enabled;
        return this;
    }
    public Boolean getVersion40Enabled() {
        return this.version40Enabled;
    }

    public DescribeGatewayNFSClientsResponseBody setVersion41Enabled(Boolean version41Enabled) {
        this.version41Enabled = version41Enabled;
        return this;
    }
    public Boolean getVersion41Enabled() {
        return this.version41Enabled;
    }

    public static class DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo extends TeaModel {
        @NameInMap("ClientIpAddr")
        public String clientIpAddr;

        @NameInMap("HasNFSv3")
        public Boolean hasNFSv3;

        @NameInMap("HasNFSv40")
        public Boolean hasNFSv40;

        @NameInMap("HasNFSv41")
        public Boolean hasNFSv41;

        public static DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo self = new DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo setClientIpAddr(String clientIpAddr) {
            this.clientIpAddr = clientIpAddr;
            return this;
        }
        public String getClientIpAddr() {
            return this.clientIpAddr;
        }

        public DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo setHasNFSv3(Boolean hasNFSv3) {
            this.hasNFSv3 = hasNFSv3;
            return this;
        }
        public Boolean getHasNFSv3() {
            return this.hasNFSv3;
        }

        public DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo setHasNFSv40(Boolean hasNFSv40) {
            this.hasNFSv40 = hasNFSv40;
            return this;
        }
        public Boolean getHasNFSv40() {
            return this.hasNFSv40;
        }

        public DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo setHasNFSv41(Boolean hasNFSv41) {
            this.hasNFSv41 = hasNFSv41;
            return this;
        }
        public Boolean getHasNFSv41() {
            return this.hasNFSv41;
        }

    }

    public static class DescribeGatewayNFSClientsResponseBodyClientInfoList extends TeaModel {
        @NameInMap("ClientInfo")
        public java.util.List<DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo> clientInfo;

        public static DescribeGatewayNFSClientsResponseBodyClientInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayNFSClientsResponseBodyClientInfoList self = new DescribeGatewayNFSClientsResponseBodyClientInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayNFSClientsResponseBodyClientInfoList setClientInfo(java.util.List<DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo> clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }
        public java.util.List<DescribeGatewayNFSClientsResponseBodyClientInfoListClientInfo> getClientInfo() {
            return this.clientInfo;
        }

    }

}
