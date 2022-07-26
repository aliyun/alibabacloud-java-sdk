// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateFolderResponseBodyResult result;

    public static CreateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponseBody self = new CreateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFolderResponseBody setResult(CreateFolderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFolderResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFolderResponseBodyResult extends TeaModel {
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

        public static CreateFolderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderResponseBodyResult self = new CreateFolderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFolderResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateFolderResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateFolderResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateFolderResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CreateFolderResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public CreateFolderResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFolderResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public CreateFolderResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CreateFolderResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
