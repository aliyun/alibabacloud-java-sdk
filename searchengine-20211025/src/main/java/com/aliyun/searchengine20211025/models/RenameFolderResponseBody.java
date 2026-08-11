// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RenameFolderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
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
        /**
         * <p>The time when the folder was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the folder was last modified.</p>
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
         * <p>1</p>
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
         * <p>Indicates whether the item is a folder. Valid values: \<code>true\\</code> and \<code>false\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <p>The name of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the parent folder.</p>
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
         * <p>The type of the item. Valid values: \<code>table\\</code>, \<code>instance\\</code>, \<code>template\\</code>, and \<code>function\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
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
