// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAbridgedcontentwithrangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentRange")
    public String contentRange;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static QueryLinkeLinklogAbridgedcontentwithrangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAbridgedcontentwithrangeResponseBody self = new QueryLinkeLinklogAbridgedcontentwithrangeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }
    public String getContentRange() {
        return this.contentRange;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
