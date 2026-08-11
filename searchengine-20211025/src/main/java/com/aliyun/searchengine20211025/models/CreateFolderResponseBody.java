// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25030</p>
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
         * <p>Indicates whether the entry is a folder. Valid values:</p>
         * <ul>
         * <li>true: The entry is a folder.</li>
         * <li>false: The entry is not a folder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
         * <p>The parent level ID.</p>
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
