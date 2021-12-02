// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAppResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponseBody self = new ListAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppResponseBody setData(java.util.List<ListAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppResponseBodyData> getData() {
        return this.data;
    }

    public ListAppResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppResponseBodyDataMiddleWareList extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static ListAppResponseBodyDataMiddleWareList build(java.util.Map<String, ?> map) throws Exception {
            ListAppResponseBodyDataMiddleWareList self = new ListAppResponseBodyDataMiddleWareList();
            return TeaModel.build(map, self);
        }

        public ListAppResponseBodyDataMiddleWareList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppResponseBodyDataMiddleWareList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListAppResponseBodyDataMiddleWareList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppStateType")
        public String appStateType;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizTitle")
        public String bizTitle;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Language")
        public String language;

        @NameInMap("MiddleWareList")
        public java.util.List<ListAppResponseBodyDataMiddleWareList> middleWareList;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Title")
        public String title;

        public static ListAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppResponseBodyData self = new ListAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppResponseBodyData setAppStateType(String appStateType) {
            this.appStateType = appStateType;
            return this;
        }
        public String getAppStateType() {
            return this.appStateType;
        }

        public ListAppResponseBodyData setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public ListAppResponseBodyData setBizTitle(String bizTitle) {
            this.bizTitle = bizTitle;
            return this;
        }
        public String getBizTitle() {
            return this.bizTitle;
        }

        public ListAppResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAppResponseBodyData setMiddleWareList(java.util.List<ListAppResponseBodyDataMiddleWareList> middleWareList) {
            this.middleWareList = middleWareList;
            return this;
        }
        public java.util.List<ListAppResponseBodyDataMiddleWareList> getMiddleWareList() {
            return this.middleWareList;
        }

        public ListAppResponseBodyData setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public ListAppResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListAppResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
