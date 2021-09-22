// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeLogsRequest extends TeaModel {
    // 当前偏移量
    @NameInMap("Offset")
    public Integer offset;

    // 每页返回的log数目
    @NameInMap("PageSize")
    public Integer pageSize;

    // 开始时间
    @NameInMap("FromTimeInSeconds")
    public Long fromTimeInSeconds;

    // 搜索词
    @NameInMap("Keyword")
    public String keyword;

    // 是否倒排
    @NameInMap("Reverse")
    public Boolean reverse;

    // 结束时间
    @NameInMap("ToTimeInSeconds")
    public Long toTimeInSeconds;

    public static ListNodeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLogsRequest self = new ListNodeLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeLogsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListNodeLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeLogsRequest setFromTimeInSeconds(Long fromTimeInSeconds) {
        this.fromTimeInSeconds = fromTimeInSeconds;
        return this;
    }
    public Long getFromTimeInSeconds() {
        return this.fromTimeInSeconds;
    }

    public ListNodeLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListNodeLogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListNodeLogsRequest setToTimeInSeconds(Long toTimeInSeconds) {
        this.toTimeInSeconds = toTimeInSeconds;
        return this;
    }
    public Long getToTimeInSeconds() {
        return this.toTimeInSeconds;
    }

}
