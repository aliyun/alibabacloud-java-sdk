// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckRiskStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of risk scenarios.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array consisting of the statistics on check items that are used in risk scenarios.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCheckRiskStatisticsResponseBodyData> data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckRiskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRiskStatisticsResponseBody self = new GetCheckRiskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckRiskStatisticsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetCheckRiskStatisticsResponseBody setData(java.util.List<GetCheckRiskStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCheckRiskStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public GetCheckRiskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckRiskStatisticsResponseBodyDataSubStatistics extends TeaModel {
        /**
         * <p>The name of the baseline type.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The number of high-risk items.</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The number of passed check items.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The total number of check items.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The baseline type.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static GetCheckRiskStatisticsResponseBodyDataSubStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRiskStatisticsResponseBodyDataSubStatistics self = new GetCheckRiskStatisticsResponseBodyDataSubStatistics();
            return TeaModel.build(map, self);
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class GetCheckRiskStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of high-risk items.</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The number of passed check items.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The name of the risk scenario.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The statistics on check items that are used in the risk scenario by baseline type.</p>
         */
        @NameInMap("SubStatistics")
        public java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> subStatistics;

        /**
         * <p>The total number of check items.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetCheckRiskStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRiskStatisticsResponseBodyData self = new GetCheckRiskStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCheckRiskStatisticsResponseBodyData setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetCheckRiskStatisticsResponseBodyData setSubStatistics(java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> subStatistics) {
            this.subStatistics = subStatistics;
            return this;
        }
        public java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> getSubStatistics() {
            return this.subStatistics;
        }

        public GetCheckRiskStatisticsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
