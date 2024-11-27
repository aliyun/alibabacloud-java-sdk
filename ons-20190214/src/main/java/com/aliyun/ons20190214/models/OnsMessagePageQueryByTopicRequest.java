// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePageQueryByTopicRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the BeginTime parameter that you specified in the request when you created the specified query task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1570723200000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The number of the page to return. Pages start from page 1. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the EndTime parameter that you specified in the request when you created the specified query task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1570809600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the instance to which the message you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 5 to 50. Default value: 20. If you specify a valid value for the <strong>TaskId</strong> parameter in the request, this parameter does not take effect. The system uses the value of the PageSize parameter that you specified in the request for creating the query task.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the query task. The first time you call this operation to query the information about messages in a specified topic within a specified time range, this parameter is not required. This parameter is required in subsequent queries for messages on a specified page. You can obtain the task ID from the returned result of the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>0BC1310300002A9F000021E4D7A48346</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the topic whose messages you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq_topic</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessagePageQueryByTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePageQueryByTopicRequest self = new OnsMessagePageQueryByTopicRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessagePageQueryByTopicRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsMessagePageQueryByTopicRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public OnsMessagePageQueryByTopicRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsMessagePageQueryByTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessagePageQueryByTopicRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OnsMessagePageQueryByTopicRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OnsMessagePageQueryByTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
