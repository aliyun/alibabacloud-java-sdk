// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateSchedulerxNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The configuration for the effective time periods of notification channels.</p>
     * <blockquote>
     * <p> Please see the detailed explanation of this parameter below.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>The description of the notification policy.</p>
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

    public static CreateSchedulerxNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerxNotificationPolicyRequest self = new CreateSchedulerxNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerxNotificationPolicyRequest setChannelTimeRange(String channelTimeRange) {
        this.channelTimeRange = channelTimeRange;
        return this;
    }
    public String getChannelTimeRange() {
        return this.channelTimeRange;
    }

    public CreateSchedulerxNotificationPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchedulerxNotificationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateSchedulerxNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
