// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAllInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAllInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>instance not exists</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>c2f78a783f49457caba6bace6f6f79e4</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAllInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllInstancesResponseBody self = new ListAllInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllInstancesResponseBody setData(java.util.List<ListAllInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListAllInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAllInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAllInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAllInstancesResponseBodyDataAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sysom</p>
         */
        @NameInMap("infoKey")
        public String infoKey;

        /**
         * <strong>example:</strong>
         * <p>instance_tag</p>
         */
        @NameInMap("infoType")
        public String infoType;

        /**
         * <strong>example:</strong>
         * <p>diagnosis</p>
         */
        @NameInMap("infoValue")
        public String infoValue;

        public static ListAllInstancesResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListAllInstancesResponseBodyDataAttributes self = new ListAllInstancesResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public ListAllInstancesResponseBodyDataAttributes setInfoKey(String infoKey) {
            this.infoKey = infoKey;
            return this;
        }
        public String getInfoKey() {
            return this.infoKey;
        }

        public ListAllInstancesResponseBodyDataAttributes setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public ListAllInstancesResponseBodyDataAttributes setInfoValue(String infoValue) {
            this.infoValue = infoValue;
            return this;
        }
        public String getInfoValue() {
            return this.infoValue;
        }

    }

    public static class ListAllInstancesResponseBodyData extends TeaModel {
        @NameInMap("agentConfigId")
        public String agentConfigId;

        @NameInMap("agentConfigName")
        public String agentConfigName;

        @NameInMap("attributes")
        public java.util.List<ListAllInstancesResponseBodyDataAttributes> attributes;

        /**
         * <strong>example:</strong>
         * <p>3b24a621-acb3-11ef-8c90-00163e1029af</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>zjk_vpc_domain_1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20250117.vhd</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        @NameInMap("installLevel")
        public String installLevel;

        /**
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("installType")
        public String installType;

        /**
         * <strong>example:</strong>
         * <p>i-bp17uabeke9v7n30abm2</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>5.10.134-18.al8.x86_64</p>
         */
        @NameInMap("kernelVersion")
        public String kernelVersion;

        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("manageLevel")
        public String manageLevel;

        /**
         * <strong>example:</strong>
         * <p>managed</p>
         */
        @NameInMap("manageType")
        public String manageType;

        /**
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("osArch")
        public String osArch;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("osHealthScore")
        public Integer osHealthScore;

        /**
         * <strong>example:</strong>
         * <p>alios</p>
         */
        @NameInMap("osName")
        public String osName;

        /**
         * <strong>example:</strong>
         * <p>172.21.172.7</p>
         */
        @NameInMap("privateIp")
        public String privateIp;

        /**
         * <strong>example:</strong>
         * <p>47.98.215.58</p>
         */
        @NameInMap("publicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>3b24a621-acb3-11ef-8c90-00163e1029af</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("resourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListAllInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllInstancesResponseBodyData self = new ListAllInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllInstancesResponseBodyData setAgentConfigId(String agentConfigId) {
            this.agentConfigId = agentConfigId;
            return this;
        }
        public String getAgentConfigId() {
            return this.agentConfigId;
        }

        public ListAllInstancesResponseBodyData setAgentConfigName(String agentConfigName) {
            this.agentConfigName = agentConfigName;
            return this;
        }
        public String getAgentConfigName() {
            return this.agentConfigName;
        }

        public ListAllInstancesResponseBodyData setAttributes(java.util.List<ListAllInstancesResponseBodyDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<ListAllInstancesResponseBodyDataAttributes> getAttributes() {
            return this.attributes;
        }

        public ListAllInstancesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListAllInstancesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListAllInstancesResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListAllInstancesResponseBodyData setInstallLevel(String installLevel) {
            this.installLevel = installLevel;
            return this;
        }
        public String getInstallLevel() {
            return this.installLevel;
        }

        public ListAllInstancesResponseBodyData setInstallType(String installType) {
            this.installType = installType;
            return this;
        }
        public String getInstallType() {
            return this.installType;
        }

        public ListAllInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAllInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAllInstancesResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAllInstancesResponseBodyData setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public ListAllInstancesResponseBodyData setManageLevel(String manageLevel) {
            this.manageLevel = manageLevel;
            return this;
        }
        public String getManageLevel() {
            return this.manageLevel;
        }

        public ListAllInstancesResponseBodyData setManageType(String manageType) {
            this.manageType = manageType;
            return this;
        }
        public String getManageType() {
            return this.manageType;
        }

        public ListAllInstancesResponseBodyData setOsArch(String osArch) {
            this.osArch = osArch;
            return this;
        }
        public String getOsArch() {
            return this.osArch;
        }

        public ListAllInstancesResponseBodyData setOsHealthScore(Integer osHealthScore) {
            this.osHealthScore = osHealthScore;
            return this;
        }
        public Integer getOsHealthScore() {
            return this.osHealthScore;
        }

        public ListAllInstancesResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public ListAllInstancesResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListAllInstancesResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListAllInstancesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAllInstancesResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListAllInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
