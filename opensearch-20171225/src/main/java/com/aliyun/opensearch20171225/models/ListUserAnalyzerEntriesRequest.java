// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesRequest extends TeaModel {
    @NameInMap("word")
    public String word;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListUserAnalyzerEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesRequest self = new ListUserAnalyzerEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzerEntriesRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

    public ListUserAnalyzerEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserAnalyzerEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
