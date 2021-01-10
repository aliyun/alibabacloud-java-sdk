// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeMetricsOverviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionNum")
    public Long subscriptionNum;

    @NameInMap("BacklogNum")
    public Long backlogNum;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TopicNum")
    public Long topicNum;

    @NameInMap("DlqNum")
    public Long dlqNum;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("GroupNum")
    public Long groupNum;

    public static DescribeMetricsOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsOverviewResponseBody self = new DescribeMetricsOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricsOverviewResponseBody setSubscriptionNum(Long subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }
    public Long getSubscriptionNum() {
        return this.subscriptionNum;
    }

    public DescribeMetricsOverviewResponseBody setBacklogNum(Long backlogNum) {
        this.backlogNum = backlogNum;
        return this;
    }
    public Long getBacklogNum() {
        return this.backlogNum;
    }

    public DescribeMetricsOverviewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeMetricsOverviewResponseBody setTopicNum(Long topicNum) {
        this.topicNum = topicNum;
        return this;
    }
    public Long getTopicNum() {
        return this.topicNum;
    }

    public DescribeMetricsOverviewResponseBody setDlqNum(Long dlqNum) {
        this.dlqNum = dlqNum;
        return this;
    }
    public Long getDlqNum() {
        return this.dlqNum;
    }

    public DescribeMetricsOverviewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeMetricsOverviewResponseBody setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
        return this;
    }
    public Long getGroupNum() {
        return this.groupNum;
    }

}
