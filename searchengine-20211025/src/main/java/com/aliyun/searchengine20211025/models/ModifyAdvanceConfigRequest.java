// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigRequest extends TeaModel {
    /**
     * <p>The content of the advanced configuration that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The type of the configuration content. Valid values: FILE, GIT, HTTP, and ODPS.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The description of the advanced configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>The files.</p>
     */
    @NameInMap("files")
    public java.util.List<ModifyAdvanceConfigRequestFiles> files;

    /**
     * <p>The name of the advanced configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-zvp2qr1sk01_qrs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status of the advanced configuration. Valid values: drafting: The advanced configuration is in the draft state. used: The advanced configuration is being used. unused: The advanced configuration is not used. trash: The advanced configuration is being deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>used</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the advanced configuration was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-02-27T07:50:55Z</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static ModifyAdvanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigRequest self = new ModifyAdvanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyAdvanceConfigRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ModifyAdvanceConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ModifyAdvanceConfigRequest setFiles(java.util.List<ModifyAdvanceConfigRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ModifyAdvanceConfigRequestFiles> getFiles() {
        return this.files;
    }

    public ModifyAdvanceConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAdvanceConfigRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyAdvanceConfigRequest setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class ModifyAdvanceConfigRequestFiles extends TeaModel {
        /**
         * <p>The full path of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>/cluster.json</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Specifies whether the file is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Specifies whether the file is a template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        public static ModifyAdvanceConfigRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            ModifyAdvanceConfigRequestFiles self = new ModifyAdvanceConfigRequestFiles();
            return TeaModel.build(map, self);
        }

        public ModifyAdvanceConfigRequestFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public ModifyAdvanceConfigRequestFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ModifyAdvanceConfigRequestFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ModifyAdvanceConfigRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
