// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoryContentsResponseBody extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<ListGitRepositoryContentsResponseBodyContents> contents;

    @NameInMap("Count")
    public Integer count;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

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
