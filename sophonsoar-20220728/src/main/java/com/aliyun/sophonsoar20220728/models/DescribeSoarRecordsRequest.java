// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsRequest extends TeaModel {
    /**
     * <p>The start time when the task was completed. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1755676363777</p>
     */
    @NameInMap("CompletedBeginTime")
    public Long completedBeginTime;

    /**
     * <p>The end time when the task was completed. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683526284584</p>
     */
    @NameInMap("CompletedEndTime")
    public Long completedEndTime;

    /**
     * <p>The end time of the task run. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683772744953</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 10 entries are returned on each page.</p>
     * <blockquote>
     * <p>Specify a value for PageSize.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>For more information, see <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8f55e76d-b5d5-4720-9cd7-xxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The input parameter of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("QueryValue")
    public String queryValue;

    /**
     * <p>The UUID of the playbook task execution.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2627455.html">DescribeSoarRecords</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6d412cfa-0905-4567-8a83-xxxxxx</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    /**
     * <p>The start time of the task run. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683526284584</p>
     */
    @NameInMap("StartMillis")
    public Long startMillis;

    /**
     * <p>The status of the task run. Valid values:</p>
     * <ul>
     * <li><p><strong>success</strong>: The task is successful.</p>
     * </li>
     * <li><p><strong>failed</strong>: The task failed.</p>
     * </li>
     * <li><p><strong>inprogress</strong>: The task is in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inprogress</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The MD5 value of the playbook configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>be0a4ef084dd174abe478df52xxxxx</p>
     */
    @NameInMap("TaskflowMd5")
    public String taskflowMd5;

    /**
     * <p>The trigger type of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>stream</strong>: stream</p>
     * </li>
     * <li><p><strong>debug</strong>: test</p>
     * </li>
     * <li><p><strong>manual</strong>: manual</p>
     * </li>
     * <li><p><strong>timer</strong>: scheduled</p>
     * </li>
     * <li><p><strong>SubInvoke</strong>: child flow</p>
     * </li>
     * <li><p><strong>siem</strong>: triggered by a SIEM product</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>debug</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The ID of the Alibaba Cloud account that runs the playbook task.</p>
     * 
     * <strong>example:</strong>
     * <p>127xxxx4392</p>
     */
    @NameInMap("TriggerUser")
    public String triggerUser;

    public static DescribeSoarRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordsRequest self = new DescribeSoarRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordsRequest setCompletedBeginTime(Long completedBeginTime) {
        this.completedBeginTime = completedBeginTime;
        return this;
    }
    public Long getCompletedBeginTime() {
        return this.completedBeginTime;
    }

    public DescribeSoarRecordsRequest setCompletedEndTime(Long completedEndTime) {
        this.completedEndTime = completedEndTime;
        return this;
    }
    public Long getCompletedEndTime() {
        return this.completedEndTime;
    }

    public DescribeSoarRecordsRequest setEndMillis(Long endMillis) {
        this.endMillis = endMillis;
        return this;
    }
    public Long getEndMillis() {
        return this.endMillis;
    }

    public DescribeSoarRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarRecordsRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DescribeSoarRecordsRequest setQueryValue(String queryValue) {
        this.queryValue = queryValue;
        return this;
    }
    public String getQueryValue() {
        return this.queryValue;
    }

    public DescribeSoarRecordsRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

    public DescribeSoarRecordsRequest setStartMillis(Long startMillis) {
        this.startMillis = startMillis;
        return this;
    }
    public Long getStartMillis() {
        return this.startMillis;
    }

    public DescribeSoarRecordsRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeSoarRecordsRequest setTaskflowMd5(String taskflowMd5) {
        this.taskflowMd5 = taskflowMd5;
        return this;
    }
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

    public DescribeSoarRecordsRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public DescribeSoarRecordsRequest setTriggerUser(String triggerUser) {
        this.triggerUser = triggerUser;
        return this;
    }
    public String getTriggerUser() {
        return this.triggerUser;
    }

}
