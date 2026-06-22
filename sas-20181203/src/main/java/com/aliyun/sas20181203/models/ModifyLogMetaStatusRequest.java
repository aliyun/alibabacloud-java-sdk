// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusRequest extends TeaModel {
    /**
     * <p>The request source identifier. Set this parameter to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The name of the dedicated Logstore where logs are stored.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis-log-login</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The project name.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aegis-log</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the member account in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The status to which you want to change the log. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: enabled</li>
     * <li><strong>disabled</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyLogMetaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogMetaStatusRequest self = new ModifyLogMetaStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogMetaStatusRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyLogMetaStatusRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public ModifyLogMetaStatusRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyLogMetaStatusRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ModifyLogMetaStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
