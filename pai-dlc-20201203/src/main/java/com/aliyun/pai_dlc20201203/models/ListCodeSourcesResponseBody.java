// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListCodeSourcesResponseBody extends TeaModel {
    // 代码源配置列表
    @NameInMap("CodeSources")
    public java.util.List<CodeSourceItem> codeSources;

    // 符合过滤条件的代码源配置的总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListCodeSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCodeSourcesResponseBody self = new ListCodeSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCodeSourcesResponseBody setCodeSources(java.util.List<CodeSourceItem> codeSources) {
        this.codeSources = codeSources;
        return this;
    }
    public java.util.List<CodeSourceItem> getCodeSources() {
        return this.codeSources;
    }

    public ListCodeSourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCodeSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
