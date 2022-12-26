// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckRiskStatisticsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetCheckRiskStatisticsResponseBodyData> data;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        @NameInMap("PassCount")
        public Integer passCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

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
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        @NameInMap("PassCount")
        public Integer passCount;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SubStatistics")
        public java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> subStatistics;

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
