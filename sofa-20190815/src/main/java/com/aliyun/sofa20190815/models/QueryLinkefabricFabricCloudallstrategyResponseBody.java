// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudallstrategyResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricCloudallstrategyResponseBodyData> data;

    public static QueryLinkefabricFabricCloudallstrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudallstrategyResponseBody self = new QueryLinkefabricFabricCloudallstrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCloudallstrategyResponseBody setData(java.util.List<QueryLinkefabricFabricCloudallstrategyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricCloudallstrategyResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCloudallstrategyResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RelatedTaskCount")
        public Long relatedTaskCount;

        public static QueryLinkefabricFabricCloudallstrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCloudallstrategyResponseBodyData self = new QueryLinkefabricFabricCloudallstrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCloudallstrategyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkefabricFabricCloudallstrategyResponseBodyData setRelatedTaskCount(Long relatedTaskCount) {
            this.relatedTaskCount = relatedTaskCount;
            return this;
        }
        public Long getRelatedTaskCount() {
            return this.relatedTaskCount;
        }

    }

}
