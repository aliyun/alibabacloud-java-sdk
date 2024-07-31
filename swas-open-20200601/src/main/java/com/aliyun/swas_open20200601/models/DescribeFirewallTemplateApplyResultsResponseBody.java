// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplateApplyResultsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("data")
    public java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyData> data;

    public static DescribeFirewallTemplateApplyResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplateApplyResultsResponseBody self = new DescribeFirewallTemplateApplyResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplateApplyResultsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFirewallTemplateApplyResultsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFirewallTemplateApplyResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallTemplateApplyResultsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeFirewallTemplateApplyResultsResponseBody setData(java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults extends TeaModel {
        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>33774babccc84003a2b1ad47e8001233</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of applying the firewall template to the simple application servers. Valid values:</p>
         * <ul>
         * <li>Running: The firewall template is being applied to the simple application servers.</li>
         * <li>Failed: The firewall template is applied to none of the simple application servers.</li>
         * <li>Success: The firewall template is applied to all the simple application servers.</li>
         * <li>PartFailed: The firewall template fails to be applied to some simple application servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults self = new DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeFirewallTemplateApplyResultsResponseBodyData extends TeaModel {
        /**
         * <p>The time when the firewall template was applied to the simple application servers.</p>
         * 
         * <strong>example:</strong>
         * <p>Tue May 14 11:53:07 CST 2024</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The total number of simple application servers to which the firewall template fails to apply.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public String failedCount;

        /**
         * <p>The ID of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>ft-bcf1a7hrdq717****</p>
         */
        @NameInMap("FirewallTemplateId")
        public String firewallTemplateId;

        /**
         * <p>The result of applying the firewall template to the simple application servers.</p>
         */
        @NameInMap("InstanceApplyResults")
        public java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults> instanceApplyResults;

        /**
         * <p>The status of applying the template to all simple application servers. Valid values:</p>
         * <ul>
         * <li>Running: The firewall template is being applied to simple application servers.</li>
         * <li>Failed: The firewall template is applied to none of simple application servers.</li>
         * <li>Success: The firewall template is applied to all simple application servers.</li>
         * <li>PartFailed: The firewall template fails to be applied to some simple application servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the execution to apply the template.</p>
         * 
         * <strong>example:</strong>
         * <p>aft-ikgt0bynitvs3****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribeFirewallTemplateApplyResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTemplateApplyResultsResponseBodyData self = new DescribeFirewallTemplateApplyResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setFirewallTemplateId(String firewallTemplateId) {
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }
        public String getFirewallTemplateId() {
            return this.firewallTemplateId;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setInstanceApplyResults(java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults> instanceApplyResults) {
            this.instanceApplyResults = instanceApplyResults;
            return this;
        }
        public java.util.List<DescribeFirewallTemplateApplyResultsResponseBodyDataInstanceApplyResults> getInstanceApplyResults() {
            return this.instanceApplyResults;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeFirewallTemplateApplyResultsResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
