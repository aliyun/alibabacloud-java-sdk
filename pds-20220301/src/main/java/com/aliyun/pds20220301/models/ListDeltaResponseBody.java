// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaResponseBody extends TeaModel {
    /**
     * <p>The cursor of the incremental information.</p>
     * 
     * <strong>example:</strong>
     * <p>1WQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>Indicates whether more information is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>122fb09598ae66777c7040109a16f49381f6abe2</p>
         */
        @NameInMap("file_id")
        public String fileId;

        /**
         * <p>The operation that is performed. Valid values: Valid values:</p>
         * <ul>
         * <li>create</li>
         * <li>overwrite</li>
         * <li>delete</li>
         * <li>update</li>
         * <li>move</li>
         * <li>trash</li>
         * <li>restore</li>
         * <li>rename</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>create</p>
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
