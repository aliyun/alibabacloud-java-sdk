// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectStrategyResponseBody extends TeaModel {
    /**
     * <p>An array of strategies.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListUnknownThreatDetectStrategyResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListUnknownThreatDetectStrategyResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>898F7AA7-CECD-5EC7-AF4D-664C601B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUnknownThreatDetectStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectStrategyResponseBody self = new ListUnknownThreatDetectStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectStrategyResponseBody setData(java.util.List<ListUnknownThreatDetectStrategyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUnknownThreatDetectStrategyResponseBodyData> getData() {
        return this.data;
    }

    public ListUnknownThreatDetectStrategyResponseBody setPageInfo(ListUnknownThreatDetectStrategyResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListUnknownThreatDetectStrategyResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListUnknownThreatDetectStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnknownThreatDetectStrategyResponseBodyData extends TeaModel {
        /**
         * <p>The asset selection identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_THREAT_DETECT_CONFIG_****</p>
         */
        @NameInMap("AssetSelectionType")
        public String assetSelectionType;

        /**
         * <p>The duration, in days, of the learning phase after model creation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DurationDaysAfterInit")
        public Integer durationDaysAfterInit;

        /**
         * <p>The number of consecutive days without new process detections before the learning phase automatically ends.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DurationDaysAfterStop")
        public Integer durationDaysAfterStop;

        /**
         * <p>The strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MachineCount")
        public Integer machineCount;

        /**
         * <p>The strategy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The whitelist mode. Valid values:</p>
         * <ul>
         * <li><p><strong>hash</strong>: process hash</p>
         * </li>
         * <li><p><strong>path</strong>: process path</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("StudyMode")
        public String studyMode;

        public static ListUnknownThreatDetectStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectStrategyResponseBodyData self = new ListUnknownThreatDetectStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setAssetSelectionType(String assetSelectionType) {
            this.assetSelectionType = assetSelectionType;
            return this;
        }
        public String getAssetSelectionType() {
            return this.assetSelectionType;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setDurationDaysAfterInit(Integer durationDaysAfterInit) {
            this.durationDaysAfterInit = durationDaysAfterInit;
            return this;
        }
        public Integer getDurationDaysAfterInit() {
            return this.durationDaysAfterInit;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setDurationDaysAfterStop(Integer durationDaysAfterStop) {
            this.durationDaysAfterStop = durationDaysAfterStop;
            return this;
        }
        public Integer getDurationDaysAfterStop() {
            return this.durationDaysAfterStop;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUnknownThreatDetectStrategyResponseBodyData setStudyMode(String studyMode) {
            this.studyMode = studyMode;
            return this;
        }
        public String getStudyMode() {
            return this.studyMode;
        }

    }

    public static class ListUnknownThreatDetectStrategyResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of matching entries.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnknownThreatDetectStrategyResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectStrategyResponseBodyPageInfo self = new ListUnknownThreatDetectStrategyResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectStrategyResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListUnknownThreatDetectStrategyResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListUnknownThreatDetectStrategyResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnknownThreatDetectStrategyResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
