// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetResponseBody extends TeaModel {
    /**
     * <p>Information about the authorized data assets.</p>
     */
    @NameInMap("DataLimitSet")
    public DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataLimitSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitSetResponseBody self = new DescribeDataLimitSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitSetResponseBody setDataLimitSet(DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet) {
        this.dataLimitSet = dataLimitSet;
        return this;
    }
    public DescribeDataLimitSetResponseBodyDataLimitSet getDataLimitSet() {
        return this.dataLimitSet;
    }

    public DescribeDataLimitSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList extends TeaModel {
        /**
         * <p>The status of the connectivity test between Security Center and the authorized data asset.</p>
         * <ul>
         * <li><p><strong>2</strong>: The connectivity test is in progress.</p>
         * </li>
         * <li><p><strong>3</strong>: The connectivity test is passed.</p>
         * </li>
         * <li><p><strong>4</strong>: The connectivity test has failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The name of the connectivity test status.</p>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("CheckStatusName")
        public String checkStatusName;

        /**
         * <p>The connection string for the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc:mysql://10.<em>.</em>.94:3306/test_demo</p>
         */
        @NameInMap("Connector")
        public String connector;

        /**
         * <p>The time when the data asset was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625587423000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The unique ID of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the region where the data asset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the parent asset.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The ID of the region where the data asset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-****</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the data asset. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute.</p>
         * </li>
         * <li><p><strong>2</strong>: OSS.</p>
         * </li>
         * <li><p><strong>3</strong>: ADS.</p>
         * </li>
         * <li><p><strong>4</strong>: OTS.</p>
         * </li>
         * <li><p><strong>5</strong>: RDS.</p>
         * </li>
         * <li><p><strong>6</strong>: SELF_DB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The code for the data asset type. Valid values:</p>
         * <ul>
         * <li><p><strong>MaxCompute</strong></p>
         * </li>
         * <li><p><strong>OSS</strong></p>
         * </li>
         * <li><p><strong>ADS</strong></p>
         * </li>
         * <li><p><strong>OTS</strong></p>
         * </li>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>SELF_DB</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The username of the data owner.</p>
         * 
         * <strong>example:</strong>
         * <p>tsts</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList self = new DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setConnector(String connector) {
            this.connector = connector;
            return this;
        }
        public String getConnector() {
            return this.connector;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The ID of the region where the OSS bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-****</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList self = new DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetRegionList extends TeaModel {
        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-****</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDataLimitSetResponseBodyDataLimitSetRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetRegionList self = new DescribeDataLimitSetResponseBodyDataLimitSetRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetRegionList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSet extends TeaModel {
        /**
         * <p>A list of authorized data assets.</p>
         */
        @NameInMap("DataLimitList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> dataLimitList;

        /**
         * <p>A list of authorized OSS buckets.</p>
         */
        @NameInMap("OssBucketList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> ossBucketList;

        /**
         * <p>A list of regions that support scanning.</p>
         */
        @NameInMap("RegionList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> regionList;

        /**
         * <p>The type of the data asset. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute.</p>
         * </li>
         * <li><p><strong>2</strong>: OSS.</p>
         * </li>
         * <li><p><strong>3</strong>: ADS.</p>
         * </li>
         * <li><p><strong>4</strong>: OTS.</p>
         * </li>
         * <li><p><strong>5</strong>: RDS.</p>
         * </li>
         * <li><p><strong>6</strong>: SELF_DB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The code for the data asset type. Valid values:</p>
         * <ul>
         * <li><p><strong>MaxCompute</strong></p>
         * </li>
         * <li><p><strong>OSS</strong></p>
         * </li>
         * <li><p><strong>ADS</strong></p>
         * </li>
         * <li><p><strong>OTS</strong></p>
         * </li>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>SELF_DB</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The total number of assets found.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDataLimitSetResponseBodyDataLimitSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSet self = new DescribeDataLimitSetResponseBodyDataLimitSet();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setDataLimitList(java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> dataLimitList) {
            this.dataLimitList = dataLimitList;
            return this;
        }
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> getDataLimitList() {
            return this.dataLimitList;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setOssBucketList(java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> ossBucketList) {
            this.ossBucketList = ossBucketList;
            return this;
        }
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> getOssBucketList() {
            return this.ossBucketList;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setRegionList(java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> getRegionList() {
            return this.regionList;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
