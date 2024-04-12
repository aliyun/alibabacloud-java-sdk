// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("ProtocolConfig")
    public SetPolicyProtocolConfigRequestProtocolConfig protocolConfig;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyProtocolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyProtocolConfigRequest self = new SetPolicyProtocolConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyProtocolConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyProtocolConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyProtocolConfigRequest setProtocolConfig(SetPolicyProtocolConfigRequestProtocolConfig protocolConfig) {
        this.protocolConfig = protocolConfig;
        return this;
    }
    public SetPolicyProtocolConfigRequestProtocolConfig getProtocolConfig() {
        return this.protocolConfig;
    }

    public SetPolicyProtocolConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyProtocolConfigRequestProtocolConfigRDP extends TeaModel {
        @NameInMap("ClipboardDownload")
        public String clipboardDownload;

        @NameInMap("ClipboardUpload")
        public String clipboardUpload;

        @NameInMap("DiskRedirection")
        public String diskRedirection;

        @NameInMap("RecordKeyboard")
        public String recordKeyboard;

        public static SetPolicyProtocolConfigRequestProtocolConfigRDP build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyProtocolConfigRequestProtocolConfigRDP self = new SetPolicyProtocolConfigRequestProtocolConfigRDP();
            return TeaModel.build(map, self);
        }

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setClipboardDownload(String clipboardDownload) {
            this.clipboardDownload = clipboardDownload;
            return this;
        }
        public String getClipboardDownload() {
            return this.clipboardDownload;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setClipboardUpload(String clipboardUpload) {
            this.clipboardUpload = clipboardUpload;
            return this;
        }
        public String getClipboardUpload() {
            return this.clipboardUpload;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setDiskRedirection(String diskRedirection) {
            this.diskRedirection = diskRedirection;
            return this;
        }
        public String getDiskRedirection() {
            return this.diskRedirection;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setRecordKeyboard(String recordKeyboard) {
            this.recordKeyboard = recordKeyboard;
            return this;
        }
        public String getRecordKeyboard() {
            return this.recordKeyboard;
        }

    }

    public static class SetPolicyProtocolConfigRequestProtocolConfigSSH extends TeaModel {
        @NameInMap("ExecCommand")
        public String execCommand;

        @NameInMap("SFTPChannel")
        public String SFTPChannel;

        @NameInMap("SFTPDownloadFile")
        public String SFTPDownloadFile;

        @NameInMap("SFTPMkdir")
        public String SFTPMkdir;

        @NameInMap("SFTPRemoveFile")
        public String SFTPRemoveFile;

        @NameInMap("SFTPRenameFile")
        public String SFTPRenameFile;

        @NameInMap("SFTPRmdir")
        public String SFTPRmdir;

        @NameInMap("SFTPUploadFile")
        public String SFTPUploadFile;

        @NameInMap("SSHChannel")
        public String SSHChannel;

        @NameInMap("X11Forwarding")
        public String x11Forwarding;

        public static SetPolicyProtocolConfigRequestProtocolConfigSSH build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyProtocolConfigRequestProtocolConfigSSH self = new SetPolicyProtocolConfigRequestProtocolConfigSSH();
            return TeaModel.build(map, self);
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setExecCommand(String execCommand) {
            this.execCommand = execCommand;
            return this;
        }
        public String getExecCommand() {
            return this.execCommand;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPChannel(String SFTPChannel) {
            this.SFTPChannel = SFTPChannel;
            return this;
        }
        public String getSFTPChannel() {
            return this.SFTPChannel;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPDownloadFile(String SFTPDownloadFile) {
            this.SFTPDownloadFile = SFTPDownloadFile;
            return this;
        }
        public String getSFTPDownloadFile() {
            return this.SFTPDownloadFile;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPMkdir(String SFTPMkdir) {
            this.SFTPMkdir = SFTPMkdir;
            return this;
        }
        public String getSFTPMkdir() {
            return this.SFTPMkdir;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPRemoveFile(String SFTPRemoveFile) {
            this.SFTPRemoveFile = SFTPRemoveFile;
            return this;
        }
        public String getSFTPRemoveFile() {
            return this.SFTPRemoveFile;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPRenameFile(String SFTPRenameFile) {
            this.SFTPRenameFile = SFTPRenameFile;
            return this;
        }
        public String getSFTPRenameFile() {
            return this.SFTPRenameFile;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPRmdir(String SFTPRmdir) {
            this.SFTPRmdir = SFTPRmdir;
            return this;
        }
        public String getSFTPRmdir() {
            return this.SFTPRmdir;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSFTPUploadFile(String SFTPUploadFile) {
            this.SFTPUploadFile = SFTPUploadFile;
            return this;
        }
        public String getSFTPUploadFile() {
            return this.SFTPUploadFile;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setSSHChannel(String SSHChannel) {
            this.SSHChannel = SSHChannel;
            return this;
        }
        public String getSSHChannel() {
            return this.SSHChannel;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setX11Forwarding(String x11Forwarding) {
            this.x11Forwarding = x11Forwarding;
            return this;
        }
        public String getX11Forwarding() {
            return this.x11Forwarding;
        }

    }

    public static class SetPolicyProtocolConfigRequestProtocolConfig extends TeaModel {
        @NameInMap("RDP")
        public SetPolicyProtocolConfigRequestProtocolConfigRDP RDP;

        @NameInMap("SSH")
        public SetPolicyProtocolConfigRequestProtocolConfigSSH SSH;

        public static SetPolicyProtocolConfigRequestProtocolConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyProtocolConfigRequestProtocolConfig self = new SetPolicyProtocolConfigRequestProtocolConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyProtocolConfigRequestProtocolConfig setRDP(SetPolicyProtocolConfigRequestProtocolConfigRDP RDP) {
            this.RDP = RDP;
            return this;
        }
        public SetPolicyProtocolConfigRequestProtocolConfigRDP getRDP() {
            return this.RDP;
        }

        public SetPolicyProtocolConfigRequestProtocolConfig setSSH(SetPolicyProtocolConfigRequestProtocolConfigSSH SSH) {
            this.SSH = SSH;
            return this;
        }
        public SetPolicyProtocolConfigRequestProtocolConfigSSH getSSH() {
            return this.SSH;
        }

    }

}
