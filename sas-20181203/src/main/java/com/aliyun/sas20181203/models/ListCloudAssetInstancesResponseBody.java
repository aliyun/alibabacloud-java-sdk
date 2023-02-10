// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListCloudAssetInstancesResponseBodyInstances> instances;

    @NameInMap("PageInfo")
    public ListCloudAssetInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCloudAssetInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetInstancesResponseBody self = new ListCloudAssetInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetInstancesResponseBody setInstances(java.util.List<ListCloudAssetInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListCloudAssetInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListCloudAssetInstancesResponseBody setPageInfo(ListCloudAssetInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCloudAssetInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCloudAssetInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAssetInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudAssetInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AssetSubType")
        public String assetSubType;

        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("AssetTypeName")
        public String assetTypeName;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("SecurityInfo")
        public String securityInfo;

        @NameInMap("Vendor")
        public Integer vendor;

        public static ListCloudAssetInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesResponseBodyInstances self = new ListCloudAssetInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesResponseBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetSubType(String assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public String getAssetSubType() {
            return this.assetSubType;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetSubTypeName(String assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
            return this;
        }
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListCloudAssetInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCloudAssetInstancesResponseBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public ListCloudAssetInstancesResponseBodyInstances setSecurityInfo(String securityInfo) {
            this.securityInfo = securityInfo;
            return this;
        }
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        public ListCloudAssetInstancesResponseBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class ListCloudAssetInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloudAssetInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesResponseBodyPageInfo self = new ListCloudAssetInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
