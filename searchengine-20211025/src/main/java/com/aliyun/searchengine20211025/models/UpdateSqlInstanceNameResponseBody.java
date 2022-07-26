// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceNameResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateSqlInstanceNameResponseBodyResult result;

    public static UpdateSqlInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceNameResponseBody self = new UpdateSqlInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSqlInstanceNameResponseBody setResult(UpdateSqlInstanceNameResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateSqlInstanceNameResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateSqlInstanceNameResponseBodyResult extends TeaModel {
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

        public static UpdateSqlInstanceNameResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSqlInstanceNameResponseBodyResult self = new UpdateSqlInstanceNameResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSqlInstanceNameResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateSqlInstanceNameResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateSqlInstanceNameResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSqlInstanceNameResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public UpdateSqlInstanceNameResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public UpdateSqlInstanceNameResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSqlInstanceNameResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public UpdateSqlInstanceNameResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public UpdateSqlInstanceNameResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
