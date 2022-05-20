// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public java.util.List<GetApplicationResponseBodyData> data;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求链路ID，如POP请求进来的requestId，返回时原样返回
    @NameInMap("RequestId")
    public String requestId;

    // 服务端处理耗时，ms
    @NameInMap("Rt")
    public Long rt;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationResponseBody setData(java.util.List<GetApplicationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetApplicationResponseBodyData> getData() {
        return this.data;
    }

    public GetApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApplicationResponseBodyDataAppingList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        // cdn ip
        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        // cdn 域名信息
        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        // 业务方ip集合
        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

        // 业务方域名集合
        @NameInMap("OriginalUrlList")
        public java.util.List<String> originalUrlList;

        public static GetApplicationResponseBodyDataAppingList build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataAppingList self = new GetApplicationResponseBodyDataAppingList();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataAppingList setExtId(Long extId) {
            this.extId = extId;
            return this;
        }
        public Long getExtId() {
            return this.extId;
        }

        public GetApplicationResponseBodyDataAppingList setFlowIp(java.util.List<String> flowIp) {
            this.flowIp = flowIp;
            return this;
        }
        public java.util.List<String> getFlowIp() {
            return this.flowIp;
        }

        public GetApplicationResponseBodyDataAppingList setFlowUrl(java.util.List<String> flowUrl) {
            this.flowUrl = flowUrl;
            return this;
        }
        public java.util.List<String> getFlowUrl() {
            return this.flowUrl;
        }

        public GetApplicationResponseBodyDataAppingList setOriginalIpList(java.util.List<String> originalIpList) {
            this.originalIpList = originalIpList;
            return this;
        }
        public java.util.List<String> getOriginalIpList() {
            return this.originalIpList;
        }

        public GetApplicationResponseBodyDataAppingList setOriginalUrlList(java.util.List<String> originalUrlList) {
            this.originalUrlList = originalUrlList;
            return this;
        }
        public java.util.List<String> getOriginalUrlList() {
            return this.originalUrlList;
        }

    }

    public static class GetApplicationResponseBodyData extends TeaModel {
        // 用户编号
        @NameInMap("AliUid")
        public Long aliUid;

        // 应用编号
        @NameInMap("AppId")
        public String appId;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppStatus")
        public String appStatus;

        // //dynamic（动态业务）/static（静态业务）  // 前端传递，参数3
        @NameInMap("AppTypeList")
        public String appTypeList;

        @NameInMap("AppingList")
        public java.util.List<GetApplicationResponseBodyDataAppingList> appingList;

        @NameInMap("EndTime")
        public String endTime;

        // Database Column Remarks:
        @NameInMap("ItemCode")
        public String itemCode;

        // 开通时间
        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("StartTime")
        public String startTime;

        public static GetApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyData self = new GetApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationResponseBodyData setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public GetApplicationResponseBodyData setAppTypeList(String appTypeList) {
            this.appTypeList = appTypeList;
            return this;
        }
        public String getAppTypeList() {
            return this.appTypeList;
        }

        public GetApplicationResponseBodyData setAppingList(java.util.List<GetApplicationResponseBodyDataAppingList> appingList) {
            this.appingList = appingList;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataAppingList> getAppingList() {
            return this.appingList;
        }

        public GetApplicationResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetApplicationResponseBodyData setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public GetApplicationResponseBodyData setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public GetApplicationResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
