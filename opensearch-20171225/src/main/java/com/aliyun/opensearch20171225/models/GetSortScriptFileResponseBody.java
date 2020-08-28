// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptFileResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public GetSortScriptFileResponseBodyResult result;

    public static GetSortScriptFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptFileResponseBody self = new GetSortScriptFileResponseBody();
        return TeaModel.build(map, self);
    }

    public static class GetSortScriptFileResponseBodyResult extends TeaModel {
        @NameInMap("content")
        @Validation(required = true)
        public String content;

        @NameInMap("version")
        @Validation(required = true)
        public Long version;

        @NameInMap("createTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("modifyTime")
        @Validation(required = true)
        public String modifyTime;

        public static GetSortScriptFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSortScriptFileResponseBodyResult self = new GetSortScriptFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

    }

}
