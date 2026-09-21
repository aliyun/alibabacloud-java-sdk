// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAlarmStatisticsRequest extends TeaModel {
    /**
     * <p>The data source from which instance alert statistics are collected. Default value: aqs.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>sas</strong>: Threat Detection Service data source.</li>
     * <li><strong>aqs</strong>: alert event data.</li>
     * <li><strong>honeypot</strong>: cloud honeypot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The UUID of the server to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00fea5a1-9792-4373-ab1e-bb6536ba****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetInstanceAlarmStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAlarmStatisticsRequest self = new GetInstanceAlarmStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceAlarmStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetInstanceAlarmStatisticsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public GetInstanceAlarmStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
