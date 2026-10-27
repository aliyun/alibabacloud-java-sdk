// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateCallCenterProviderRequest extends TeaModel {
    /**
     * <p>The callee number during the transfer. This parameter is required when the transfer method is Bridge.</p>
     * 
     * <strong>example:</strong>
     * <p>153*********</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The display name of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal service provider of Cloud Call Center</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The attached data.</p>
     * <blockquote>
     * <p>Notice: Format: k1=v1;k2=v2.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key1=value1</p>
     */
    @NameInMap("Extras")
    public String extras;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal service provider of Cloud Call Center</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The caller number during the transfer. This parameter is required when the transfer method is Bridge.</p>
     * 
     * <strong>example:</strong>
     * <p>010****</p>
     */
    @NameInMap("Originator")
    public String originator;

    /**
     * <p>The provider type.</p>
     * <blockquote>
     * <ul>
     * <li>CCC: Cloud Call Center.</li>
     * <li>CUSTOM: Customer-owned call center.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CCC</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The Refer address.<notice>This parameter is required when the transfer method is Refer.</notice></p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ReferTo")
    public String referTo;

    /**
     * <p>The trunk ID.</p>
     * <blockquote>
     * <p>Notice: This parameter is required when the transfer method is Bridge.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>trunk-xxx</p>
     */
    @NameInMap("TrunkId")
    public String trunkId;

    public static CreateCallCenterProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallCenterProviderRequest self = new CreateCallCenterProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallCenterProviderRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateCallCenterProviderRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateCallCenterProviderRequest setExtras(String extras) {
        this.extras = extras;
        return this;
    }
    public String getExtras() {
        return this.extras;
    }

    public CreateCallCenterProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCallCenterProviderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCallCenterProviderRequest setOriginator(String originator) {
        this.originator = originator;
        return this;
    }
    public String getOriginator() {
        return this.originator;
    }

    public CreateCallCenterProviderRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateCallCenterProviderRequest setReferTo(String referTo) {
        this.referTo = referTo;
        return this;
    }
    public String getReferTo() {
        return this.referTo;
    }

    public CreateCallCenterProviderRequest setTrunkId(String trunkId) {
        this.trunkId = trunkId;
        return this;
    }
    public String getTrunkId() {
        return this.trunkId;
    }

}
