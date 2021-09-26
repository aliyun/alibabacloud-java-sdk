// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DataLimitSet")
    public DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet;

    public static DescribeDataLimitSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitSetResponseBody self = new DescribeDataLimitSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataLimitSetResponseBody setDataLimitSet(DescribeDataLimitSetResponseBodyDataLimitSet dataLimitSet) {
        this.dataLimitSet = dataLimitSet;
        return this;
    }
    public DescribeDataLimitSetResponseBodyDataLimitSet getDataLimitSet() {
        return this.dataLimitSet;
    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList extends TeaModel {
        @NameInMap("SupportEvent")
        public Boolean supportEvent;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("CheckStatus")
        public Integer checkStatus;

        @NameInMap("Connector")
        public String connector;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("CheckStatusName")
        public String checkStatusName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        @NameInMap("EventStatus")
        public Integer eventStatus;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        public static DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList self = new DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setSupportEvent(Boolean supportEvent) {
            this.supportEvent = supportEvent;
            return this;
        }
        public Boolean getSupportEvent() {
            return this.supportEvent;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setConnector(String connector) {
            this.connector = connector;
            return this;
        }
        public String getConnector() {
            return this.connector;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setLogStoreDay(Integer logStoreDay) {
            this.logStoreDay = logStoreDay;
            return this;
        }
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
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

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("BucketName")
        public String bucketName;

        public static DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList self = new DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSetRegionList extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("LocalName")
        public String localName;

        public static DescribeDataLimitSetResponseBodyDataLimitSetRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSetRegionList self = new DescribeDataLimitSetResponseBodyDataLimitSetRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSetRegionList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

    }

    public static class DescribeDataLimitSetResponseBodyDataLimitSet extends TeaModel {
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DataLimitList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetDataLimitList> dataLimitList;

        @NameInMap("OssBucketList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetOssBucketList> ossBucketList;

        @NameInMap("RegionList")
        public java.util.List<DescribeDataLimitSetResponseBodyDataLimitSetRegionList> regionList;

        public static DescribeDataLimitSetResponseBodyDataLimitSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitSetResponseBodyDataLimitSet self = new DescribeDataLimitSetResponseBodyDataLimitSet();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitSetResponseBodyDataLimitSet setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
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

    }

}
