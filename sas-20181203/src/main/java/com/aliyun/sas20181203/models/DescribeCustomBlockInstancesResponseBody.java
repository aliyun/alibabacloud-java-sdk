// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockInstancesResponseBody extends TeaModel {
    /**
     * <p>The server ID.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<DescribeCustomBlockInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCustomBlockInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomBlockInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockInstancesResponseBody self = new DescribeCustomBlockInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockInstancesResponseBody setInstanceList(java.util.List<DescribeCustomBlockInstancesResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeCustomBlockInstancesResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public DescribeCustomBlockInstancesResponseBody setPageInfo(DescribeCustomBlockInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeCustomBlockInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeCustomBlockInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomBlockInstancesResponseBodyInstanceList extends TeaModel {
        /**
         * <p>The status of the host network extension. Valid values:</p>
         * <br>
         * <p>*   **true**: online</p>
         * <p>*   **false**: offline</p>
         */
        @NameInMap("AliNetOnline")
        public Boolean aliNetOnline;

        /**
         * <p>The blocking type. Valid values:</p>
         * <br>
         * <p>*   **group**: security group</p>
         * <p>*   **alinet**: host network extension</p>
         */
        @NameInMap("BlockType")
        public String blockType;

        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether the rule is enabled for the server.</p>
         * <br>
         * <p>*   **2**: enabling failed</p>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The information that is returned after brute-force attacks are blocked.</p>
         */
        @NameInMap("SuccessInfo")
        public String successInfo;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCustomBlockInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomBlockInstancesResponseBodyInstanceList self = new DescribeCustomBlockInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setAliNetOnline(Boolean aliNetOnline) {
            this.aliNetOnline = aliNetOnline;
            return this;
        }
        public Boolean getAliNetOnline() {
            return this.aliNetOnline;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setBlockType(String blockType) {
            this.blockType = blockType;
            return this;
        }
        public String getBlockType() {
            return this.blockType;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setSuccessInfo(String successInfo) {
            this.successInfo = successInfo;
            return this;
        }
        public String getSuccessInfo() {
            return this.successInfo;
        }

        public DescribeCustomBlockInstancesResponseBodyInstanceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeCustomBlockInstancesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of servers to which the defense rule is applied.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCustomBlockInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomBlockInstancesResponseBodyPageInfo self = new DescribeCustomBlockInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCustomBlockInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCustomBlockInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCustomBlockInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCustomBlockInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
