// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoryContentsResponseBody extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<ListGitRepositoryContentsResponseBodyContents> contents;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>2075899A-585D-4A41-A9B2-28DA8534</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGitRepositoryContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoryContentsResponseBody self = new ListGitRepositoryContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoryContentsResponseBody setContents(java.util.List<ListGitRepositoryContentsResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ListGitRepositoryContentsResponseBodyContents> getContents() {
        return this.contents;
    }

    public ListGitRepositoryContentsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGitRepositoryContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGitRepositoryContentsResponseBodyContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mydir</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>mydir</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>dir1</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>dir</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGitRepositoryContentsResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            ListGitRepositoryContentsResponseBodyContents self = new ListGitRepositoryContentsResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public ListGitRepositoryContentsResponseBodyContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListGitRepositoryContentsResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGitRepositoryContentsResponseBodyContents setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGitRepositoryContentsResponseBodyContents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
