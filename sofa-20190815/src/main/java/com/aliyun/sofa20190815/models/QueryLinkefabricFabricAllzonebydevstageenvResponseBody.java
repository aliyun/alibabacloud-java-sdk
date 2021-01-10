// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAllzonebydevstageenvResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData> data;

    public static QueryLinkefabricFabricAllzonebydevstageenvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAllzonebydevstageenvResponseBody self = new QueryLinkefabricFabricAllzonebydevstageenvResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody setData(java.util.List<QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Preprod")
        public Boolean preprod;

        public static QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData self = new QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkefabricFabricAllzonebydevstageenvResponseBodyData setPreprod(Boolean preprod) {
            this.preprod = preprod;
            return this;
        }
        public Boolean getPreprod() {
            return this.preprod;
        }

    }

}
