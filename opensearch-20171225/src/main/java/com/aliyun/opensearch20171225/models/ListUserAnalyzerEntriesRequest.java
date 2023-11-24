// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The key to be used to query entries.</p>
     */
    @NameInMap("word")
    public String word;

    public static ListUserAnalyzerEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesRequest self = new ListUserAnalyzerEntriesRequest();
        return TeaModel.build(map, self);
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

    public ListUserAnalyzerEntriesRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

}
