// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryEntriesRequest extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("word")
    public String word;

    public static ListInterventionDictionaryEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryEntriesRequest self = new ListInterventionDictionaryEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInterventionDictionaryEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInterventionDictionaryEntriesRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

}
