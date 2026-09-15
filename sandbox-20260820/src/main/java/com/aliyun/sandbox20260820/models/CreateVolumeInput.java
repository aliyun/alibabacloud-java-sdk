// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateVolumeInput extends TeaModel {
    @NameInMap("agenticBucketVolumeConfig")
    public AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @NameInMap("agenticFSVolumeConfig")
    public CreateVolumeInputAgenticFSVolumeConfig agenticFSVolumeConfig;

    @NameInMap("juiceFSVolumeConfig")
    public JuiceFSVolumeConfig juiceFSVolumeConfig;

    @NameInMap("mountConfig")
    public CreateVolumeInputMountConfig mountConfig;

    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    @NameInMap("teamID")
    public String teamID;

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
        @NameInMap("groupID")
        public Integer groupID;

        @NameInMap("serverAddr")
        public String serverAddr;

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
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

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
        @NameInMap("role")
        public String role;

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
