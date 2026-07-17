// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesRequest extends TeaModel {
    /**
     * <p>The page number to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The types of the intervention dictionaries. Format: urlencode([&quot;synonym&quot;, &quot;stopword&quot;])</p>
     * <ul>
     * <li><p>stopword: an intervention dictionary for stop word filtering</p>
     * </li>
     * <li><p>synonym: an intervention dictionary for synonym configuration</p>
     * </li>
     * <li><p>correction: an intervention dictionary for spelling correction</p>
     * </li>
     * <li><p>category_prediction: an intervention dictionary for category prediction</p>
     * </li>
     * <li><p>ner: an intervention dictionary for Named Entity Recognition (NER)</p>
     * </li>
     * <li><p>term_weighting: an intervention dictionary for term weight analysis</p>
     * </li>
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
