// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public GetSortScriptResponseBodyResult result;

    public static GetSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptResponseBody self = new GetSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public static class GetSortScriptResponseBodyResult extends TeaModel {
        @NameInMap("type")
        @Validation(required = true)
        public String type;

        @NameInMap("scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        @NameInMap("createTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("modifyTime")
        @Validation(required = true)
        public String modifyTime;

        public static GetSortScriptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSortScriptResponseBodyResult self = new GetSortScriptResponseBodyResult();
            return TeaModel.build(map, self);
        }

    }

}
