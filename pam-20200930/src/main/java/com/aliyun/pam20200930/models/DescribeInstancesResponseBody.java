// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstancesResponseBodyInstancesLicenseInfo extends TeaModel {
        @NameInMap("MaxRegisteredAsset")
        public Long maxRegisteredAsset;

        @NameInMap("MaxSingleAssetCredential")
        public Long maxSingleAssetCredential;

        @NameInMap("MaxConcurrentSession")
        public Long maxConcurrentSession;

        @NameInMap("CurrentRegisteredAsset")
        public Long currentRegisteredAsset;

        public static DescribeInstancesResponseBodyInstancesLicenseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesLicenseInfo self = new DescribeInstancesResponseBodyInstancesLicenseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesLicenseInfo setMaxRegisteredAsset(Long maxRegisteredAsset) {
            this.maxRegisteredAsset = maxRegisteredAsset;
            return this;
        }
        public Long getMaxRegisteredAsset() {
            return this.maxRegisteredAsset;
        }

        public DescribeInstancesResponseBodyInstancesLicenseInfo setMaxSingleAssetCredential(Long maxSingleAssetCredential) {
            this.maxSingleAssetCredential = maxSingleAssetCredential;
            return this;
        }
        public Long getMaxSingleAssetCredential() {
            return this.maxSingleAssetCredential;
        }

        public DescribeInstancesResponseBodyInstancesLicenseInfo setMaxConcurrentSession(Long maxConcurrentSession) {
            this.maxConcurrentSession = maxConcurrentSession;
            return this;
        }
        public Long getMaxConcurrentSession() {
            return this.maxConcurrentSession;
        }

        public DescribeInstancesResponseBodyInstancesLicenseInfo setCurrentRegisteredAsset(Long currentRegisteredAsset) {
            this.currentRegisteredAsset = currentRegisteredAsset;
            return this;
        }
        public Long getCurrentRegisteredAsset() {
            return this.currentRegisteredAsset;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("IdaasInstanceId")
        public String idaasInstanceId;

        @NameInMap("PortalHomeUrl")
        public String portalHomeUrl;

        @NameInMap("AssetInitStatus")
        public String assetInitStatus;

        @NameInMap("LicenseInfo")
        public DescribeInstancesResponseBodyInstancesLicenseInfo licenseInfo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IdaasRegionId")
        public String idaasRegionId;

        @NameInMap("AppInitStatus")
        public String appInitStatus;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setIdaasInstanceId(String idaasInstanceId) {
            this.idaasInstanceId = idaasInstanceId;
            return this;
        }
        public String getIdaasInstanceId() {
            return this.idaasInstanceId;
        }

        public DescribeInstancesResponseBodyInstances setPortalHomeUrl(String portalHomeUrl) {
            this.portalHomeUrl = portalHomeUrl;
            return this;
        }
        public String getPortalHomeUrl() {
            return this.portalHomeUrl;
        }

        public DescribeInstancesResponseBodyInstances setAssetInitStatus(String assetInitStatus) {
            this.assetInitStatus = assetInitStatus;
            return this;
        }
        public String getAssetInitStatus() {
            return this.assetInitStatus;
        }

        public DescribeInstancesResponseBodyInstances setLicenseInfo(DescribeInstancesResponseBodyInstancesLicenseInfo licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesLicenseInfo getLicenseInfo() {
            return this.licenseInfo;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setIdaasRegionId(String idaasRegionId) {
            this.idaasRegionId = idaasRegionId;
            return this;
        }
        public String getIdaasRegionId() {
            return this.idaasRegionId;
        }

        public DescribeInstancesResponseBodyInstances setAppInitStatus(String appInitStatus) {
            this.appInitStatus = appInitStatus;
            return this;
        }
        public String getAppInitStatus() {
            return this.appInitStatus;
        }

    }

}
