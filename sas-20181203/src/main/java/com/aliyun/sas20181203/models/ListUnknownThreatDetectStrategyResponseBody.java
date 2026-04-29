// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectStrategyResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUnknownThreatDetectStrategyResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListUnknownThreatDetectStrategyResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>UNKNOWN_THREAT_DETECT_CONFIG_****</p>
         */
        @NameInMap("AssetSelectionType")
        public String assetSelectionType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DurationDaysAfterInit")
        public Integer durationDaysAfterInit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DurationDaysAfterStop")
        public Integer durationDaysAfterStop;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MachineCount")
        public Integer machineCount;

        /**
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
