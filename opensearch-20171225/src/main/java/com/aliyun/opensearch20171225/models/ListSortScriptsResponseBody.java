// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortScriptsResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<ListSortScriptsResponseBodyResult> result;

    public static ListSortScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSortScriptsResponseBody self = new ListSortScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public static class ListSortScriptsResponseBodyResult extends TeaModel {
        @NameInMap("scriptName")
        @Validation(required = true)
        public String scriptName;

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

        public static ListSortScriptsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSortScriptsResponseBodyResult self = new ListSortScriptsResponseBodyResult();
            return TeaModel.build(map, self);
        }

    }

}
