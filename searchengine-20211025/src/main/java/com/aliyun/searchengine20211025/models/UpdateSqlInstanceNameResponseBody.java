// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
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
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1719220182844</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
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
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <p>Indicates whether the item is a folder. A value of 1 indicates a folder. A value of 0 indicates that the item is not a folder.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <p>The name of the SQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
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
         * <p>The type of the item. Valid values: table, instance, template, and function.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
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
