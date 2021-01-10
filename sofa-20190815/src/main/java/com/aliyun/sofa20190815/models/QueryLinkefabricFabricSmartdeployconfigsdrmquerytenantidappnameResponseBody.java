// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData> data;

    public static QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody self = new QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody setData(java.util.List<QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Description")
        public String description;

        @NameInMap("Env")
        public String env;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData self = new QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
