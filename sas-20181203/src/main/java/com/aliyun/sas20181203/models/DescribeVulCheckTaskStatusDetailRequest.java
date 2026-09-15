// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The list of task IDs.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The list of vulnerability types for the one-click scan.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>5d55af3c-35f3-4d4d-8ccc-8c5443b0****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeVulCheckTaskStatusDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulCheckTaskStatusDetailRequest self = new DescribeVulCheckTaskStatusDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulCheckTaskStatusDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeVulCheckTaskStatusDetailRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public DescribeVulCheckTaskStatusDetailRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public DescribeVulCheckTaskStatusDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
