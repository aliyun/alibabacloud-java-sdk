// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkConfigs")
    public java.util.List<CreateRecallManagementConfigRequestNetworkConfigs> networkConfigs;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>zhhangsan</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateRecallManagementConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementConfigRequest self = new CreateRecallManagementConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecallManagementConfigRequest setNetworkConfigs(java.util.List<CreateRecallManagementConfigRequestNetworkConfigs> networkConfigs) {
        this.networkConfigs = networkConfigs;
        return this;
    }
    public java.util.List<CreateRecallManagementConfigRequestNetworkConfigs> getNetworkConfigs() {
        return this.networkConfigs;
    }

    public CreateRecallManagementConfigRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRecallManagementConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class CreateRecallManagementConfigRequestNetworkConfigs extends TeaModel {
        @NameInMap("VSwitchIds")
        public java.util.Map<String, String> vSwitchIds;

        /**
         * <p>Vpc id</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateRecallManagementConfigRequestNetworkConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementConfigRequestNetworkConfigs self = new CreateRecallManagementConfigRequestNetworkConfigs();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementConfigRequestNetworkConfigs setVSwitchIds(java.util.Map<String, String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.Map<String, String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateRecallManagementConfigRequestNetworkConfigs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
