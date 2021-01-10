// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqLinkResponseBodyData data;

    public static QueryMqSofamqLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqLinkResponseBody self = new QueryMqSofamqLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqLinkResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqLinkResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqLinkResponseBody setData(QueryMqSofamqLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqLinkResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqLinkResponseBodyData extends TeaModel {
        @NameInMap("DemoProject")
        public String demoProject;

        @NameInMap("ProductDoc")
        public String productDoc;

        @NameInMap("QuickStart")
        public String quickStart;

        public static QueryMqSofamqLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqLinkResponseBodyData self = new QueryMqSofamqLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqLinkResponseBodyData setDemoProject(String demoProject) {
            this.demoProject = demoProject;
            return this;
        }
        public String getDemoProject() {
            return this.demoProject;
        }

        public QueryMqSofamqLinkResponseBodyData setProductDoc(String productDoc) {
            this.productDoc = productDoc;
            return this;
        }
        public String getProductDoc() {
            return this.productDoc;
        }

        public QueryMqSofamqLinkResponseBodyData setQuickStart(String quickStart) {
            this.quickStart = quickStart;
            return this;
        }
        public String getQuickStart() {
            return this.quickStart;
        }

    }

}
