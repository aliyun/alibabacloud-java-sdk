// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The details about the instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The token that determines the start position of the next query. If this parameter is empty, all instances that you want to query are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESCG15aC1xxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E734979F-5A44-5993-9CE5-C23103576923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The instance alias.</p>
         * 
         * <strong>example:</strong>
         * <p>instance-test</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-07T09:19:21Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the test instance.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The name of the instance, which is used to uniquely identify the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the instance.</p>
         * <ul>
         * <li>SSD: high-performance instance</li>
         * <li>HYBRID: capacity instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("InstanceSpecification")
        public String instanceSpecification;

        /**
         * <p>The instance status.</p>
         * <ul>
         * <li>normal: The instance works as expected.</li>
         * <li>forbidden: The instance is disabled.</li>
         * <li>deleting: The instance is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>Indicates whether zone-redundant storage (ZRS) is enabled for the instance.</p>
         * <ul>
         * <li>true: ZRS is enabled for the instance.</li>
         * <li>false: Locally redundant storage (LRS) is enabled for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMultiAZ")
        public Boolean isMultiAZ;

        /**
         * <p>The billing method.</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay as you go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jnbcd</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ots_standard_public_cn-g4t3igqjj002</p>
         */
        @NameInMap("SPInstanceId")
        public String SPInstanceId;

        /**
         * <p>The storage type.</p>
         * <ul>
         * <li>SSD: high-performance</li>
         * <li>HYBRID: capacity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13542356466</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The VCU quota.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("VCUQuota")
        public Integer VCUQuota;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListInstancesResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setInstanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }
        public String getInstanceSpecification() {
            return this.instanceSpecification;
        }

        public ListInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstancesResponseBodyInstances setIsMultiAZ(Boolean isMultiAZ) {
            this.isMultiAZ = isMultiAZ;
            return this;
        }
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

        public ListInstancesResponseBodyInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstances setSPInstanceId(String SPInstanceId) {
            this.SPInstanceId = SPInstanceId;
            return this;
        }
        public String getSPInstanceId() {
            return this.SPInstanceId;
        }

        public ListInstancesResponseBodyInstances setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListInstancesResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyInstances setVCUQuota(Integer VCUQuota) {
            this.VCUQuota = VCUQuota;
            return this;
        }
        public Integer getVCUQuota() {
            return this.VCUQuota;
        }

    }

}
