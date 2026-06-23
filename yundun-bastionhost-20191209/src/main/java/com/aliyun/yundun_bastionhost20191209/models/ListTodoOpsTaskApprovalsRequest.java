// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListTodoOpsTaskApprovalsRequest extends TeaModel {
    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-m413tuhlo03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task name or task remarks to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number of the page to return in a paging query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries per page in a paging query.<br>The maximum value of the PageSize parameter is 100. The default number of entries per page is 20. If PageSize is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task scheduling type used to filter results. Valid values:</p>
     * <ul>
     * <li><strong>FixTime</strong>: scheduled execution.</li>
     * <li><strong>CycleInterval</strong>: periodic execution.</li>
     * <li><strong>Manual</strong>: manually triggered by a user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    public static ListTodoOpsTaskApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTodoOpsTaskApprovalsRequest self = new ListTodoOpsTaskApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListTodoOpsTaskApprovalsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTodoOpsTaskApprovalsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTodoOpsTaskApprovalsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListTodoOpsTaskApprovalsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListTodoOpsTaskApprovalsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTodoOpsTaskApprovalsRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

}
