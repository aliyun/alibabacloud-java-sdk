// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The maximum number of entries returned. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The cursor for pagination. Leave this parameter empty for the first request. When the returned value is empty, all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>O39nXKu5XafATl3/cJjSJw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the notification policy. Supports fuzzy matching.</p>
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

    public static ReadSchedulerxNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxNotificationPolicyRequest self = new ReadSchedulerxNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxNotificationPolicyRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ReadSchedulerxNotificationPolicyRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ReadSchedulerxNotificationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ReadSchedulerxNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
