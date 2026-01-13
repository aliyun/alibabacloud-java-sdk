// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkConfigs")
    public java.util.List<UpdateRecallManagementConfigRequestNetworkConfigs> networkConfigs;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Password")
    public String password;

    public static UpdateRecallManagementConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementConfigRequest self = new UpdateRecallManagementConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRecallManagementConfigRequest setNetworkConfigs(java.util.List<UpdateRecallManagementConfigRequestNetworkConfigs> networkConfigs) {
        this.networkConfigs = networkConfigs;
        return this;
    }
    public java.util.List<UpdateRecallManagementConfigRequestNetworkConfigs> getNetworkConfigs() {
        return this.networkConfigs;
    }

    public UpdateRecallManagementConfigRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public static class UpdateRecallManagementConfigRequestNetworkConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VswitchIds")
        public java.util.Map<String, String> vswitchIds;

        public static UpdateRecallManagementConfigRequestNetworkConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementConfigRequestNetworkConfigs self = new UpdateRecallManagementConfigRequestNetworkConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementConfigRequestNetworkConfigs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateRecallManagementConfigRequestNetworkConfigs setVswitchIds(java.util.Map<String, String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.Map<String, String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
