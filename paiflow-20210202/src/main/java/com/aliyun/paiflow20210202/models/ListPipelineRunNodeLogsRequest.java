// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeLogsRequest extends TeaModel {
    @NameInMap("FromTimeInSeconds")
    public Long fromTimeInSeconds;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("ToTimeInSeconds")
    public Long toTimeInSeconds;

    public static ListPipelineRunNodeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeLogsRequest self = new ListPipelineRunNodeLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeLogsRequest setFromTimeInSeconds(Long fromTimeInSeconds) {
        this.fromTimeInSeconds = fromTimeInSeconds;
        return this;
    }
    public Long getFromTimeInSeconds() {
        return this.fromTimeInSeconds;
    }

    public ListPipelineRunNodeLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPipelineRunNodeLogsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListPipelineRunNodeLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineRunNodeLogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListPipelineRunNodeLogsRequest setToTimeInSeconds(Long toTimeInSeconds) {
        this.toTimeInSeconds = toTimeInSeconds;
        return this;
    }
    public Long getToTimeInSeconds() {
        return this.toTimeInSeconds;
    }

}
