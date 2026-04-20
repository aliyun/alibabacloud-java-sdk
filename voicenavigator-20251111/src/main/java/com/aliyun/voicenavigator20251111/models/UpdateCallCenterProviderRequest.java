// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateCallCenterProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>153*********</p>
     */
    @NameInMap("Destination")
    public String destination;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>key1=value1</p>
     */
    @NameInMap("Extras")
    public String extras;

    /**
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>010****</p>
     */
    @NameInMap("Originator")
    public String originator;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    /**
     * <strong>example:</strong>
     * <p>CCC</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ReferTo")
    public String referTo;

    /**
     * <strong>example:</strong>
     * <p>trunk-xxx</p>
     */
    @NameInMap("TrunkId")
    public String trunkId;

    public static UpdateCallCenterProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallCenterProviderRequest self = new UpdateCallCenterProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCallCenterProviderRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public UpdateCallCenterProviderRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateCallCenterProviderRequest setExtras(String extras) {
        this.extras = extras;
        return this;
    }
    public String getExtras() {
        return this.extras;
    }

    public UpdateCallCenterProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCallCenterProviderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCallCenterProviderRequest setOriginator(String originator) {
        this.originator = originator;
        return this;
    }
    public String getOriginator() {
        return this.originator;
    }

    public UpdateCallCenterProviderRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public UpdateCallCenterProviderRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public UpdateCallCenterProviderRequest setReferTo(String referTo) {
        this.referTo = referTo;
        return this;
    }
    public String getReferTo() {
        return this.referTo;
    }

    public UpdateCallCenterProviderRequest setTrunkId(String trunkId) {
        this.trunkId = trunkId;
        return this;
    }
    public String getTrunkId() {
        return this.trunkId;
    }

}
