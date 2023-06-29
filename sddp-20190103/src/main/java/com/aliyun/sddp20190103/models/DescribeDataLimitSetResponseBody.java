// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetResponseBody extends TeaModel {
    /**
     * <p>The information about the data asset.</p>
     */
    @NameInMap("DataLimitSet")
    public DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet;

    /**
     * <p>The ID of the request.</p>
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
         * <p>Indicates whether the test of connectivity between DSC and the data asset is passed.</p>
         * <br>
         * <p>*   **2**: The connectivity test is in progress.</p>
         * <p>*   **3**: The connectivity test is passed.</p>
         * <p>*   **4**: The connectivity test failed.</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The name of the data detection status.</p>
         */
        @NameInMap("CheckStatusName")
        public String checkStatusName;

        /**
         * <p>The connection string that is used to access the data asset.</p>
         */
        @NameInMap("Connector")
        public String connector;

        /**
         * <p>The time when the data asset was created. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the data asset.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The region in which the data asset resides.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The parent asset ID of the data asset.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The region in which the data asset resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **1**: MaxCompute</p>
         * <p>*   **2**: OSS</p>
         * <p>*   **3**: AnalyticDB for MySQL</p>
         * <p>*   **4**: Tablestore</p>
         * <p>*   **5**: ApsaraDB RDS</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The code of the service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **ODPS**</p>
         * <p>*   **OSS**</p>
         * <p>*   **ADS**</p>
         * <p>*   **OTS**</p>
         * <p>*   **RDS**</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The username that is used to access the data asset.</p>
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
         * <p>The name of the OSS bucket to which the OSS object belongs.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The region ID of the OSS object.</p>
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
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the region.</p>
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
         * <p>An array that consists of data assets that DSC is authorized to scan.</p>
         */
        @NameInMap("DataLimitList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> dataLimitList;

        /**
         * <p>An array consisting of the OSS objects that DSC is authorized to scan.</p>
         */
        @NameInMap("OssBucketList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> ossBucketList;

        /**
         * <p>An array consisting of the regions in which the data assets can be scanned.</p>
         */
        @NameInMap("RegionList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> regionList;

        /**
         * <p>The type of service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **1**: MaxCompute</p>
         * <p>*   **2**: OSS</p>
         * <p>*   **3**: AnalyticDB for MySQL</p>
         * <p>*   **4**: Tablestore</p>
         * <p>*   **5**: ApsaraDB RDS</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **ODPS**</p>
         * <p>*   **OSS**</p>
         * <p>*   **ADS**</p>
         * <p>*   **OTS**</p>
         * <p>*   **RDS**</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The total number of data objects in the data assets.</p>
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
