// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>\-</p>
     */
    @NameInMap("types")
    public String types;

    public static ListInterventionDictionariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionariesRequest self = new ListInterventionDictionariesRequest();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionariesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInterventionDictionariesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInterventionDictionariesRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
