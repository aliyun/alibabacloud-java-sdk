// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListProceedingsRequest extends TeaModel {
    /**
     * <p>Specifies whether the filtering is complete.</p>
     */
    @NameInMap("filterFinished")
    public Boolean filterFinished;

    public static ListProceedingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProceedingsRequest self = new ListProceedingsRequest();
        return TeaModel.build(map, self);
    }

    public ListProceedingsRequest setFilterFinished(Boolean filterFinished) {
        this.filterFinished = filterFinished;
        return this;
    }
    public Boolean getFilterFinished() {
        return this.filterFinished;
    }

}
