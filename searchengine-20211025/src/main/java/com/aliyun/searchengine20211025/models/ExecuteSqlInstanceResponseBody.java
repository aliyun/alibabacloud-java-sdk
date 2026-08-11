// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ExecuteSqlInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE03180A-0E29-5474-8A86-33F0683294A4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719220182844</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <p>Indicates whether the entry is a directory. Valid values:</p>
         * <ul>
         * <li>true: The entry is a directory.</li>
         * <li>false: The entry is not a directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parent task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("parent")
        public Long parent;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>table, instance, template, function</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
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
