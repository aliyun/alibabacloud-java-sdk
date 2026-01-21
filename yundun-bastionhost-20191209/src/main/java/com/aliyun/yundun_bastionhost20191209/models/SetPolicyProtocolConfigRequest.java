// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigRequest extends TeaModel {
    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy that you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The protocol control settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtocolConfig")
    public SetPolicyProtocolConfigRequestProtocolConfig protocolConfig;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>Specifies whether to enable downloading from the clipboard. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardDownload")
        public String clipboardDownload;

        /**
         * <p>Specifies whether to enable uploading from the clipboard. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardUpload")
        public String clipboardUpload;

        /**
         * <p>Specifies whether to enable driver mapping. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirection")
        public String diskRedirection;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirectionDownload")
        public String diskRedirectionDownload;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirectionUpload")
        public String diskRedirectionUpload;

        /**
         * <p>Specifies whether to enable keyboard operation recording. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
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

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setDiskRedirectionDownload(String diskRedirectionDownload) {
            this.diskRedirectionDownload = diskRedirectionDownload;
            return this;
        }
        public String getDiskRedirectionDownload() {
            return this.diskRedirectionDownload;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigRDP setDiskRedirectionUpload(String diskRedirectionUpload) {
            this.diskRedirectionUpload = diskRedirectionUpload;
            return this;
        }
        public String getDiskRedirectionUpload() {
            return this.diskRedirectionUpload;
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
        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AllowDirectTcp")
        public String allowDirectTcp;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AllowTcpForwarding")
        public String allowTcpForwarding;

        /**
         * <p>Specifies whether to enable remote command execution. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ExecCommand")
        public String execCommand;

        /**
         * <p>Specifies whether to enable SFTP channels. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you do not specify this parameter, the default value Disable is used.</p>
         * </li>
         * <li><p>You must set at least one of the following parameters to Enable: SSHChannel and SFTPChannel.</p>
         * </li>
         * <li><p>If you select Enable Only SFTP Permission for a host account, do not set SSHChannel and SFTPChannel to Disable for the account. Otherwise, users of the bastion host cannot use the account to access the host.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPChannel")
        public String SFTPChannel;

        /**
         * <p>Specifies whether to enable file downloading during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPDownloadFile")
        public String SFTPDownloadFile;

        /**
         * <p>Specifies whether to enable folder creation during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPMkdir")
        public String SFTPMkdir;

        /**
         * <p>Specifies whether to enable file deletion during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRemoveFile")
        public String SFTPRemoveFile;

        /**
         * <p>Specifies whether to enable file renaming during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRenameFile")
        public String SFTPRenameFile;

        /**
         * <p>Specifies whether to enable folder deletion during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRmdir")
        public String SFTPRmdir;

        /**
         * <p>Specifies whether to enable file uploading during SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPUploadFile")
        public String SFTPUploadFile;

        /**
         * <p>Specifies whether to enable SSH channels. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you do not specify this parameter, the default value Disable is used.</p>
         * </li>
         * <li><p>You must set at least one of the following parameters to Enable: SSHChannel and SFTPChannel. If you set SSHChannel to Disable, SSH-based logon is disabled for the asset account. Proceed with caution.</p>
         * </li>
         * <li><p>If you select Enable Only SFTP Permission for a host account, do not set SSHChannel and SFTPChannel to Disable for the account. Otherwise, users of the bastion host cannot use the account to access the host.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SSHChannel")
        public String SSHChannel;

        /**
         * <p>Specifies whether to enable X11 forwarding. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value Disable is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("X11Forwarding")
        public String x11Forwarding;

        public static SetPolicyProtocolConfigRequestProtocolConfigSSH build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyProtocolConfigRequestProtocolConfigSSH self = new SetPolicyProtocolConfigRequestProtocolConfigSSH();
            return TeaModel.build(map, self);
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setAllowDirectTcp(String allowDirectTcp) {
            this.allowDirectTcp = allowDirectTcp;
            return this;
        }
        public String getAllowDirectTcp() {
            return this.allowDirectTcp;
        }

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setAllowTcpForwarding(String allowTcpForwarding) {
            this.allowTcpForwarding = allowTcpForwarding;
            return this;
        }
        public String getAllowTcpForwarding() {
            return this.allowTcpForwarding;
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
        /**
         * <p>The settings of the Remote Desktop Protocol (RDP) options.</p>
         */
        @NameInMap("RDP")
        public SetPolicyProtocolConfigRequestProtocolConfigRDP RDP;

        /**
         * <p>The settings of the SSH and SSH Fine Transfer Protocol (SFTP) options.</p>
         */
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
