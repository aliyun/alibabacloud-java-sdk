// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The type of the intervention dictionary. Valid values:</p>
     * <ul>
     * <li>stopword: an intervention dictionary for stop word filtering</li>
     * <li>synonym: an intervention dictionary for synonym configuration</li>
     * <li>correction: an intervention dictionary for spelling correction</li>
     * <li>category_prediction: an intervention dictionary for category prediction</li>
     * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
     * <li>term_weighting: an intervention dictionary for term weight analysis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;synonym&quot;]</p>
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
