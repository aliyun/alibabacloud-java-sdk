// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The name of the dedicated Logstore in which logs are stored.</p>
     * <br>
     * <p>>  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the names of Logstores.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The name of the project.</p>
     * <br>
     * <p>>  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the names of projects.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The status of the log analysis feature. Valid values:</p>
     * <br>
     * <p>*   **enabled**</p>
     * <p>*   **disabled**</p>
     * <br>
     * <p>This parameter is required.</p>
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
