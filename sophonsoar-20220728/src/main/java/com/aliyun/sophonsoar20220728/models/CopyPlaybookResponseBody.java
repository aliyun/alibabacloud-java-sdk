// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CopyPlaybookResponseBody extends TeaModel {
    @NameInMap("Data")
    public CopyPlaybookResponseBodyData data;

    @NameInMap("Page")
    public CopyPlaybookResponseBodyPage page;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Integer active;

        /**
         * <strong>example:</strong>
         * <p>This is a action of processing for WAF</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailNum")
        public Integer failNum;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("FailRate")
        public Double failRate;

        /**
         * <strong>example:</strong>
         * <p>1655951601000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1638270967000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HistoryMd5")
        public Integer historyMd5;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;1\&quot;,\&quot;dataType\&quot;:\&quot;String\&quot;,\&quot;required\&quot;:false,\&quot;isArray\&quot;:false,\&quot;example\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;id\&quot;:0,\&quot;typeName\&quot;:\&quot;String\&quot;,\&quot;dataClass\&quot;:\&quot;normal\&quot;}]</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <strong>example:</strong>
         * <p>1725258397847</p>
         */
        @NameInMap("LastRuntime")
        public Long lastRuntime;

        /**
         * <strong>example:</strong>
         * <p>037046****1b00c4717963818ccbf2xx</p>
         */
        @NameInMap("LogicReleaseTaskflowMd5")
        public String logicReleaseTaskflowMd5;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("OutputParams")
        public String outputParams;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("OwnType")
        public String ownType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Permission")
        public Integer permission;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PlaybookStatus")
        public Integer playbookStatus;

        /**
         * <strong>example:</strong>
         * <p>9e38111e-9794-4784-9ca8-xxxxxxx</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccNum")
        public Integer succNum;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
