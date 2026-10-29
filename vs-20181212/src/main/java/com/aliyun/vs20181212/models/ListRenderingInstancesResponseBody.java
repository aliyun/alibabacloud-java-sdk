// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of cloud application service instances.</p>
     */
    @NameInMap("RenderingInstances")
    public java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> renderingInstances;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud application service instances.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstancesResponseBody self = new ListRenderingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstancesResponseBody setRenderingInstances(java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> renderingInstances) {
        this.renderingInstances = renderingInstances;
        return this;
    }
    public java.util.List<ListRenderingInstancesResponseBodyRenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
    }

    public ListRenderingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingInstancesResponseBodyRenderingInstances extends TeaModel {
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the cloud application service instance was created. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-17T02:18:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-17T02:18:04Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestInstance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum outbound bandwidth limit. Unit: Mbit/s. A value of 0 indicates that no bandwidth limit is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxEgressBandwidth")
        public String maxEgressBandwidth;

        /**
         * <p>The maximum inbound bandwidth limit. Unit: Mbit/s. A value of 0 indicates that no bandwidth limit is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxIngressBandwidth")
        public String maxIngressBandwidth;

        /**
         * <p>The instance ID of the cloud application service.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <p>The instance type of the cloud application service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>crs.cp.l1</p>
         */
        @NameInMap("RenderingSpec")
        public String renderingSpec;

        /**
         * <p>The status of the service host.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("ServerStatus")
        public String serverStatus;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The cloud storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        public static ListRenderingInstancesResponseBodyRenderingInstances build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingInstancesResponseBodyRenderingInstances self = new ListRenderingInstancesResponseBodyRenderingInstances();
            return TeaModel.build(map, self);
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setMaxEgressBandwidth(String maxEgressBandwidth) {
            this.maxEgressBandwidth = maxEgressBandwidth;
            return this;
        }
        public String getMaxEgressBandwidth() {
            return this.maxEgressBandwidth;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setMaxIngressBandwidth(String maxIngressBandwidth) {
            this.maxIngressBandwidth = maxIngressBandwidth;
            return this;
        }
        public String getMaxIngressBandwidth() {
            return this.maxIngressBandwidth;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setRenderingSpec(String renderingSpec) {
            this.renderingSpec = renderingSpec;
            return this;
        }
        public String getRenderingSpec() {
            return this.renderingSpec;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setServerStatus(String serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public String getServerStatus() {
            return this.serverStatus;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRenderingInstancesResponseBodyRenderingInstances setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

}
