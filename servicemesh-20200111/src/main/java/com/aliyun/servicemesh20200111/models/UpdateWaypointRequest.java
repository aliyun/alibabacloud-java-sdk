// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateWaypointRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce3c25e247da24f3aab9b7edfae83****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable Horizontal Pod Autoscaling (HPA).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HPAEnabled")
    public Boolean HPAEnabled;

    /**
     * <p>The maximum number of waypoint proxy pods when HPA is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HPAMaxReplicas")
    public Integer HPAMaxReplicas;

    /**
     * <p>The minimum number of waypoint proxy pods when HPA is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HPAMinReplicas")
    public Integer HPAMinReplicas;

    /**
     * <p>The expected CPU utilization when HPA is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>91</p>
     */
    @NameInMap("HPATargetCPU")
    public Integer HPATargetCPU;

    /**
     * <p>The expected memory usage when HPA is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("HPATargetMemory")
    public Integer HPATargetMemory;

    /**
     * <p>The maximum number of CPU cores that are available to the waypoint proxy pods.</p>
     * 
     * <strong>example:</strong>
     * <p>2000m</p>
     */
    @NameInMap("LimitCPU")
    public String limitCPU;

    /**
     * <p>The maximum size of the memory that is available to the waypoint proxy pods.</p>
     * 
     * <strong>example:</strong>
     * <p>1024Mi</p>
     */
    @NameInMap("LimitMemory")
    public String limitMemory;

    /**
     * <p>Waypoint名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bookinfo-reviews</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Specifies whether to deploy waypoint proxy pods based on Elastic Container Instance (ECI).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PreferECI")
    public Boolean preferECI;

    /**
     * <p>The number of waypoint proxy pods.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The number of CPU cores requested by the waypoint proxy pods.</p>
     * 
     * <strong>example:</strong>
     * <p>100m</p>
     */
    @NameInMap("RequestCPU")
    public String requestCPU;

    /**
     * <p>The size of the memory requested by the waypoint proxy pods.</p>
     * 
     * <strong>example:</strong>
     * <p>128Mi</p>
     */
    @NameInMap("RequestMemory")
    public String requestMemory;

    /**
     * <p>The Service Mesh (ASM) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateWaypointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaypointRequest self = new UpdateWaypointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaypointRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateWaypointRequest setHPAEnabled(Boolean HPAEnabled) {
        this.HPAEnabled = HPAEnabled;
        return this;
    }
    public Boolean getHPAEnabled() {
        return this.HPAEnabled;
    }

    public UpdateWaypointRequest setHPAMaxReplicas(Integer HPAMaxReplicas) {
        this.HPAMaxReplicas = HPAMaxReplicas;
        return this;
    }
    public Integer getHPAMaxReplicas() {
        return this.HPAMaxReplicas;
    }

    public UpdateWaypointRequest setHPAMinReplicas(Integer HPAMinReplicas) {
        this.HPAMinReplicas = HPAMinReplicas;
        return this;
    }
    public Integer getHPAMinReplicas() {
        return this.HPAMinReplicas;
    }

    public UpdateWaypointRequest setHPATargetCPU(Integer HPATargetCPU) {
        this.HPATargetCPU = HPATargetCPU;
        return this;
    }
    public Integer getHPATargetCPU() {
        return this.HPATargetCPU;
    }

    public UpdateWaypointRequest setHPATargetMemory(Integer HPATargetMemory) {
        this.HPATargetMemory = HPATargetMemory;
        return this;
    }
    public Integer getHPATargetMemory() {
        return this.HPATargetMemory;
    }

    public UpdateWaypointRequest setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
        return this;
    }
    public String getLimitCPU() {
        return this.limitCPU;
    }

    public UpdateWaypointRequest setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
        return this;
    }
    public String getLimitMemory() {
        return this.limitMemory;
    }

    public UpdateWaypointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaypointRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateWaypointRequest setPreferECI(Boolean preferECI) {
        this.preferECI = preferECI;
        return this;
    }
    public Boolean getPreferECI() {
        return this.preferECI;
    }

    public UpdateWaypointRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public UpdateWaypointRequest setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public String getRequestCPU() {
        return this.requestCPU;
    }

    public UpdateWaypointRequest setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public String getRequestMemory() {
        return this.requestMemory;
    }

    public UpdateWaypointRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
