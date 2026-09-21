// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateVolumeInput extends TeaModel {
    @NameInMap("agenticBucketVolumeConfig")
    public AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @NameInMap("agenticFSVolumeConfig")
    public UpdateVolumeInputAgenticFSVolumeConfig agenticFSVolumeConfig;

    @NameInMap("juiceFSVolumeConfig")
    public JuiceFSVolumeConfig juiceFSVolumeConfig;

    @NameInMap("mountConfig")
    public UpdateVolumeInputMountConfig mountConfig;

    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    public static UpdateVolumeInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeInput self = new UpdateVolumeInput();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeInput setAgenticBucketVolumeConfig(AgenticBucketVolumeConfig agenticBucketVolumeConfig) {
        this.agenticBucketVolumeConfig = agenticBucketVolumeConfig;
        return this;
    }
    public AgenticBucketVolumeConfig getAgenticBucketVolumeConfig() {
        return this.agenticBucketVolumeConfig;
    }

    public UpdateVolumeInput setAgenticFSVolumeConfig(UpdateVolumeInputAgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public UpdateVolumeInputAgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public UpdateVolumeInput setJuiceFSVolumeConfig(JuiceFSVolumeConfig juiceFSVolumeConfig) {
        this.juiceFSVolumeConfig = juiceFSVolumeConfig;
        return this;
    }
    public JuiceFSVolumeConfig getJuiceFSVolumeConfig() {
        return this.juiceFSVolumeConfig;
    }

    public UpdateVolumeInput setMountConfig(UpdateVolumeInputMountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }
    public UpdateVolumeInputMountConfig getMountConfig() {
        return this.mountConfig;
    }

    public UpdateVolumeInput setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public static class UpdateVolumeInputAgenticFSVolumeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("groupID")
        public Integer groupID;

        /**
         * <strong>example:</strong>
         * <p>ap-xxx.xxx-jnk89.cn-hangzhou.nas.aliyuncs.com:/</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userID")
        public Integer userID;

        public static UpdateVolumeInputAgenticFSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateVolumeInputAgenticFSVolumeConfig self = new UpdateVolumeInputAgenticFSVolumeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateVolumeInputAgenticFSVolumeConfig setGroupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }
        public Integer getGroupID() {
            return this.groupID;
        }

        public UpdateVolumeInputAgenticFSVolumeConfig setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

        public UpdateVolumeInputAgenticFSVolumeConfig setUserID(Integer userID) {
            this.userID = userID;
            return this;
        }
        public Integer getUserID() {
            return this.userID;
        }

    }

    public static class UpdateVolumeInputMountConfigVpcConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateVolumeInputMountConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateVolumeInputMountConfigVpcConfig self = new UpdateVolumeInputMountConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public UpdateVolumeInputMountConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateVolumeInputMountConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateVolumeInputMountConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateVolumeInputMountConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:ram::1338904783509062:role/aliyunfcdefaultrole</p>
         */
        @NameInMap("role")
        public String role;

        @NameInMap("vpcConfig")
        public UpdateVolumeInputMountConfigVpcConfig vpcConfig;

        public static UpdateVolumeInputMountConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateVolumeInputMountConfig self = new UpdateVolumeInputMountConfig();
            return TeaModel.build(map, self);
        }

        public UpdateVolumeInputMountConfig setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateVolumeInputMountConfig setVpcConfig(UpdateVolumeInputMountConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public UpdateVolumeInputMountConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
