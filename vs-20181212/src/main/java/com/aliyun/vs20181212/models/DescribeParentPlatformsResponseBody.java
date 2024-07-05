// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Platforms")
    public java.util.List<DescribeParentPlatformsResponseBodyPlatforms> platforms;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeParentPlatformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformsResponseBody self = new DescribeParentPlatformsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
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

    public DescribeParentPlatformsResponseBody setPlatforms(java.util.List<DescribeParentPlatformsResponseBodyPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<DescribeParentPlatformsResponseBodyPlatforms> getPlatforms() {
        return this.platforms;
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

    public static class DescribeParentPlatformsResponseBodyPlatforms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoStart")
        public Boolean autoStart;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClientAuth")
        public Boolean clientAuth;

        /**
         * <strong>example:</strong>
         * <p>31010*****317542006</p>
         */
        @NameInMap("ClientGbId")
        public String clientGbId;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>admin123</p>
         */
        @NameInMap("ClientPassword")
        public String clientPassword;

        /**
         * <strong>example:</strong>
         * <p>5160</p>
         */
        @NameInMap("ClientPort")
        public Long clientPort;

        /**
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("ClientUsername")
        public String clientUsername;

        /**
         * <strong>example:</strong>
         * <p>2018-12-10T21:00:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>31000*****2170123451</p>
         */
        @NameInMap("GbId")
        public String gbId;

        /**
         * <strong>example:</strong>
         * <p>359*****374-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>5060</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeParentPlatformsResponseBodyPlatforms build(java.util.Map<String, ?> map) throws Exception {
            DescribeParentPlatformsResponseBodyPlatforms self = new DescribeParentPlatformsResponseBodyPlatforms();
            return TeaModel.build(map, self);
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

        public DescribeParentPlatformsResponseBodyPlatforms setClientGbId(String clientGbId) {
            this.clientGbId = clientGbId;
            return this;
        }
        public String getClientGbId() {
            return this.clientGbId;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientPassword(String clientPassword) {
            this.clientPassword = clientPassword;
            return this;
        }
        public String getClientPassword() {
            return this.clientPassword;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientPort(Long clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Long getClientPort() {
            return this.clientPort;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setClientUsername(String clientUsername) {
            this.clientUsername = clientUsername;
            return this;
        }
        public String getClientUsername() {
            return this.clientUsername;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeParentPlatformsResponseBodyPlatforms setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
