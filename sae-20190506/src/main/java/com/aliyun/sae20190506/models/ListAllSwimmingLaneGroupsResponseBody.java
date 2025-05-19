// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLaneGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllSwimmingLaneGroupsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListAllSwimmingLaneGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLaneGroupsResponseBody self = new ListAllSwimmingLaneGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLaneGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllSwimmingLaneGroupsResponseBody setData(java.util.List<ListAllSwimmingLaneGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllSwimmingLaneGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListAllSwimmingLaneGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAllSwimmingLaneGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllSwimmingLaneGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllSwimmingLaneGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAllSwimmingLaneGroupsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAllSwimmingLaneGroupsResponseBodyDataApps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f5aad0d0-3e56-44cd-8199-9887a0******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>mse-cn-53y49******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <strong>example:</strong>
         * <p>6733e538-d52f-48e6-91a4-192f91******</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        public static ListAllSwimmingLaneGroupsResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLaneGroupsResponseBodyDataApps self = new ListAllSwimmingLaneGroupsResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataApps setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataApps setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataApps setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

    }

    public static class ListAllSwimmingLaneGroupsResponseBodyDataEntryApp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>09805e5d-9b8d-42cd-9442-03c498******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>mse-cn-53y49******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        public static ListAllSwimmingLaneGroupsResponseBodyDataEntryApp build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLaneGroupsResponseBodyDataEntryApp self = new ListAllSwimmingLaneGroupsResponseBodyDataEntryApp();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

    }

    public static class ListAllSwimmingLaneGroupsResponseBodyData extends TeaModel {
        @NameInMap("AppIds")
        public java.util.List<String> appIds;

        @NameInMap("Apps")
        public java.util.List<ListAllSwimmingLaneGroupsResponseBodyDataApps> apps;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        @NameInMap("EntryApp")
        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp entryApp;

        /**
         * <strong>example:</strong>
         * <p>mse_ingresspost-cn-axc49******</p>
         */
        @NameInMap("EntryAppId")
        public String entryAppId;

        /**
         * <strong>example:</strong>
         * <p>mse-gw</p>
         */
        @NameInMap("EntryAppType")
        public String entryAppType;

        /**
         * <strong>example:</strong>
         * <p>2074</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>mse-test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SwimVersion")
        public String swimVersion;

        public static ListAllSwimmingLaneGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLaneGroupsResponseBodyData self = new ListAllSwimmingLaneGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setApps(java.util.List<ListAllSwimmingLaneGroupsResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAllSwimmingLaneGroupsResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setEntryApp(ListAllSwimmingLaneGroupsResponseBodyDataEntryApp entryApp) {
            this.entryApp = entryApp;
            return this;
        }
        public ListAllSwimmingLaneGroupsResponseBodyDataEntryApp getEntryApp() {
            return this.entryApp;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setEntryAppId(String entryAppId) {
            this.entryAppId = entryAppId;
            return this;
        }
        public String getEntryAppId() {
            return this.entryAppId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setEntryAppType(String entryAppType) {
            this.entryAppType = entryAppType;
            return this;
        }
        public String getEntryAppType() {
            return this.entryAppType;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListAllSwimmingLaneGroupsResponseBodyData setSwimVersion(String swimVersion) {
            this.swimVersion = swimVersion;
            return this;
        }
        public String getSwimVersion() {
            return this.swimVersion;
        }

    }

}
