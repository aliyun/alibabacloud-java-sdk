// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the control policy.</p>
     */
    @NameInMap("Policy")
    public GetPolicyResponseBodyPolicy policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0D29F2C0-8B4B-5861-9474-F3F23D25594B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setPolicy(GetPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime extends TeaModel {
        /**
         * <p>The days of a week on which logons are allowed.</p>
         */
        @NameInMap("Days")
        public java.util.List<String> days;

        /**
         * <p>The time periods during which logons are allowed.</p>
         */
        @NameInMap("Hours")
        public java.util.List<String> hours;

        public static GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime self = new GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime setDays(java.util.List<String> days) {
            this.days = days;
            return this;
        }
        public java.util.List<String> getDays() {
            return this.days;
        }

        public GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime setHours(java.util.List<String> hours) {
            this.hours = hours;
            return this;
        }
        public java.util.List<String> getHours() {
            return this.hours;
        }

    }

    public static class GetPolicyResponseBodyPolicyAccessTimeRangeConfig extends TeaModel {
        /**
         * <p>The details of the periods during which logons are allowed.</p>
         */
        @NameInMap("EffectiveTime")
        public java.util.List<GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime> effectiveTime;

        public static GetPolicyResponseBodyPolicyAccessTimeRangeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyAccessTimeRangeConfig self = new GetPolicyResponseBodyPolicyAccessTimeRangeConfig();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyAccessTimeRangeConfig setEffectiveTime(java.util.List<GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime> effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public java.util.List<GetPolicyResponseBodyPolicyAccessTimeRangeConfigEffectiveTime> getEffectiveTime() {
            return this.effectiveTime;
        }

    }

    public static class GetPolicyResponseBodyPolicyApprovalConfig extends TeaModel {
        /**
         * <p>Indicates whether O\&amp;M approval is enabled in the control policy. Valid values:</p>
         * <ul>
         * <li><strong>On</strong>: O\&amp;M approval is enabled.</li>
         * <li><strong>Off</strong>: O\&amp;M approval is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Off</p>
         */
        @NameInMap("SwitchStatus")
        public String switchStatus;

        public static GetPolicyResponseBodyPolicyApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyApprovalConfig self = new GetPolicyResponseBodyPolicyApprovalConfig();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyApprovalConfig setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

    }

    public static class GetPolicyResponseBodyPolicyCommandConfigApproval extends TeaModel {
        /**
         * <p>An array of commands that can be run only after approval.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static GetPolicyResponseBodyPolicyCommandConfigApproval build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyCommandConfigApproval self = new GetPolicyResponseBodyPolicyCommandConfigApproval();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyCommandConfigApproval setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class GetPolicyResponseBodyPolicyCommandConfigDeny extends TeaModel {
        /**
         * <p>The type of command control. Valid values:</p>
         * <ul>
         * <li>white: whitelist mode.</li>
         * <li>black: blacklist mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>An array of controlled commands.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static GetPolicyResponseBodyPolicyCommandConfigDeny build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyCommandConfigDeny self = new GetPolicyResponseBodyPolicyCommandConfigDeny();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyCommandConfigDeny setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetPolicyResponseBodyPolicyCommandConfigDeny setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class GetPolicyResponseBodyPolicyCommandConfig extends TeaModel {
        /**
         * <p>The details of the command approval settings.</p>
         */
        @NameInMap("Approval")
        public GetPolicyResponseBodyPolicyCommandConfigApproval approval;

        /**
         * <p>The details of the command control setting.</p>
         */
        @NameInMap("Deny")
        public GetPolicyResponseBodyPolicyCommandConfigDeny deny;

        public static GetPolicyResponseBodyPolicyCommandConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyCommandConfig self = new GetPolicyResponseBodyPolicyCommandConfig();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyCommandConfig setApproval(GetPolicyResponseBodyPolicyCommandConfigApproval approval) {
            this.approval = approval;
            return this;
        }
        public GetPolicyResponseBodyPolicyCommandConfigApproval getApproval() {
            return this.approval;
        }

        public GetPolicyResponseBodyPolicyCommandConfig setDeny(GetPolicyResponseBodyPolicyCommandConfigDeny deny) {
            this.deny = deny;
            return this;
        }
        public GetPolicyResponseBodyPolicyCommandConfigDeny getDeny() {
            return this.deny;
        }

    }

    public static class GetPolicyResponseBodyPolicyIPAclConfig extends TeaModel {
        /**
         * <p>The mode of access control on source IP addresses. Valid values:</p>
         * <ul>
         * <li>white: whitelist mode.</li>
         * <li>black: blacklist mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The IP addresses from which logons are not allowed.</p>
         */
        @NameInMap("IPs")
        public java.util.List<String> IPs;

        public static GetPolicyResponseBodyPolicyIPAclConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyIPAclConfig self = new GetPolicyResponseBodyPolicyIPAclConfig();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyIPAclConfig setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetPolicyResponseBodyPolicyIPAclConfig setIPs(java.util.List<String> IPs) {
            this.IPs = IPs;
            return this;
        }
        public java.util.List<String> getIPs() {
            return this.IPs;
        }

    }

    public static class GetPolicyResponseBodyPolicyProtocolConfigRDP extends TeaModel {
        /**
         * <p>Indicates whether downloading from the clipboard is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardDownload")
        public String clipboardDownload;

        /**
         * <p>Indicates whether file uploading from the clipboard is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ClipboardUpload")
        public String clipboardUpload;

        /**
         * <p>Indicates whether driver mapping is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("DiskRedirection")
        public String diskRedirection;

        /**
         * <p>Indicates whether keyboard recording is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("RecordKeyboard")
        public String recordKeyboard;

        public static GetPolicyResponseBodyPolicyProtocolConfigRDP build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyProtocolConfigRDP self = new GetPolicyResponseBodyPolicyProtocolConfigRDP();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyProtocolConfigRDP setClipboardDownload(String clipboardDownload) {
            this.clipboardDownload = clipboardDownload;
            return this;
        }
        public String getClipboardDownload() {
            return this.clipboardDownload;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigRDP setClipboardUpload(String clipboardUpload) {
            this.clipboardUpload = clipboardUpload;
            return this;
        }
        public String getClipboardUpload() {
            return this.clipboardUpload;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigRDP setDiskRedirection(String diskRedirection) {
            this.diskRedirection = diskRedirection;
            return this;
        }
        public String getDiskRedirection() {
            return this.diskRedirection;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigRDP setRecordKeyboard(String recordKeyboard) {
            this.recordKeyboard = recordKeyboard;
            return this;
        }
        public String getRecordKeyboard() {
            return this.recordKeyboard;
        }

    }

    public static class GetPolicyResponseBodyPolicyProtocolConfigSSH extends TeaModel {
        /**
         * <p>Indicates whether remote command execution is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ExecCommand")
        public String execCommand;

        /**
         * <p>Indicates whether the SFTP channel option is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPChannel")
        public String SFTPChannel;

        /**
         * <p>Indicates whether file downloading is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPDownloadFile")
        public String SFTPDownloadFile;

        /**
         * <p>Indicates whether folder creation is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPMkdir")
        public String SFTPMkdir;

        /**
         * <p>Indicates whether file deletion is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRemoveFile")
        public String SFTPRemoveFile;

        /**
         * <p>Indicates whether file renaming is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRenameFile")
        public String SFTPRenameFile;

        /**
         * <p>Indicates whether folder deletion is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPRmdir")
        public String SFTPRmdir;

        /**
         * <p>Indicates whether file uploading is enabled in SFTP-based O\&amp;M. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SFTPUploadFile")
        public String SFTPUploadFile;

        /**
         * <p>Indicates whether the SSH channel option is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SSHChannel")
        public String SSHChannel;

        /**
         * <p>Indicates whether X11 forwarding is enabled. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("X11Forwarding")
        public String x11Forwarding;

        public static GetPolicyResponseBodyPolicyProtocolConfigSSH build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyProtocolConfigSSH self = new GetPolicyResponseBodyPolicyProtocolConfigSSH();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setExecCommand(String execCommand) {
            this.execCommand = execCommand;
            return this;
        }
        public String getExecCommand() {
            return this.execCommand;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPChannel(String SFTPChannel) {
            this.SFTPChannel = SFTPChannel;
            return this;
        }
        public String getSFTPChannel() {
            return this.SFTPChannel;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPDownloadFile(String SFTPDownloadFile) {
            this.SFTPDownloadFile = SFTPDownloadFile;
            return this;
        }
        public String getSFTPDownloadFile() {
            return this.SFTPDownloadFile;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPMkdir(String SFTPMkdir) {
            this.SFTPMkdir = SFTPMkdir;
            return this;
        }
        public String getSFTPMkdir() {
            return this.SFTPMkdir;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPRemoveFile(String SFTPRemoveFile) {
            this.SFTPRemoveFile = SFTPRemoveFile;
            return this;
        }
        public String getSFTPRemoveFile() {
            return this.SFTPRemoveFile;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPRenameFile(String SFTPRenameFile) {
            this.SFTPRenameFile = SFTPRenameFile;
            return this;
        }
        public String getSFTPRenameFile() {
            return this.SFTPRenameFile;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPRmdir(String SFTPRmdir) {
            this.SFTPRmdir = SFTPRmdir;
            return this;
        }
        public String getSFTPRmdir() {
            return this.SFTPRmdir;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSFTPUploadFile(String SFTPUploadFile) {
            this.SFTPUploadFile = SFTPUploadFile;
            return this;
        }
        public String getSFTPUploadFile() {
            return this.SFTPUploadFile;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setSSHChannel(String SSHChannel) {
            this.SSHChannel = SSHChannel;
            return this;
        }
        public String getSSHChannel() {
            return this.SSHChannel;
        }

        public GetPolicyResponseBodyPolicyProtocolConfigSSH setX11Forwarding(String x11Forwarding) {
            this.x11Forwarding = x11Forwarding;
            return this;
        }
        public String getX11Forwarding() {
            return this.x11Forwarding;
        }

    }

    public static class GetPolicyResponseBodyPolicyProtocolConfig extends TeaModel {
        /**
         * <p>The configuration details of Remote Desktop Protocol (RDP) options.</p>
         */
        @NameInMap("RDP")
        public GetPolicyResponseBodyPolicyProtocolConfigRDP RDP;

        /**
         * <p>The configuration details of SSH and SSH File Transfer Protocol (SFTP) options.</p>
         */
        @NameInMap("SSH")
        public GetPolicyResponseBodyPolicyProtocolConfigSSH SSH;

        public static GetPolicyResponseBodyPolicyProtocolConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicyProtocolConfig self = new GetPolicyResponseBodyPolicyProtocolConfig();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicyProtocolConfig setRDP(GetPolicyResponseBodyPolicyProtocolConfigRDP RDP) {
            this.RDP = RDP;
            return this;
        }
        public GetPolicyResponseBodyPolicyProtocolConfigRDP getRDP() {
            return this.RDP;
        }

        public GetPolicyResponseBodyPolicyProtocolConfig setSSH(GetPolicyResponseBodyPolicyProtocolConfigSSH SSH) {
            this.SSH = SSH;
            return this;
        }
        public GetPolicyResponseBodyPolicyProtocolConfigSSH getSSH() {
            return this.SSH;
        }

    }

    public static class GetPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The details of the logon period restrictions.</p>
         */
        @NameInMap("AccessTimeRangeConfig")
        public GetPolicyResponseBodyPolicyAccessTimeRangeConfig accessTimeRangeConfig;

        /**
         * <p>The O\&amp;M approval setting.</p>
         */
        @NameInMap("ApprovalConfig")
        public GetPolicyResponseBodyPolicyApprovalConfig approvalConfig;

        /**
         * <p>The details of the command policy.</p>
         */
        @NameInMap("CommandConfig")
        public GetPolicyResponseBodyPolicyCommandConfig commandConfig;

        /**
         * <p>The description of the control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The access control settings on source IP addresses.</p>
         */
        @NameInMap("IPAclConfig")
        public GetPolicyResponseBodyPolicyIPAclConfig IPAclConfig;

        /**
         * <p>The ID of the control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The priority of the control policy. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The details of protocol control.</p>
         */
        @NameInMap("ProtocolConfig")
        public GetPolicyResponseBodyPolicyProtocolConfig protocolConfig;

        public static GetPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicy self = new GetPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicy setAccessTimeRangeConfig(GetPolicyResponseBodyPolicyAccessTimeRangeConfig accessTimeRangeConfig) {
            this.accessTimeRangeConfig = accessTimeRangeConfig;
            return this;
        }
        public GetPolicyResponseBodyPolicyAccessTimeRangeConfig getAccessTimeRangeConfig() {
            return this.accessTimeRangeConfig;
        }

        public GetPolicyResponseBodyPolicy setApprovalConfig(GetPolicyResponseBodyPolicyApprovalConfig approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }
        public GetPolicyResponseBodyPolicyApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        public GetPolicyResponseBodyPolicy setCommandConfig(GetPolicyResponseBodyPolicyCommandConfig commandConfig) {
            this.commandConfig = commandConfig;
            return this;
        }
        public GetPolicyResponseBodyPolicyCommandConfig getCommandConfig() {
            return this.commandConfig;
        }

        public GetPolicyResponseBodyPolicy setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetPolicyResponseBodyPolicy setIPAclConfig(GetPolicyResponseBodyPolicyIPAclConfig IPAclConfig) {
            this.IPAclConfig = IPAclConfig;
            return this;
        }
        public GetPolicyResponseBodyPolicyIPAclConfig getIPAclConfig() {
            return this.IPAclConfig;
        }

        public GetPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponseBodyPolicy setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetPolicyResponseBodyPolicy setProtocolConfig(GetPolicyResponseBodyPolicyProtocolConfig protocolConfig) {
            this.protocolConfig = protocolConfig;
            return this;
        }
        public GetPolicyResponseBodyPolicyProtocolConfig getProtocolConfig() {
            return this.protocolConfig;
        }

    }

}
