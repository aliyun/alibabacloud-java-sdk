// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAlarmStatisticsRequest extends TeaModel {
    /**
     * <p>The data source for statistics on instance alarms, with a default value of aqs:</p>
     * <ul>
     * <li><em>sas</em>: Situation Awareness data source</li>
     * <li><em>aqs</em>: Alarm event data</li>
     * <li><em>honeypot</em>: Honeypot</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The UUID of the server to be queried.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> API to obtain this parameter.</p>
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

    public GetInstanceAlarmStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
