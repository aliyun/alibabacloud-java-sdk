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
     * 
     * <strong>example:</strong>
     * <p>D81DD78E-E006-5C65-A171-C8CB09XXXXX</p>
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
         * <ul>
         * <li><strong>true</strong>: online</li>
         * <li><strong>false</strong>: offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AliNetOnline")
        public Boolean aliNetOnline;

        /**
         * <p>The blocking type. Valid values:</p>
         * <ul>
         * <li><strong>group</strong>: security group</li>
         * <li><strong>alinet</strong>: host network extension</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("BlockType")
        public String blockType;

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AliNetNotOnline</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>myInstance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.121.1xx</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.xx</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether the rule is enabled for the server.</p>
         * <ul>
         * <li><strong>2</strong>: enabling failed</li>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The information that is returned after brute-force attacks are blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aliUid&quot;:*******,&quot;groupId&quot;:&quot;sg-xxxx&quot;,&quot;groupName&quot;:&quot;Sas_Malicious_Ip_Security_Group&quot;,&quot;groupType&quot;:&quot;normal&quot;,&quot;instanceId&quot;:&quot;i-xxxx&quot;,&quot;regionId&quot;:&quot;cn-shenzhen&quot;,&quot;vpcId&quot;:&quot;vpc-xxxxxxxx&quot;}</p>
         */
        @NameInMap("SuccessInfo")
        public String successInfo;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>f2d6e901-1004-4ca8-9dae-53ec04a9****</p>
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
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of servers to which the defense rule is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
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
