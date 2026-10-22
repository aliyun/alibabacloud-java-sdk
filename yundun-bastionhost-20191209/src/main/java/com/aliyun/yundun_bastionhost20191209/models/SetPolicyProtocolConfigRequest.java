// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigRequest extends TeaModel {
    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy to modify.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The protocol control configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtocolConfig")
    public SetPolicyProtocolConfigRequestProtocolConfig protocolConfig;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

    public SetPolicyProtocolConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
         * <p>The clipboard download configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardDownload")
        public String clipboardDownload;

        /**
         * <p>The clipboard upload configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardUpload")
        public String clipboardUpload;

        /**
         * <p>The drive/printer mapping configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirection")
        public String diskRedirection;

        /**
         * <p>Specifies whether to allow disk download.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirectionDownload")
        public String diskRedirectionDownload;

        /**
         * <p>Specifies whether to allow disk upload.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirectionUpload")
        public String diskRedirectionUpload;

        /**
         * <p>The keyboard recording configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to allow direct TCP connection.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AllowDirectTcp")
        public String allowDirectTcp;

        /**
         * <p>Specifies whether to allow TCP forwarding.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AllowTcpForwarding")
        public String allowTcpForwarding;

        /**
         * <p>The remote command execution configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ExecCommand")
        public String execCommand;

        /**
         * <p>The SFTP channel configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is Disable.</li>
         * <li>At least one of the SSH channel and SFTP channel must be set to Enable.</li>
         * <li>If you enable the SFTP-only permission for a host account, do not disable both the SSH channel and SFTP channel for that account in the control policy. Otherwise, you cannot use the host account to access the target server through the bastion host.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPChannel")
        public String SFTPChannel;

        /**
         * <p>The SFTP file download configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPDownloadFile")
        public String SFTPDownloadFile;

        /**
         * <p>The SFTP folder creation configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPMkdir")
        public String SFTPMkdir;

        /**
         * <p>The SFTP file deletion configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRemoveFile")
        public String SFTPRemoveFile;

        /**
         * <p>The SFTP file rename configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRenameFile")
        public String SFTPRenameFile;

        /**
         * <p>The SFTP folder deletion configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRmdir")
        public String SFTPRmdir;

        /**
         * <p>The SFTP file upload configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPUploadFile")
        public String SFTPUploadFile;

        /**
         * <p>The SSH channel configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is Disable.</li>
         * <li>At least one of the SSH channel and SFTP channel must be set to Enable. If the SSH channel is set to Disable, you cannot log on to asset accounts by using SSH permissions. Proceed with caution.</li>
         * <li>If you enable the SFTP-only permission for a host account, do not disable both the SSH channel and SFTP channel for that account in the control policy. Otherwise, you cannot use the host account to access the target server through the bastion host.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SSHChannel")
        public String SSHChannel;

        /**
         * <p>Specifies whether to allow TCP forwarding.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("TcpForwarding")
        public String tcpForwarding;

        /**
         * <p>The X11 forwarding configuration. Valid values:</p>
         * <ul>
         * <li>Enable: Enabled.</li>
         * <li>Disable: Disabled.<blockquote>
         * <p>If this parameter is not specified, the default value is Disable.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The RDP option configuration details.</p>
         */
        @NameInMap("RDP")
        public SetPolicyProtocolConfigRequestProtocolConfigRDP RDP;

        /**
         * <p>The SSH and SFTP option configuration details.</p>
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
