// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ExecuteSqlInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ExecuteSqlInstanceResponseBodyResult result;

    public static ExecuteSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlInstanceResponseBody self = new ExecuteSqlInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteSqlInstanceResponseBody setResult(ExecuteSqlInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ExecuteSqlInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ExecuteSqlInstanceResponseBodyResult extends TeaModel {
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

        public static ExecuteSqlInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteSqlInstanceResponseBodyResult self = new ExecuteSqlInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecuteSqlInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExecuteSqlInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExecuteSqlInstanceResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecuteSqlInstanceResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ExecuteSqlInstanceResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public ExecuteSqlInstanceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteSqlInstanceResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public ExecuteSqlInstanceResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ExecuteSqlInstanceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
