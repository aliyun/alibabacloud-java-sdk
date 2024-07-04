// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobSanityCheckResultsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    public static ListJobSanityCheckResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobSanityCheckResultsRequest self = new ListJobSanityCheckResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobSanityCheckResultsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
