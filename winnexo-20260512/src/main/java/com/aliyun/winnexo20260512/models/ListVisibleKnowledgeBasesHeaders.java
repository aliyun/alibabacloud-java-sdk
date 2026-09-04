// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBasesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F892C03F-7E12-5F37-A506-1FC3B065EAC6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListVisibleKnowledgeBasesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBasesHeaders self = new ListVisibleKnowledgeBasesHeaders();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBasesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListVisibleKnowledgeBasesHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
