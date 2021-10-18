// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Instances")
    public ListInstancesResponseBodyInstances instances;

    @NameInMap("CreateTime")
    public String createTime;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancesResponseBody setInstances(ListInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        // 实例名称，唯一键
        @NameInMap("InstanceName")
        public String instanceName;

        // 资源组id
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SPInstanceId")
        public String SPInstanceId;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceSpecification")
        public String instanceSpecification;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("VCUQuota")
        public Integer VCUQuota;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setSPInstanceId(String SPInstanceId) {
            this.SPInstanceId = SPInstanceId;
            return this;
        }
        public String getSPInstanceId() {
            return this.SPInstanceId;
        }

        public ListInstancesResponseBodyInstances setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListInstancesResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyInstances setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListInstancesResponseBodyInstances setInstanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }
        public String getInstanceSpecification() {
            return this.instanceSpecification;
        }

        public ListInstancesResponseBodyInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyInstances setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListInstancesResponseBodyInstances setVCUQuota(Integer VCUQuota) {
            this.VCUQuota = VCUQuota;
            return this;
        }
        public Integer getVCUQuota() {
            return this.VCUQuota;
        }

        public ListInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
