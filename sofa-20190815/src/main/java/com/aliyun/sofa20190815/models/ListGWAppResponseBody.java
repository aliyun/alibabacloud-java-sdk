// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWAppResponseBodyData data;

    public static ListGWAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWAppResponseBody self = new ListGWAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWAppResponseBody setData(ListGWAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWAppResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWAppResponseBodyDataListAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWAppResponseBodyDataListAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyDataListAuthenticationConfig self = new ListGWAppResponseBodyDataListAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyDataListAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWAppResponseBodyDataListAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWAppResponseBodyDataListEncryptConfig extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EncryptionStatus")
        public String encryptionStatus;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("KeyPair")
        public String keyPair;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("PubKey")
        public String pubKey;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListGWAppResponseBodyDataListEncryptConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyDataListEncryptConfig self = new ListGWAppResponseBodyDataListEncryptConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyDataListEncryptConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setEncryptionStatus(String encryptionStatus) {
            this.encryptionStatus = encryptionStatus;
            return this;
        }
        public String getEncryptionStatus() {
            return this.encryptionStatus;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setPubKey(String pubKey) {
            this.pubKey = pubKey;
            return this;
        }
        public String getPubKey() {
            return this.pubKey;
        }

        public ListGWAppResponseBodyDataListEncryptConfig setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWAppResponseBodyDataList extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AuthenticationConfig")
        public ListGWAppResponseBodyDataListAuthenticationConfig authenticationConfig;

        @NameInMap("EncryptConfig")
        public ListGWAppResponseBodyDataListEncryptConfig encryptConfig;

        public static ListGWAppResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyDataList self = new ListGWAppResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyDataList setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppResponseBodyDataList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListGWAppResponseBodyDataList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListGWAppResponseBodyDataList setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public ListGWAppResponseBodyDataList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListGWAppResponseBodyDataList setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppResponseBodyDataList setAuthenticationConfig(ListGWAppResponseBodyDataListAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWAppResponseBodyDataListAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

        public ListGWAppResponseBodyDataList setEncryptConfig(ListGWAppResponseBodyDataListEncryptConfig encryptConfig) {
            this.encryptConfig = encryptConfig;
            return this;
        }
        public ListGWAppResponseBodyDataListEncryptConfig getEncryptConfig() {
            return this.encryptConfig;
        }

    }

    public static class ListGWAppResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWAppResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyDataPageInfoOrderInfos self = new ListGWAppResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWAppResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWAppResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWAppResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWAppResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyDataPageInfo self = new ListGWAppResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWAppResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWAppResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWAppResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWAppResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWAppResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWAppResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWAppResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWAppResponseBodyDataPageInfo pageInfo;

        public static ListGWAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppResponseBodyData self = new ListGWAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWAppResponseBodyData setList(java.util.List<ListGWAppResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWAppResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWAppResponseBodyData setPageInfo(ListGWAppResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWAppResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
