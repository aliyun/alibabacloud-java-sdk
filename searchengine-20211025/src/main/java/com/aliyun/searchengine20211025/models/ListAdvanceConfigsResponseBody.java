// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of advanced configurations.</p>
     */
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
        /**
         * <p>The name of the absolute path.</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether it is a directory. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether it is a template. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The name of the file.</p>
         */
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
        @NameInMap("content")
        public String content;

        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The list of file names.</p>
         */
        @NameInMap("files")
        public java.util.List<ListAdvanceConfigsResponseBodyResultFiles> files;

        /**
         * <p>The name of the advanced configuration.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The state of the advanced configuration. Valid values: drafting, used, unused, and trash. drafting indicates that the advanced configuration is a draft. used indicates that the advanced configuration is in use. unused indicates that the advanced configuration is unused. trash indicates that the advanced configuration is being deleted.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         */
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
