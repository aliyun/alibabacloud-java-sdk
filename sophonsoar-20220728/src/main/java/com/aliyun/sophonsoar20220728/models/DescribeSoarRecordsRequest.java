// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683772744953</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you do not specify the PageSize parameter, 10 entries are returned by default.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The playbook UUID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f55e76d-b5d5-4720-9cd7-xxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The beginning of the time range to query. The value is a 13-byte timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683526284584</p>
     */
    @NameInMap("StartMillis")
    public Long startMillis;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>failed</strong></li>
     * <li><strong>inprogress</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inprogress</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The MD5 value of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>be0a4ef084dd174abe478df52xxxxx</p>
     */
    @NameInMap("TaskflowMd5")
    public String taskflowMd5;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to execute the task.</p>
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

    public DescribeSoarRecordsRequest setTriggerUser(String triggerUser) {
        this.triggerUser = triggerUser;
        return this;
    }
    public String getTriggerUser() {
        return this.triggerUser;
    }

}
