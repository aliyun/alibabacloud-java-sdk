// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeApplicationsResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsResponseBody self = new DescribeApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsResponseBody setItems(DescribeApplicationsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeApplicationsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.0.3</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint self = new DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeApplicationsResponseBodyItemsApplicationsEndpoints extends TeaModel {
        @NameInMap("endpoint")
        public java.util.List<DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint> endpoint;

        public static DescribeApplicationsResponseBodyItemsApplicationsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItemsApplicationsEndpoints self = new DescribeApplicationsResponseBodyItemsApplicationsEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItemsApplicationsEndpoints setEndpoint(java.util.List<DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<DescribeApplicationsResponseBodyItemsApplicationsEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

    public static class DescribeApplicationsResponseBodyItemsApplicationsTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApplicationsResponseBodyItemsApplicationsTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItemsApplicationsTagsTag self = new DescribeApplicationsResponseBodyItemsApplicationsTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItemsApplicationsTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationsResponseBodyItemsApplicationsTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationsResponseBodyItemsApplicationsTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeApplicationsResponseBodyItemsApplicationsTagsTag> tag;

        public static DescribeApplicationsResponseBodyItemsApplicationsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItemsApplicationsTags self = new DescribeApplicationsResponseBodyItemsApplicationsTags();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItemsApplicationsTags setTag(java.util.List<DescribeApplicationsResponseBodyItemsApplicationsTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeApplicationsResponseBodyItemsApplicationsTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeApplicationsResponseBodyItemsApplications extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>pc-xxxxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Endpoints")
        public DescribeApplicationsResponseBodyItemsApplicationsEndpoints endpoints;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <strong>example:</strong>
         * <p>2025-06-25T09:37:10Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>pcs-**************</p>
         */
        @NameInMap("PolarFSInstanceId")
        public String polarFSInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeApplicationsResponseBodyItemsApplicationsTags tags;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeApplicationsResponseBodyItemsApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItemsApplications self = new DescribeApplicationsResponseBodyItemsApplications();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItemsApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeApplicationsResponseBodyItemsApplications setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public DescribeApplicationsResponseBodyItemsApplications setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeApplicationsResponseBodyItemsApplications setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeApplicationsResponseBodyItemsApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApplicationsResponseBodyItemsApplications setEndpoints(DescribeApplicationsResponseBodyItemsApplicationsEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeApplicationsResponseBodyItemsApplicationsEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeApplicationsResponseBodyItemsApplications setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeApplicationsResponseBodyItemsApplications setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeApplicationsResponseBodyItemsApplications setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeApplicationsResponseBodyItemsApplications setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeApplicationsResponseBodyItemsApplications setPolarFSInstanceId(String polarFSInstanceId) {
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }
        public String getPolarFSInstanceId() {
            return this.polarFSInstanceId;
        }

        public DescribeApplicationsResponseBodyItemsApplications setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApplicationsResponseBodyItemsApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApplicationsResponseBodyItemsApplications setTags(DescribeApplicationsResponseBodyItemsApplicationsTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeApplicationsResponseBodyItemsApplicationsTags getTags() {
            return this.tags;
        }

        public DescribeApplicationsResponseBodyItemsApplications setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeApplicationsResponseBodyItems extends TeaModel {
        @NameInMap("Applications")
        public java.util.List<DescribeApplicationsResponseBodyItemsApplications> applications;

        public static DescribeApplicationsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyItems self = new DescribeApplicationsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyItems setApplications(java.util.List<DescribeApplicationsResponseBodyItemsApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<DescribeApplicationsResponseBodyItemsApplications> getApplications() {
            return this.applications;
        }

    }

}
