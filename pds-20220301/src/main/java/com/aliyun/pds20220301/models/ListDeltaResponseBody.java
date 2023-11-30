// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaResponseBody extends TeaModel {
    /**
     * <p>The cursor of the incremental information.</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>Indicates whether more information is returned.</p>
     */
    @NameInMap("has_more")
    public Boolean hasMore;

    /**
     * <p>The incremental information returned.</p>
     */
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
        /**
         * <p>The information about the file.</p>
         */
        @NameInMap("file")
        public File file;

        /**
         * <p>The file ID.</p>
         */
        @NameInMap("file_id")
        public String fileId;

        /**
         * <p>The operation that is performed. Valid values: Valid values:</p>
         * <br>
         * <p>*   create</p>
         * <p>*   overwrite</p>
         * <p>*   delete</p>
         * <p>*   update</p>
         * <p>*   move</p>
         * <p>*   trash</p>
         * <p>*   restore</p>
         * <p>*   rename</p>
         */
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
