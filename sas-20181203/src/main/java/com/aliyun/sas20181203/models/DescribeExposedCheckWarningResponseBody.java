// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedCheckWarningResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the baseline risk items of the exposed server.</p>
     */
    @NameInMap("WarningList")
    public java.util.List<DescribeExposedCheckWarningResponseBodyWarningList> warningList;

    public static DescribeExposedCheckWarningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedCheckWarningResponseBody self = new DescribeExposedCheckWarningResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedCheckWarningResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeExposedCheckWarningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedCheckWarningResponseBody setWarningList(java.util.List<DescribeExposedCheckWarningResponseBodyWarningList> warningList) {
        this.warningList = warningList;
        return this;
    }
    public java.util.List<DescribeExposedCheckWarningResponseBodyWarningList> getWarningList() {
        return this.warningList;
    }

    public static class DescribeExposedCheckWarningResponseBodyWarningList extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         * <br>
         * <p>>  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of baselines.</p>
         */
        @NameInMap("RiskId")
        public Long riskId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        /**
         * <p>The display name of the baseline sub type.</p>
         */
        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        /**
         * <p>The display name of the baseline type.</p>
         */
        @NameInMap("TypeAlias")
        public String typeAlias;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedCheckWarningResponseBodyWarningList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedCheckWarningResponseBodyWarningList self = new DescribeExposedCheckWarningResponseBodyWarningList();
            return TeaModel.build(map, self);
        }

        public DescribeExposedCheckWarningResponseBodyWarningList setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        public DescribeExposedCheckWarningResponseBodyWarningList setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public DescribeExposedCheckWarningResponseBodyWarningList setSubTypeAlias(String subTypeAlias) {
            this.subTypeAlias = subTypeAlias;
            return this;
        }
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        public DescribeExposedCheckWarningResponseBodyWarningList setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

        public DescribeExposedCheckWarningResponseBodyWarningList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
