// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SubmitInfoRequest extends TeaModel {
    @NameInMap("CallerUid")
    public Long callerUid;

    @NameInMap("EcsDescList")
    public java.util.List<SubmitInfoRequestEcsDescList> ecsDescList;

    @NameInMap("MainUserId")
    public Long mainUserId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInfoRequest self = new SubmitInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInfoRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public SubmitInfoRequest setEcsDescList(java.util.List<SubmitInfoRequestEcsDescList> ecsDescList) {
        this.ecsDescList = ecsDescList;
        return this;
    }
    public java.util.List<SubmitInfoRequestEcsDescList> getEcsDescList() {
        return this.ecsDescList;
    }

    public SubmitInfoRequest setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
        return this;
    }
    public Long getMainUserId() {
        return this.mainUserId;
    }

    public SubmitInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitInfoRequestEcsDescList extends TeaModel {
        @NameInMap("AppType")
        public String appType;

        @NameInMap("BussinessDesc")
        public String bussinessDesc;

        @NameInMap("BussinessType")
        public String bussinessType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("MiddleWareDesc")
        public String middleWareDesc;

        @NameInMap("OtherMiddleWareDesc")
        public String otherMiddleWareDesc;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("UserId")
        public String userId;

        public static SubmitInfoRequestEcsDescList build(java.util.Map<String, ?> map) throws Exception {
            SubmitInfoRequestEcsDescList self = new SubmitInfoRequestEcsDescList();
            return TeaModel.build(map, self);
        }

        public SubmitInfoRequestEcsDescList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public SubmitInfoRequestEcsDescList setBussinessDesc(String bussinessDesc) {
            this.bussinessDesc = bussinessDesc;
            return this;
        }
        public String getBussinessDesc() {
            return this.bussinessDesc;
        }

        public SubmitInfoRequestEcsDescList setBussinessType(String bussinessType) {
            this.bussinessType = bussinessType;
            return this;
        }
        public String getBussinessType() {
            return this.bussinessType;
        }

        public SubmitInfoRequestEcsDescList setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public SubmitInfoRequestEcsDescList setMiddleWareDesc(String middleWareDesc) {
            this.middleWareDesc = middleWareDesc;
            return this;
        }
        public String getMiddleWareDesc() {
            return this.middleWareDesc;
        }

        public SubmitInfoRequestEcsDescList setOtherMiddleWareDesc(String otherMiddleWareDesc) {
            this.otherMiddleWareDesc = otherMiddleWareDesc;
            return this;
        }
        public String getOtherMiddleWareDesc() {
            return this.otherMiddleWareDesc;
        }

        public SubmitInfoRequestEcsDescList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SubmitInfoRequestEcsDescList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
