// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListIndexesResponseBodyResult> result;

    public static ListIndexesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesResponseBody self = new ListIndexesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexesResponseBody setResult(java.util.List<ListIndexesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListIndexesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListIndexesResponseBodyResult extends TeaModel {
        @NameInMap("dataSource")
        public String dataSource;

        @NameInMap("name")
        public String name;

        public static ListIndexesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResult self = new ListIndexesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResult setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public ListIndexesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
