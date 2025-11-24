// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyPilotEipResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eip-hp36jpqq5eged********</p>
     */
    @NameInMap("EipId")
    public String eipId;

    /**
     * <p>The type of the Istio Pilot with which you want to associate the EIPs. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Bind an EIP to the Istio Pilot during canary release (only valid during the canary release).</li>
     * <li><code>false</code>: Bind an EIP to the Istio Pilot in stable state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCanary")
    public Boolean isCanary;

    /**
     * <p>The type of the operation that you want to perform. Valid values:</p>
     * <ul>
     * <li><code>UnBindEip</code>: unbinds an elastic IP address (EIP) from the Istio Pilot.</li>
     * <li><code>BindEip</code>: binds an EIP to the Istio Pilot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BindEip</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <strong>example:</strong>
     * <p>c1f5a67154bec40629c2698ec********</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ModifyPilotEipResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPilotEipResourceRequest self = new ModifyPilotEipResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPilotEipResourceRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public ModifyPilotEipResourceRequest setIsCanary(Boolean isCanary) {
        this.isCanary = isCanary;
        return this;
    }
    public Boolean getIsCanary() {
        return this.isCanary;
    }

    public ModifyPilotEipResourceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ModifyPilotEipResourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
