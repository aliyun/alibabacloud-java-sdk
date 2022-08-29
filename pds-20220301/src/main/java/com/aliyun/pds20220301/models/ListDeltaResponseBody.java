// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaResponseBody extends TeaModel {
    @NameInMap("cursor")
    public String cursor;

    @NameInMap("has_more")
    public Boolean hasMore;

    @NameInMap("items")
    public java.util.List<ListDeltaResponseBodyItems> items;

    public static ListDeltaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeltaResponseBody self = new ListDeltaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeltaResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListDeltaResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListDeltaResponseBody setItems(java.util.List<ListDeltaResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListDeltaResponseBodyItems> getItems() {
        return this.items;
    }

    public static class ListDeltaResponseBodyItems extends TeaModel {
        @NameInMap("file")
        public File file;

        @NameInMap("file_id")
        public String fileId;

        @NameInMap("op")
        public String op;

        public static ListDeltaResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDeltaResponseBodyItems self = new ListDeltaResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDeltaResponseBodyItems setFile(File file) {
            this.file = file;
            return this;
        }
        public File getFile() {
            return this.file;
        }

        public ListDeltaResponseBodyItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListDeltaResponseBodyItems setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

}
