// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryResponseBody extends TeaModel {
    @NameInMap("HistoricalParameters")
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterModificationHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryResponseBody self = new DescribeParameterModificationHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryResponseBody setHistoricalParameters(DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters) {
        this.historicalParameters = historicalParameters;
        return this;
    }
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters getHistoricalParameters() {
        return this.historicalParameters;
    }

    public DescribeParameterModificationHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter extends TeaModel {
        /**
         * <p>The time when the parameter was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The parameter value after modification.</p>
         */
        @NameInMap("NewParameterValue")
        public String newParameterValue;

        /**
         * <p>The parameter value before modification.</p>
         */
        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter self = new DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class DescribeParameterModificationHistoryResponseBodyHistoricalParameters extends TeaModel {
        @NameInMap("HistoricalParameter")
        public java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> historicalParameter;

        public static DescribeParameterModificationHistoryResponseBodyHistoricalParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoryResponseBodyHistoricalParameters self = new DescribeParameterModificationHistoryResponseBodyHistoricalParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParameters setHistoricalParameter(java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> historicalParameter) {
            this.historicalParameter = historicalParameter;
            return this;
        }
        public java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> getHistoricalParameter() {
            return this.historicalParameter;
        }

    }

}
