// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityBySupplierUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryCommodityBySupplierUidResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCommodityBySupplierUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityBySupplierUidResponseBody self = new QueryCommodityBySupplierUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommodityBySupplierUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommodityBySupplierUidResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryCommodityBySupplierUidResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public QueryCommodityBySupplierUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommodityBySupplierUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityBySupplierUidResponseBody setResult(java.util.List<QueryCommodityBySupplierUidResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryCommodityBySupplierUidResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryCommodityBySupplierUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommodityBySupplierUidResponseBodyResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("VersionList")
        public java.util.List<String> versionList;

        public static QueryCommodityBySupplierUidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityBySupplierUidResponseBodyResult self = new QueryCommodityBySupplierUidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCommodityBySupplierUidResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCommodityBySupplierUidResponseBodyResult setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public QueryCommodityBySupplierUidResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCommodityBySupplierUidResponseBodyResult setVersionList(java.util.List<String> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<String> getVersionList() {
            return this.versionList;
        }

    }

}
