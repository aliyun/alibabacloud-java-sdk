// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetIndexVersionResponseBodyResult result;

    public static GetIndexVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexVersionResponseBody self = new GetIndexVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexVersionResponseBody setResult(GetIndexVersionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIndexVersionResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetIndexVersionResponseBodyResultIndexVersions extends TeaModel {
        @NameInMap("buildDeployId")
        public String buildDeployId;

        @NameInMap("currentVersion")
        public Long currentVersion;

        @NameInMap("indexName")
        public String indexName;

        @NameInMap("versions")
        public java.util.List<Long> versions;

        public static GetIndexVersionResponseBodyResultIndexVersions build(java.util.Map<String, ?> map) throws Exception {
            GetIndexVersionResponseBodyResultIndexVersions self = new GetIndexVersionResponseBodyResultIndexVersions();
            return TeaModel.build(map, self);
        }

        public GetIndexVersionResponseBodyResultIndexVersions setBuildDeployId(String buildDeployId) {
            this.buildDeployId = buildDeployId;
            return this;
        }
        public String getBuildDeployId() {
            return this.buildDeployId;
        }

        public GetIndexVersionResponseBodyResultIndexVersions setCurrentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        public GetIndexVersionResponseBodyResultIndexVersions setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetIndexVersionResponseBodyResultIndexVersions setVersions(java.util.List<Long> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<Long> getVersions() {
            return this.versions;
        }

    }

    public static class GetIndexVersionResponseBodyResult extends TeaModel {
        @NameInMap("cluster")
        public String cluster;

        @NameInMap("indexVersions")
        public java.util.List<GetIndexVersionResponseBodyResultIndexVersions> indexVersions;

        public static GetIndexVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetIndexVersionResponseBodyResult self = new GetIndexVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetIndexVersionResponseBodyResult setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetIndexVersionResponseBodyResult setIndexVersions(java.util.List<GetIndexVersionResponseBodyResultIndexVersions> indexVersions) {
            this.indexVersions = indexVersions;
            return this;
        }
        public java.util.List<GetIndexVersionResponseBodyResultIndexVersions> getIndexVersions() {
            return this.indexVersions;
        }

    }

}
