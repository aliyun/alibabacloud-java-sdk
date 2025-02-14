// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAuthSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServerlessAuthSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServerlessAuthSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAuthSummaryResponseBody self = new GetServerlessAuthSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServerlessAuthSummaryResponseBody setData(GetServerlessAuthSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServerlessAuthSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetServerlessAuthSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServerlessAuthSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServerlessAuthSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoBind")
        public Integer autoBind;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HasPreBindSetting")
        public Boolean hasPreBindSetting;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPostPaid")
        public Boolean isPostPaid;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsServerlessPostPaidValid")
        public Boolean isServerlessPostPaidValid;

        /**
         * <strong>example:</strong>
         * <p>SERVERLESS</p>
         */
        @NameInMap("PostPaidModuleSwitch")
        public String postPaidModuleSwitch;

        /**
         * <strong>example:</strong>
         * <p>1655432638000</p>
         */
        @NameInMap("PostPaidOpenTime")
        public Long postPaidOpenTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostPaidStatus")
        public Integer postPaidStatus;

        /**
         * <strong>example:</strong>
         * <p>sas-postpay-**</p>
         */
        @NameInMap("PostpaidInstanceId")
        public String postpaidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalBindAppCount")
        public Integer totalBindAppCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalBindCoreCount")
        public Integer totalBindCoreCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalBindInstanceCount")
        public Integer totalBindInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUnBindAppCount")
        public Integer totalUnBindAppCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUnBindCoreCount")
        public Integer totalUnBindCoreCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalUnBindInstanceCount")
        public Integer totalUnBindInstanceCount;

        public static GetServerlessAuthSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServerlessAuthSummaryResponseBodyData self = new GetServerlessAuthSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServerlessAuthSummaryResponseBodyData setAutoBind(Integer autoBind) {
            this.autoBind = autoBind;
            return this;
        }
        public Integer getAutoBind() {
            return this.autoBind;
        }

        public GetServerlessAuthSummaryResponseBodyData setHasPreBindSetting(Boolean hasPreBindSetting) {
            this.hasPreBindSetting = hasPreBindSetting;
            return this;
        }
        public Boolean getHasPreBindSetting() {
            return this.hasPreBindSetting;
        }

        public GetServerlessAuthSummaryResponseBodyData setIsPostPaid(Boolean isPostPaid) {
            this.isPostPaid = isPostPaid;
            return this;
        }
        public Boolean getIsPostPaid() {
            return this.isPostPaid;
        }

        public GetServerlessAuthSummaryResponseBodyData setIsServerlessPostPaidValid(Boolean isServerlessPostPaidValid) {
            this.isServerlessPostPaidValid = isServerlessPostPaidValid;
            return this;
        }
        public Boolean getIsServerlessPostPaidValid() {
            return this.isServerlessPostPaidValid;
        }

        public GetServerlessAuthSummaryResponseBodyData setPostPaidModuleSwitch(String postPaidModuleSwitch) {
            this.postPaidModuleSwitch = postPaidModuleSwitch;
            return this;
        }
        public String getPostPaidModuleSwitch() {
            return this.postPaidModuleSwitch;
        }

        public GetServerlessAuthSummaryResponseBodyData setPostPaidOpenTime(Long postPaidOpenTime) {
            this.postPaidOpenTime = postPaidOpenTime;
            return this;
        }
        public Long getPostPaidOpenTime() {
            return this.postPaidOpenTime;
        }

        public GetServerlessAuthSummaryResponseBodyData setPostPaidStatus(Integer postPaidStatus) {
            this.postPaidStatus = postPaidStatus;
            return this;
        }
        public Integer getPostPaidStatus() {
            return this.postPaidStatus;
        }

        public GetServerlessAuthSummaryResponseBodyData setPostpaidInstanceId(String postpaidInstanceId) {
            this.postpaidInstanceId = postpaidInstanceId;
            return this;
        }
        public String getPostpaidInstanceId() {
            return this.postpaidInstanceId;
        }

        public GetServerlessAuthSummaryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalBindAppCount(Integer totalBindAppCount) {
            this.totalBindAppCount = totalBindAppCount;
            return this;
        }
        public Integer getTotalBindAppCount() {
            return this.totalBindAppCount;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalBindCoreCount(Integer totalBindCoreCount) {
            this.totalBindCoreCount = totalBindCoreCount;
            return this;
        }
        public Integer getTotalBindCoreCount() {
            return this.totalBindCoreCount;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalBindInstanceCount(Integer totalBindInstanceCount) {
            this.totalBindInstanceCount = totalBindInstanceCount;
            return this;
        }
        public Integer getTotalBindInstanceCount() {
            return this.totalBindInstanceCount;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalUnBindAppCount(Integer totalUnBindAppCount) {
            this.totalUnBindAppCount = totalUnBindAppCount;
            return this;
        }
        public Integer getTotalUnBindAppCount() {
            return this.totalUnBindAppCount;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalUnBindCoreCount(Integer totalUnBindCoreCount) {
            this.totalUnBindCoreCount = totalUnBindCoreCount;
            return this;
        }
        public Integer getTotalUnBindCoreCount() {
            return this.totalUnBindCoreCount;
        }

        public GetServerlessAuthSummaryResponseBodyData setTotalUnBindInstanceCount(Integer totalUnBindInstanceCount) {
            this.totalUnBindInstanceCount = totalUnBindInstanceCount;
            return this;
        }
        public Integer getTotalUnBindInstanceCount() {
            return this.totalUnBindInstanceCount;
        }

    }

}
