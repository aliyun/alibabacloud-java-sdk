// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosRequest extends TeaModel {
    /**
     * <p>The instances to be added. Ignore this parameter if no instances are to be added.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AddInstanceList")
    public java.util.List<ModifyExpressConnectTrafficQosRequestAddInstanceList> addInstanceList;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-test</p>
     */
    @NameInMap("QosDescription")
    public String qosDescription;

    /**
     * <p>The ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The name of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-test</p>
     */
    @NameInMap("QosName")
    public String qosName;

    /**
     * <p>The region ID of the resource.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instances to be removed. Ignore this parameter if no instances are to be removed.</p>
     */
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
        /**
         * <p>The ID of the instance to be associated.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp159zj8zujwy3p07****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of instance to be associated. Set the value to <strong>PHYSICALCONNECTION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
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
        /**
         * <p>The ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1j37am632492qzw****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the associated instance. Set the value to <strong>PHYSICALCONNECTION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
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
