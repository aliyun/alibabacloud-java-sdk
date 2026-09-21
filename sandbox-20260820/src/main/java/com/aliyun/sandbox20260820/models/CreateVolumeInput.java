// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateVolumeInput extends TeaModel {
    /**
     * <p>The AgenticBucket Volume configuration.</p>
     */
    @NameInMap("agenticBucketVolumeConfig")
    public AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    /**
     * <p>The AgenticFS Volume configuration.</p>
     */
    @NameInMap("agenticFSVolumeConfig")
    public CreateVolumeInputAgenticFSVolumeConfig agenticFSVolumeConfig;

    /**
     * <p>The JuiceFS Volume configuration.</p>
     */
    @NameInMap("juiceFSVolumeConfig")
    public JuiceFSVolumeConfig juiceFSVolumeConfig;

    /**
     * <p>The mount configuration.</p>
     */
    @NameInMap("mountConfig")
    public CreateVolumeInputMountConfig mountConfig;

    /**
     * <p>The OSS Volume configuration.</p>
     */
    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>37ddc466-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name, which must be unique within the team.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static CreateVolumeInput build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumeInput self = new CreateVolumeInput();
        return TeaModel.build(map, self);
    }

    public CreateVolumeInput setAgenticBucketVolumeConfig(AgenticBucketVolumeConfig agenticBucketVolumeConfig) {
        this.agenticBucketVolumeConfig = agenticBucketVolumeConfig;
        return this;
    }
    public AgenticBucketVolumeConfig getAgenticBucketVolumeConfig() {
        return this.agenticBucketVolumeConfig;
    }

    public CreateVolumeInput setAgenticFSVolumeConfig(CreateVolumeInputAgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public CreateVolumeInputAgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public CreateVolumeInput setJuiceFSVolumeConfig(JuiceFSVolumeConfig juiceFSVolumeConfig) {
        this.juiceFSVolumeConfig = juiceFSVolumeConfig;
        return this;
    }
    public JuiceFSVolumeConfig getJuiceFSVolumeConfig() {
        return this.juiceFSVolumeConfig;
    }

    public CreateVolumeInput setMountConfig(CreateVolumeInputMountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }
    public CreateVolumeInputMountConfig getMountConfig() {
        return this.mountConfig;
    }

    public CreateVolumeInput setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public CreateVolumeInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public CreateVolumeInput setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

    public static class CreateVolumeInputAgenticFSVolumeConfig extends TeaModel {
        /**
         * <p>The groupID of the local directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("groupID")
        public Integer groupID;

        /**
         * <p>The Access Point endpoint address.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx.xxxx-jnk89.cn-hangzhou.nas.aliyuncs.com:/</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        /**
         * <p>The userID of the local directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userID")
        public Integer userID;

        public static CreateVolumeInputAgenticFSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVolumeInputAgenticFSVolumeConfig self = new CreateVolumeInputAgenticFSVolumeConfig();
            return TeaModel.build(map, self);
        }

        public CreateVolumeInputAgenticFSVolumeConfig setGroupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }
        public Integer getGroupID() {
            return this.groupID;
        }

        public CreateVolumeInputAgenticFSVolumeConfig setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

        public CreateVolumeInputAgenticFSVolumeConfig setUserID(Integer userID) {
            this.userID = userID;
            return this;
        }
        public Integer getUserID() {
            return this.userID;
        }

    }

    public static class CreateVolumeInputMountConfigVpcConfig extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch IDs.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateVolumeInputMountConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVolumeInputMountConfigVpcConfig self = new CreateVolumeInputMountConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public CreateVolumeInputMountConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateVolumeInputMountConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateVolumeInputMountConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateVolumeInputMountConfig extends TeaModel {
        /**
         * <p>The permission role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1118555931230119:role/aliyunfcdefaultrole</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The VPC configuration.</p>
         */
        @NameInMap("vpcConfig")
        public CreateVolumeInputMountConfigVpcConfig vpcConfig;

        public static CreateVolumeInputMountConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVolumeInputMountConfig self = new CreateVolumeInputMountConfig();
            return TeaModel.build(map, self);
        }

        public CreateVolumeInputMountConfig setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateVolumeInputMountConfig setVpcConfig(CreateVolumeInputMountConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public CreateVolumeInputMountConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
