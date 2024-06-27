// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the data asset.</p>
     */
    @NameInMap("DataLimit")
    public DescribeDataLimitDetailResponseBodyDataLimit dataLimit;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataLimitDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitDetailResponseBody self = new DescribeDataLimitDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitDetailResponseBody setDataLimit(DescribeDataLimitDetailResponseBodyDataLimit dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }
    public DescribeDataLimitDetailResponseBodyDataLimit getDataLimit() {
        return this.dataLimit;
    }

    public DescribeDataLimitDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataLimitDetailResponseBodyDataLimit extends TeaModel {
        /**
         * <p>The status of the connectivity test between the data asset and DSC. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: indicates that the data asset was being connected.</li>
         * <li><strong>3</strong>: indicates that the data asset was connected to DSC.</li>
         * <li><strong>4</strong>: indicates that the data asset failed to be connected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The result that indicates the status of the connectivity test between the data asset and DSC. Valid values:</p>
         * <ul>
         * <li><strong>Passed</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Testing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("CheckStatusName")
        public String checkStatusName;

        /**
         * <p>The time when the data asset was connected to DSC. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>145600000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>12300</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The region in which the data asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Qingdao)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID and name of the data asset in the service to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eup49p6o274****.RDS_example</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The port number that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the region in which the data asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: AnalyticDB for MySQL</li>
         * <li><strong>4</strong>: Tablestore</li>
         * <li><strong>5</strong>: ApsaraDB RDS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>MaxCompute</strong></li>
         * <li><strong>OSS</strong></li>
         * <li><strong>ADS</strong></li>
         * <li><strong>OTS</strong></li>
         * <li><strong>RDS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The account of the user who manages the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>User01</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeDataLimitDetailResponseBodyDataLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitDetailResponseBodyDataLimit self = new DescribeDataLimitDetailResponseBodyDataLimit();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
