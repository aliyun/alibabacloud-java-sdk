// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("result")
    public GetAdvanceConfigResponseBodyResult result;

    public static GetAdvanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigResponseBody self = new GetAdvanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvanceConfigResponseBody setResult(GetAdvanceConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAdvanceConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAdvanceConfigResponseBodyResultFiles extends TeaModel {
        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether the file is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether the file is a container.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01_qrs</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAdvanceConfigResponseBodyResultFiles build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigResponseBodyResultFiles self = new GetAdvanceConfigResponseBodyResultFiles();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigResponseBodyResultFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public GetAdvanceConfigResponseBodyResultFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public GetAdvanceConfigResponseBodyResultFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetAdvanceConfigResponseBodyResultFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAdvanceConfigResponseBodyResult extends TeaModel {
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
         * <p>The description of the advanced configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>close alarm, chiji id 37080</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The files.</p>
         */
        @NameInMap("files")
        public java.util.List<GetAdvanceConfigResponseBodyResultFiles> files;

        /**
         * <p>The name of the advanced configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2s170b03_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the advanced configuration. Valid values: drafting: The advanced configuration is in the draft state. used: The advanced configuration is being used. unused: The advanced configuration is not used. trash: The advanced configuration is being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0,1,3,6,8</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the advanced configuration was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetAdvanceConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigResponseBodyResult self = new GetAdvanceConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAdvanceConfigResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetAdvanceConfigResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAdvanceConfigResponseBodyResult setFiles(java.util.List<GetAdvanceConfigResponseBodyResultFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GetAdvanceConfigResponseBodyResultFiles> getFiles() {
            return this.files;
        }

        public GetAdvanceConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAdvanceConfigResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAdvanceConfigResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
