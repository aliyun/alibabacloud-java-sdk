// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateSqlInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateSqlInstanceResponseBodyResult result;

    public static CreateSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlInstanceResponseBody self = new CreateSqlInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSqlInstanceResponseBody setResult(CreateSqlInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSqlInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateSqlInstanceResponseBodyResult extends TeaModel {
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

        public static CreateSqlInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlInstanceResponseBodyResult self = new CreateSqlInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSqlInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateSqlInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateSqlInstanceResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSqlInstanceResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CreateSqlInstanceResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public CreateSqlInstanceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSqlInstanceResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public CreateSqlInstanceResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CreateSqlInstanceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
