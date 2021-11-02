// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryContentInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryContentInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryContentInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryContentInfoResponseBody self = new QueryContentInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryContentInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryContentInfoResponseBody setData(QueryContentInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryContentInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryContentInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryContentInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryContentInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryContentInfoResponseBodyData extends TeaModel {
        @NameInMap("BrandUserId")
        public Long brandUserId;

        @NameInMap("ChainValue")
        public String chainValue;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenScene")
        public Integer openScene;

        @NameInMap("ProxyUserId")
        public Long proxyUserId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateType")
        public String templateType;

        public static QueryContentInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryContentInfoResponseBodyData self = new QueryContentInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryContentInfoResponseBodyData setBrandUserId(Long brandUserId) {
            this.brandUserId = brandUserId;
            return this;
        }
        public Long getBrandUserId() {
            return this.brandUserId;
        }

        public QueryContentInfoResponseBodyData setChainValue(String chainValue) {
            this.chainValue = chainValue;
            return this;
        }
        public String getChainValue() {
            return this.chainValue;
        }

        public QueryContentInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryContentInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryContentInfoResponseBodyData setOpenScene(Integer openScene) {
            this.openScene = openScene;
            return this;
        }
        public Integer getOpenScene() {
            return this.openScene;
        }

        public QueryContentInfoResponseBodyData setProxyUserId(Long proxyUserId) {
            this.proxyUserId = proxyUserId;
            return this;
        }
        public Long getProxyUserId() {
            return this.proxyUserId;
        }

        public QueryContentInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryContentInfoResponseBodyData setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
