// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RenameFolderResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RenameFolderResponseBodyResult result;

    public static RenameFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameFolderResponseBody self = new RenameFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameFolderResponseBody setResult(RenameFolderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RenameFolderResponseBodyResult getResult() {
        return this.result;
    }

    public static class RenameFolderResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("instanceId")
        public Long instanceId;

        @NameInMap("isDir")
        public Integer isDir;

        @NameInMap("name")
        public String name;

        @NameInMap("parent")
        public Long parent;

        @NameInMap("templateId")
        public Long templateId;

        @NameInMap("type")
        public String type;

        public static RenameFolderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RenameFolderResponseBodyResult self = new RenameFolderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RenameFolderResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RenameFolderResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public RenameFolderResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RenameFolderResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public RenameFolderResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public RenameFolderResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RenameFolderResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public RenameFolderResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public RenameFolderResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
