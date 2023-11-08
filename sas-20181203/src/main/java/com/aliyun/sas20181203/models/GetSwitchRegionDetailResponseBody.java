// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSwitchRegionDetailResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetSwitchRegionDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSwitchRegionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchRegionDetailResponseBody self = new GetSwitchRegionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchRegionDetailResponseBody setData(GetSwitchRegionDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSwitchRegionDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSwitchRegionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSwitchRegionDetailResponseBodyDataRegionStatus extends TeaModel {
        /**
         * <p>The number of ECS instances.</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The time when the migration is scheduled.</p>
         */
        @NameInMap("GmtPlanSwitchTime")
        public Long gmtPlanSwitchTime;

        /**
         * <p>The region in which the server resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The migration status. Valid values:</p>
         * <br>
         * <p>*   **0**: pending</p>
         * <p>*   **1**: successful</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetSwitchRegionDetailResponseBodyDataRegionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetSwitchRegionDetailResponseBodyDataRegionStatus self = new GetSwitchRegionDetailResponseBodyDataRegionStatus();
            return TeaModel.build(map, self);
        }

        public GetSwitchRegionDetailResponseBodyDataRegionStatus setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public GetSwitchRegionDetailResponseBodyDataRegionStatus setGmtPlanSwitchTime(Long gmtPlanSwitchTime) {
            this.gmtPlanSwitchTime = gmtPlanSwitchTime;
            return this;
        }
        public Long getGmtPlanSwitchTime() {
            return this.gmtPlanSwitchTime;
        }

        public GetSwitchRegionDetailResponseBodyDataRegionStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSwitchRegionDetailResponseBodyDataRegionStatus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetSwitchRegionDetailResponseBodyData extends TeaModel {
        /**
         * <p>The time when the permissions were modified.</p>
         */
        @NameInMap("GmtIsAgreeModified")
        public Long gmtIsAgreeModified;

        /**
         * <p>The notification time.</p>
         */
        @NameInMap("GmtNoticed")
        public Long gmtNoticed;

        /**
         * <p>Indicates whether the migration is approved.</p>
         */
        @NameInMap("IsAgree")
        public String isAgree;

        /**
         * <p>Indicates whether the notification is sent.</p>
         */
        @NameInMap("IsNoticed")
        public String isNoticed;

        /**
         * <p>The status of the switching to the region.</p>
         */
        @NameInMap("RegionStatus")
        public java.util.List<GetSwitchRegionDetailResponseBodyDataRegionStatus> regionStatus;

        public static GetSwitchRegionDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSwitchRegionDetailResponseBodyData self = new GetSwitchRegionDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSwitchRegionDetailResponseBodyData setGmtIsAgreeModified(Long gmtIsAgreeModified) {
            this.gmtIsAgreeModified = gmtIsAgreeModified;
            return this;
        }
        public Long getGmtIsAgreeModified() {
            return this.gmtIsAgreeModified;
        }

        public GetSwitchRegionDetailResponseBodyData setGmtNoticed(Long gmtNoticed) {
            this.gmtNoticed = gmtNoticed;
            return this;
        }
        public Long getGmtNoticed() {
            return this.gmtNoticed;
        }

        public GetSwitchRegionDetailResponseBodyData setIsAgree(String isAgree) {
            this.isAgree = isAgree;
            return this;
        }
        public String getIsAgree() {
            return this.isAgree;
        }

        public GetSwitchRegionDetailResponseBodyData setIsNoticed(String isNoticed) {
            this.isNoticed = isNoticed;
            return this;
        }
        public String getIsNoticed() {
            return this.isNoticed;
        }

        public GetSwitchRegionDetailResponseBodyData setRegionStatus(java.util.List<GetSwitchRegionDetailResponseBodyDataRegionStatus> regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public java.util.List<GetSwitchRegionDetailResponseBodyDataRegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

    }

}
