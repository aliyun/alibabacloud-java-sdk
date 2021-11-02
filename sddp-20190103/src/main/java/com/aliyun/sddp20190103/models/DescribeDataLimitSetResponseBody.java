// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetResponseBody extends TeaModel {
    @NameInMap("DataLimitSet")
    public DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet;

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
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        @NameInMap("CheckStatusName")
        public String checkStatusName;

        @NameInMap("Connector")
        public String connector;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

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
        @NameInMap("BucketName")
        public String bucketName;

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
        @NameInMap("LocalName")
        public String localName;

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
        @NameInMap("DataLimitList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> dataLimitList;

        @NameInMap("OssBucketList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> ossBucketList;

        @NameInMap("RegionList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> regionList;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

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
