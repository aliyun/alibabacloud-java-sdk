// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CloneSqlInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CloneSqlInstanceResponseBodyResult result;

    public static CloneSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneSqlInstanceResponseBody self = new CloneSqlInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneSqlInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneSqlInstanceResponseBody setResult(CloneSqlInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloneSqlInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CloneSqlInstanceResponseBodyResult extends TeaModel {
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

        public static CloneSqlInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloneSqlInstanceResponseBodyResult self = new CloneSqlInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloneSqlInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CloneSqlInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CloneSqlInstanceResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloneSqlInstanceResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CloneSqlInstanceResponseBodyResult setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public CloneSqlInstanceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloneSqlInstanceResponseBodyResult setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public CloneSqlInstanceResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CloneSqlInstanceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
