// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsRequest extends TeaModel {
    @NameInMap("CompletedBeginTime")
    public Long completedBeginTime;

    @NameInMap("CompletedEndTime")
    public Long completedEndTime;

    /**
     * <p>The end time of the task execution, in 13-digit timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1683772744953</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>Set the language type for requests and received messages. The default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Set which page to start displaying the query results from. The default value is 1, indicating the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Specify the maximum number of data entries per page when performing a paginated query. The default number of entries per page is 20. If the PageSize parameter is empty, it will return 10 entries by default.</p>
     * <blockquote>
     * <p>It is recommended not to leave the PageSize value empty.</p>
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
     * <p>You can obtain this parameter by calling the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8f55e76d-b5d5-4720-9cd7-xxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("QueryValue")
    public String queryValue;

    /**
     * <p>UUID of the playbook task execution.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627455.html">DescribeSoarRecords</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6d412cfa-0905-4567-8a83-xxxxxx</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    /**
     * <p>The start time of the task execution, in 13-digit timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1683526284584</p>
     */
    @NameInMap("StartMillis")
    public Long startMillis;

    /**
     * <p>The status of the task execution. Values:</p>
     * <ul>
     * <li><strong>success</strong>: Successful task.</li>
     * <li><strong>failed</strong>: Failed task.</li>
     * <li><strong>inprogress</strong>: Task in progress</li>
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

    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The Alibaba Cloud account ID that executed the playbook task.</p>
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
