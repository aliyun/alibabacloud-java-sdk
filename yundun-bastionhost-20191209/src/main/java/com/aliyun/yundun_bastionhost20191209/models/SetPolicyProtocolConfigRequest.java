// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
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
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to obtain the policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The protocol control configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtocolConfig")
    public SetPolicyProtocolConfigRequestProtocolConfig protocolConfig;

    /**
     * <p>The ID of the region where the Bastionhost instance resides.</p>
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
         * <p>Specifies whether to allow clipboard content to be downloaded. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardDownload")
        public String clipboardDownload;

        /**
         * <p>Specifies whether to allow clipboard content to be uploaded. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardUpload")
        public String clipboardUpload;

        /**
         * <p>Specifies whether to enable drive and printer mapping. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
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
         * <p>Specifies whether to record keyboard input. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
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
         * <p>Specifies whether to allow remote command execution. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ExecCommand")
        public String execCommand;

        /**
         * <p>Specifies whether to enable the SFTP channel. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>The default value is Disable.</p>
         * </li>
         * <li><p>At least one of the SSH channel and the SFTP channel must be enabled.</p>
         * </li>
         * <li><p>If you grant only SFTP permissions to a host account, do not disable the SSH and SFTP channels for that account in the control policy. Otherwise, you cannot use the host account to access the target server through Bastionhost.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPChannel")
        public String SFTPChannel;

        /**
         * <p>Specifies whether to allow file downloads over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPDownloadFile")
        public String SFTPDownloadFile;

        /**
         * <p>Specifies whether to allow folder creation over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPMkdir")
        public String SFTPMkdir;

        /**
         * <p>Specifies whether to allow file deletions over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRemoveFile")
        public String SFTPRemoveFile;

        /**
         * <p>Specifies whether to allow file renames over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRenameFile")
        public String SFTPRenameFile;

        /**
         * <p>Specifies whether to allow folder deletion over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRmdir")
        public String SFTPRmdir;

        /**
         * <p>Specifies whether to allow file uploads over SFTP. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPUploadFile")
        public String SFTPUploadFile;

        /**
         * <p>Specifies whether to enable the SSH channel. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>The default value is Disable.</p>
         * </li>
         * <li><p>At least one of the SSH channel and the SFTP channel must be enabled. If you disable the SSH channel, you cannot use SSH permissions to log on to the asset account. Configure this parameter with caution.</p>
         * </li>
         * <li><p>If you grant only SFTP permissions to a host account, do not disable the SSH and SFTP channels for that account in the control policy. Otherwise, you cannot use the host account to access the target server through Bastionhost.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SSHChannel")
        public String SSHChannel;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("TcpForwarding")
        public String tcpForwarding;

        /**
         * <p>Specifies whether to enable X11 forwarding. Valid values:</p>
         * <ul>
         * <li><p>Enable</p>
         * </li>
         * <li><p>Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is Disable.</p>
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

        public SetPolicyProtocolConfigRequestProtocolConfigSSH setTcpForwarding(String tcpForwarding) {
            this.tcpForwarding = tcpForwarding;
            return this;
        }
        public String getTcpForwarding() {
            return this.tcpForwarding;
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
         * <p>The RDP options.</p>
         */
        @NameInMap("RDP")
        public SetPolicyProtocolConfigRequestProtocolConfigRDP RDP;

        /**
         * <p>The SSH and SFTP options.</p>
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
