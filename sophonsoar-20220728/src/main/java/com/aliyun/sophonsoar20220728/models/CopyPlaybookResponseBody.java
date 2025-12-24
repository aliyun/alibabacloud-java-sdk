// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CopyPlaybookResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public CopyPlaybookResponseBodyData data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public CopyPlaybookResponseBodyPage page;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EC05B06-<strong><strong>-5F3E-</strong></strong>-3B1FAD76087A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyPlaybookResponseBody self = new CopyPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyPlaybookResponseBody setData(CopyPlaybookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CopyPlaybookResponseBodyData getData() {
        return this.data;
    }

    public CopyPlaybookResponseBody setPage(CopyPlaybookResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public CopyPlaybookResponseBodyPage getPage() {
        return this.page;
    }

    public CopyPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CopyPlaybookResponseBodyData extends TeaModel {
        /**
         * <p>The status of the playbook. Valid values:</p>
         * <ul>
         * <li>1: enabled.</li>
         * <li>0: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Integer active;

        /**
         * <p>The description of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a action of processing for WAF</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the new playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The number of playbook execution failures.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailNum")
        public Integer failNum;

        /**
         * <p>The failure rate of playbook execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("FailRate")
        public Double failRate;

        /**
         * <p>The time when the playbook was created. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1655951601000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the playbook was modified. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1638270967000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The number of historical versions of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HistoryMd5")
        public Integer historyMd5;

        /**
         * <p>The input parameters of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;1\&quot;,\&quot;dataType\&quot;:\&quot;String\&quot;,\&quot;required\&quot;:false,\&quot;isArray\&quot;:false,\&quot;example\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;id\&quot;:0,\&quot;typeName\&quot;:\&quot;String\&quot;,\&quot;dataClass\&quot;:\&quot;normal\&quot;}]</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1725258397847</p>
         */
        @NameInMap("LastRuntime")
        public Long lastRuntime;

        /**
         * <p>The online version MD5 of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>037046****1b00c4717963818ccbf2xx</p>
         */
        @NameInMap("LogicReleaseTaskflowMd5")
        public String logicReleaseTaskflowMd5;

        /**
         * <p>The output parameters of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("OutputParams")
        public String outputParams;

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <ul>
         * <li>preset: predefined playbook.</li>
         * <li>user: custom playbook.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("OwnType")
        public String ownType;

        /**
         * <p>The permission to operate the playbook. Valid values:</p>
         * <ul>
         * <li>1: view.</li>
         * <li>2: edit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Permission")
        public Integer permission;

        /**
         * <p>The status of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PlaybookStatus")
        public Integer playbookStatus;

        /**
         * <p>The UUID of the new playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>9e38111e-9794-4784-9ca8-xxxxxxx</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The number of successful playbook executions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccNum")
        public Integer succNum;

        /**
         * <p>The ID of the user to which the playbook belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****8718726</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static CopyPlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CopyPlaybookResponseBodyData self = new CopyPlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CopyPlaybookResponseBodyData setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public CopyPlaybookResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CopyPlaybookResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CopyPlaybookResponseBodyData setFailNum(Integer failNum) {
            this.failNum = failNum;
            return this;
        }
        public Integer getFailNum() {
            return this.failNum;
        }

        public CopyPlaybookResponseBodyData setFailRate(Double failRate) {
            this.failRate = failRate;
            return this;
        }
        public Double getFailRate() {
            return this.failRate;
        }

        public CopyPlaybookResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CopyPlaybookResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CopyPlaybookResponseBodyData setHistoryMd5(Integer historyMd5) {
            this.historyMd5 = historyMd5;
            return this;
        }
        public Integer getHistoryMd5() {
            return this.historyMd5;
        }

        public CopyPlaybookResponseBodyData setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public CopyPlaybookResponseBodyData setLastRuntime(Long lastRuntime) {
            this.lastRuntime = lastRuntime;
            return this;
        }
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        public CopyPlaybookResponseBodyData setLogicReleaseTaskflowMd5(String logicReleaseTaskflowMd5) {
            this.logicReleaseTaskflowMd5 = logicReleaseTaskflowMd5;
            return this;
        }
        public String getLogicReleaseTaskflowMd5() {
            return this.logicReleaseTaskflowMd5;
        }

        public CopyPlaybookResponseBodyData setOutputParams(String outputParams) {
            this.outputParams = outputParams;
            return this;
        }
        public String getOutputParams() {
            return this.outputParams;
        }

        public CopyPlaybookResponseBodyData setOwnType(String ownType) {
            this.ownType = ownType;
            return this;
        }
        public String getOwnType() {
            return this.ownType;
        }

        public CopyPlaybookResponseBodyData setPermission(Integer permission) {
            this.permission = permission;
            return this;
        }
        public Integer getPermission() {
            return this.permission;
        }

        public CopyPlaybookResponseBodyData setPlaybookStatus(Integer playbookStatus) {
            this.playbookStatus = playbookStatus;
            return this;
        }
        public Integer getPlaybookStatus() {
            return this.playbookStatus;
        }

        public CopyPlaybookResponseBodyData setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public CopyPlaybookResponseBodyData setSuccNum(Integer succNum) {
            this.succNum = succNum;
            return this;
        }
        public Integer getSuccNum() {
            return this.succNum;
        }

        public CopyPlaybookResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CopyPlaybookResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CopyPlaybookResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            CopyPlaybookResponseBodyPage self = new CopyPlaybookResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public CopyPlaybookResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public CopyPlaybookResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public CopyPlaybookResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
