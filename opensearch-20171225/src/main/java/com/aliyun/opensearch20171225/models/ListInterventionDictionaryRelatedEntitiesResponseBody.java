// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryRelatedEntitiesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each application and each query analysis rule. If no query analysis rule references the intervention dictionary, the value of the result parameter is an empty list.</p>
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
