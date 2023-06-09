// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsRequest extends TeaModel {
    /**
     * <p>Soymilk</p>
     */
    @NameInMap("query")
    public String query;

    public static ListInterventionDictionaryNerResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryNerResultsRequest self = new ListInterventionDictionaryNerResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryNerResultsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
