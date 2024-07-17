// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FB0325E-8C37-5525-96AC-0333523170A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The advanced configurations.</p>
     */
    @NameInMap("result")
    public java.util.List<ListAdvanceConfigsResponseBodyResult> result;

    public static ListAdvanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigsResponseBody self = new ListAdvanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdvanceConfigsResponseBody setResult(java.util.List<ListAdvanceConfigsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAdvanceConfigsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAdvanceConfigsResponseBodyResultFiles extends TeaModel {
        /**
         * <p>The absolute path in which the file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>/path/wpd/nae</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether the file is a directory. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether the file is a template. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>file_name_1</p>
         */
        @NameInMap("name")
        public String name;

        public static ListAdvanceConfigsResponseBodyResultFiles build(java.util.Map<String, ?> map) throws Exception {
            ListAdvanceConfigsResponseBodyResultFiles self = new ListAdvanceConfigsResponseBodyResultFiles();
            return TeaModel.build(map, self);
        }

        public ListAdvanceConfigsResponseBodyResultFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListAdvanceConfigsResponseBodyResultFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAdvanceConfigsResponseBodyResult extends TeaModel {
        /**
         * <ul>
         * <li>The type of the advanced configuration. Valid values: -ONLINE: online configuration</li>
         * <li>\-ONLINE_CAVA: online Cava configuration</li>
         * <li>\-ONLINE_PLUGIN: online plug-in configuration</li>
         * <li>\-ONLINE_QUERY: query configuration</li>
         * <li>\-OFFLINE_DICT: offline dictionary configuration</li>
         * <li>\-OFFLINE_TABLE: offline table configuration</li>
         * <li>\-OFFLINE_COMMON: offline configuration</li>
         * <li>\-OFFLINE_PLUGIN: offline plug-in configuration</li>
         * <li>\-OFFLINE_INDEX: index configuration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("advanceConfigType")
        public String advanceConfigType;

        /**
         * <p>The content of the advanced configuration that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;url\&quot;:\&quot;<a href="http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar%5C%5C%22%7D">http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar\\&quot;}</a></p>
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
         * <p>The Alibaba Cloud account ID of the user who created the advanced configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("creator")
        public String creator;

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
        public java.util.List<ListAdvanceConfigsResponseBodyResultFiles> files;

        /**
         * <p>The name of the advanced configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>my_index</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the advanced configuration. Valid values: drafting: The advanced configuration is in the draft state. used: The advanced configuration is being used. unused: The advanced configuration is not used. trash: The advanced configuration is being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>drafting</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the advanced configuration was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1631070464000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListAdvanceConfigsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAdvanceConfigsResponseBodyResult self = new ListAdvanceConfigsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAdvanceConfigsResponseBodyResult setAdvanceConfigType(String advanceConfigType) {
            this.advanceConfigType = advanceConfigType;
            return this;
        }
        public String getAdvanceConfigType() {
            return this.advanceConfigType;
        }

        public ListAdvanceConfigsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAdvanceConfigsResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAdvanceConfigsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListAdvanceConfigsResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAdvanceConfigsResponseBodyResult setFiles(java.util.List<ListAdvanceConfigsResponseBodyResultFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListAdvanceConfigsResponseBodyResultFiles> getFiles() {
            return this.files;
        }

        public ListAdvanceConfigsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAdvanceConfigsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAdvanceConfigsResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
