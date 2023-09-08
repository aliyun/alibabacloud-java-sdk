// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListAdvanceConfigsResponseBodyResult> result;

    public static ListAdvanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigsResponseBody self = new ListAdvanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdvanceConfigsResponseBody setResult(java.util.List<ListAdvanceConfigsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAdvanceConfigsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAdvanceConfigsResponseBodyResultFiles extends TeaModel {
        @NameInMap("fullPathName")
        public String fullPathName;

        @NameInMap("isDir")
        public Boolean isDir;

        @NameInMap("isTemplate")
        public Boolean isTemplate;

        @NameInMap("name")
        public String name;

        public static ListAdvanceConfigsResponseBodyResultFiles build(java.util.Map<String, ?> map) throws Exception {
            ListAdvanceConfigsResponseBodyResultFiles self = new ListAdvanceConfigsResponseBodyResultFiles();
            return TeaModel.build(map, self);
        }

        public ListAdvanceConfigsResponseBodyResultFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAdvanceConfigsResponseBodyResult extends TeaModel {
        /**
         * <p>配置内容 http，git 请求时不为空</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>配置内容的类型 (FILE, GIT, HTTP, ODPS)</p>
         */
        @NameInMap("contentType")
        public String contentType;

        @NameInMap("desc")
        public String desc;

        @NameInMap("files")
        public java.util.List<ListAdvanceConfigsResponseBodyResultFiles> files;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("updateTime")
        public Long updateTime;

        public static ListAdvanceConfigsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAdvanceConfigsResponseBodyResult self = new ListAdvanceConfigsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAdvanceConfigsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAdvanceConfigsResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAdvanceConfigsResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAdvanceConfigsResponseBodyResult setFiles(java.util.List<ListAdvanceConfigsResponseBodyResultFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListAdvanceConfigsResponseBodyResultFiles> getFiles() {
            return this.files;
        }

        public ListAdvanceConfigsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAdvanceConfigsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAdvanceConfigsResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
