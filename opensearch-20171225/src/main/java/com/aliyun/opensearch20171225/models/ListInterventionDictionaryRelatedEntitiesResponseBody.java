// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryRelatedEntitiesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListInterventionDictionaryRelatedEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryRelatedEntitiesResponseBody self = new ListInterventionDictionaryRelatedEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryRelatedEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterventionDictionaryRelatedEntitiesResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
