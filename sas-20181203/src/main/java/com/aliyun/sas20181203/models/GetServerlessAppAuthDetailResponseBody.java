// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAppAuthDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServerlessAppAuthDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServerlessAppAuthDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAppAuthDetailResponseBody self = new GetServerlessAppAuthDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServerlessAppAuthDetailResponseBody setData(GetServerlessAppAuthDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServerlessAppAuthDetailResponseBodyData getData() {
        return this.data;
    }

    public GetServerlessAppAuthDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServerlessAppAuthDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServerlessAppAuthDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c932b7a0***</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreCount")
        public Integer coreCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBind")
        public Boolean isBind;

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
         * <p>101</p>
         */
        @NameInMap("PostpaidInstanceId")
        public String postpaidInstanceId;

        public static GetServerlessAppAuthDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServerlessAppAuthDetailResponseBodyData self = new GetServerlessAppAuthDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServerlessAppAuthDetailResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetServerlessAppAuthDetailResponseBodyData setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Integer getCoreCount() {
            return this.coreCount;
        }

        public GetServerlessAppAuthDetailResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public GetServerlessAppAuthDetailResponseBodyData setIsBind(Boolean isBind) {
            this.isBind = isBind;
            return this;
        }
        public Boolean getIsBind() {
            return this.isBind;
        }

        public GetServerlessAppAuthDetailResponseBodyData setIsPostPaid(Boolean isPostPaid) {
            this.isPostPaid = isPostPaid;
            return this;
        }
        public Boolean getIsPostPaid() {
            return this.isPostPaid;
        }

        public GetServerlessAppAuthDetailResponseBodyData setIsServerlessPostPaidValid(Boolean isServerlessPostPaidValid) {
            this.isServerlessPostPaidValid = isServerlessPostPaidValid;
            return this;
        }
        public Boolean getIsServerlessPostPaidValid() {
            return this.isServerlessPostPaidValid;
        }

        public GetServerlessAppAuthDetailResponseBodyData setPostPaidModuleSwitch(String postPaidModuleSwitch) {
            this.postPaidModuleSwitch = postPaidModuleSwitch;
            return this;
        }
        public String getPostPaidModuleSwitch() {
            return this.postPaidModuleSwitch;
        }

        public GetServerlessAppAuthDetailResponseBodyData setPostPaidOpenTime(Long postPaidOpenTime) {
            this.postPaidOpenTime = postPaidOpenTime;
            return this;
        }
        public Long getPostPaidOpenTime() {
            return this.postPaidOpenTime;
        }

        public GetServerlessAppAuthDetailResponseBodyData setPostPaidStatus(Integer postPaidStatus) {
            this.postPaidStatus = postPaidStatus;
            return this;
        }
        public Integer getPostPaidStatus() {
            return this.postPaidStatus;
        }

        public GetServerlessAppAuthDetailResponseBodyData setPostpaidInstanceId(String postpaidInstanceId) {
            this.postpaidInstanceId = postpaidInstanceId;
            return this;
        }
        public String getPostpaidInstanceId() {
            return this.postpaidInstanceId;
        }

    }

}
