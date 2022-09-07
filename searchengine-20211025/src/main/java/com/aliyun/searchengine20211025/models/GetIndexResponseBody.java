// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetIndexResponseBodyResult result;

    public static GetIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexResponseBody self = new GetIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexResponseBody setResult(GetIndexResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIndexResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetIndexResponseBodyResultVersionsFiles extends TeaModel {
        @NameInMap("fullPathName")
        public String fullPathName;

        @NameInMap("isDir")
        public Boolean isDir;

        @NameInMap("isTemplate")
        public Boolean isTemplate;

        @NameInMap("name")
        public String name;

        public static GetIndexResponseBodyResultVersionsFiles build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultVersionsFiles self = new GetIndexResponseBodyResultVersionsFiles();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultVersionsFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public GetIndexResponseBodyResultVersionsFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public GetIndexResponseBodyResultVersionsFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetIndexResponseBodyResultVersionsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetIndexResponseBodyResultVersions extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("files")
        public java.util.List<GetIndexResponseBodyResultVersionsFiles> files;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("updateTime")
        public Long updateTime;

        @NameInMap("versionId")
        public Integer versionId;

        public static GetIndexResponseBodyResultVersions build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultVersions self = new GetIndexResponseBodyResultVersions();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultVersions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetIndexResponseBodyResultVersions setFiles(java.util.List<GetIndexResponseBodyResultVersionsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GetIndexResponseBodyResultVersionsFiles> getFiles() {
            return this.files;
        }

        public GetIndexResponseBodyResultVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIndexResponseBodyResultVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIndexResponseBodyResultVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetIndexResponseBodyResultVersions setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

    public static class GetIndexResponseBodyResult extends TeaModel {
        @NameInMap("dataSource")
        public String dataSource;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexStatus")
        public String indexStatus;

        @NameInMap("name")
        public String name;

        @NameInMap("versions")
        public java.util.List<GetIndexResponseBodyResultVersions> versions;

        public static GetIndexResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResult self = new GetIndexResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResult setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetIndexResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetIndexResponseBodyResult setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public GetIndexResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIndexResponseBodyResult setVersions(java.util.List<GetIndexResponseBodyResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetIndexResponseBodyResultVersions> getVersions() {
            return this.versions;
        }

    }

}
