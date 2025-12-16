// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The time range configuration for notification channels.</p>
     * <blockquote>
     * <p> See the supplementary description of ChannelTimeRange in the request parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;sendChannel&quot;: &quot;sms,webhook,mail,phone&quot;,
     *   &quot;timezone&quot;: &quot;UTC+08:00&quot;,
     *   &quot;webhookIsAtAll&quot;: &quot;false&quot;,
     *   &quot;timeRanges&quot;: {
     *     &quot;all&quot;: [
     *       {
     *         &quot;startTime&quot;: &quot;08:00&quot;,
     *         &quot;endTime&quot;: &quot;18:00&quot;,
     *         &quot;daysOfWeek&quot;: [1, 2, 3, 4, 5]
     *       }
     *     ]
     *   }
     * }</p>
     */
    @NameInMap("ChannelTimeRange")
    public String channelTimeRange;

    /**
     * <p>The notification policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>Monday-Friday only</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the notification policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-weekdays</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ManageSchedulerxNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxNotificationPolicyRequest self = new ManageSchedulerxNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxNotificationPolicyRequest setChannelTimeRange(String channelTimeRange) {
        this.channelTimeRange = channelTimeRange;
        return this;
    }
    public String getChannelTimeRange() {
        return this.channelTimeRange;
    }

    public ManageSchedulerxNotificationPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ManageSchedulerxNotificationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ManageSchedulerxNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
