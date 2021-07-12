// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformsResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("Platforms")
    public java.util.List<DescribeParentPlatformsResponseBodyPlatforms> platforms;

    public static DescribeParentPlatformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformsResponseBody self = new DescribeParentPlatformsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeParentPlatformsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeParentPlatformsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParentPlatformsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeParentPlatformsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeParentPlatformsResponseBody setPlatforms(java.util.List<DescribeParentPlatformsResponseBodyPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<DescribeParentPlatformsResponseBodyPlatforms> getPlatforms() {
        return this.platforms;
    }

    public static class DescribeParentPlatformsResponseBodyPlatforms extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ClientPort")
        public Long clientPort;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ClientGbId")
        public String clientGbId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Long port;

        @NameInMap("ClientUsername")
        public String clientUsername;

        @NameInMap("ClientPassword")
        public String clientPassword;

        @NameInMap("AutoStart")
        public Boolean autoStart;

        @NameInMap("ClientAuth")
        public Boolean clientAuth;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static DescribeParentPlatformsResponseBodyPlatforms build(java.util.Map<String, ?> map) throws Exception {
            DescribeParentPlatformsResponseBodyPlatforms self = new DescribeParentPlatformsResponseBodyPlatforms();
            return TeaModel.build(map, self);
        }

        public DescribeParentPlatformsResponseBodyPlatforms setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientPort(Long clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Long getClientPort() {
            return this.clientPort;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientGbId(String clientGbId) {
            this.clientGbId = clientGbId;
            return this;
        }
        public String getClientGbId() {
            return this.clientGbId;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientUsername(String clientUsername) {
            this.clientUsername = clientUsername;
            return this;
        }
        public String getClientUsername() {
            return this.clientUsername;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientPassword(String clientPassword) {
            this.clientPassword = clientPassword;
            return this;
        }
        public String getClientPassword() {
            return this.clientPassword;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setAutoStart(Boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public Boolean getAutoStart() {
            return this.autoStart;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientAuth(Boolean clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }
        public Boolean getClientAuth() {
            return this.clientAuth;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
