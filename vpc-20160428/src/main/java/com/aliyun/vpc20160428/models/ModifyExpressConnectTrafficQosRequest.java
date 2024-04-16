// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosRequest extends TeaModel {
    @NameInMap("AddInstanceList")
    public java.util.List<ModifyExpressConnectTrafficQosRequestAddInstanceList> addInstanceList;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QosDescription")
    public String qosDescription;

    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QosName")
    public String qosName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveInstanceList")
    public java.util.List<ModifyExpressConnectTrafficQosRequestRemoveInstanceList> removeInstanceList;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static ModifyExpressConnectTrafficQosRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosRequest self = new ModifyExpressConnectTrafficQosRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosRequest setAddInstanceList(java.util.List<ModifyExpressConnectTrafficQosRequestAddInstanceList> addInstanceList) {
        this.addInstanceList = addInstanceList;
        return this;
    }
    public java.util.List<ModifyExpressConnectTrafficQosRequestAddInstanceList> getAddInstanceList() {
        return this.addInstanceList;
    }

    public ModifyExpressConnectTrafficQosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectTrafficQosRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyExpressConnectTrafficQosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyExpressConnectTrafficQosRequest setQosDescription(String qosDescription) {
        this.qosDescription = qosDescription;
        return this;
    }
    public String getQosDescription() {
        return this.qosDescription;
    }

    public ModifyExpressConnectTrafficQosRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public ModifyExpressConnectTrafficQosRequest setQosName(String qosName) {
        this.qosName = qosName;
        return this;
    }
    public String getQosName() {
        return this.qosName;
    }

    public ModifyExpressConnectTrafficQosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExpressConnectTrafficQosRequest setRemoveInstanceList(java.util.List<ModifyExpressConnectTrafficQosRequestRemoveInstanceList> removeInstanceList) {
        this.removeInstanceList = removeInstanceList;
        return this;
    }
    public java.util.List<ModifyExpressConnectTrafficQosRequestRemoveInstanceList> getRemoveInstanceList() {
        return this.removeInstanceList;
    }

    public ModifyExpressConnectTrafficQosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static class ModifyExpressConnectTrafficQosRequestAddInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ModifyExpressConnectTrafficQosRequestAddInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ModifyExpressConnectTrafficQosRequestAddInstanceList self = new ModifyExpressConnectTrafficQosRequestAddInstanceList();
            return TeaModel.build(map, self);
        }

        public ModifyExpressConnectTrafficQosRequestAddInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyExpressConnectTrafficQosRequestAddInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class ModifyExpressConnectTrafficQosRequestRemoveInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ModifyExpressConnectTrafficQosRequestRemoveInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ModifyExpressConnectTrafficQosRequestRemoveInstanceList self = new ModifyExpressConnectTrafficQosRequestRemoveInstanceList();
            return TeaModel.build(map, self);
        }

        public ModifyExpressConnectTrafficQosRequestRemoveInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyExpressConnectTrafficQosRequestRemoveInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
