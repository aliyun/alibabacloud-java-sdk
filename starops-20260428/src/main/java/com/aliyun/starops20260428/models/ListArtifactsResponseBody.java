// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListArtifactsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;path&quot;:&quot;reports/summary.pdf&quot;,&quot;size&quot;:1024,&quot;lastModified&quot;:&quot;2026-05-25T08:00:00Z&quot;,&quot;isDirectory&quot;:false}]</p>
     */
    @NameInMap("artifacts")
    public java.util.List<ListArtifactsResponseBodyArtifacts> artifacts;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsResponseBody self = new ListArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactsResponseBody setArtifacts(java.util.List<ListArtifactsResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<ListArtifactsResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public ListArtifactsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListArtifactsResponseBodyArtifacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDirectory")
        public Boolean isDirectory;

        /**
         * <strong>example:</strong>
         * <p>2026-04-30T16:03:54Z</p>
         */
        @NameInMap("lastModified")
        public String lastModified;

        /**
         * <strong>example:</strong>
         * <p>missions/mission-xxx/artifacts/2026-05/05-01/xxxx.md</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>21950</p>
         */
        @NameInMap("size")
        public Long size;

        public static ListArtifactsResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsResponseBodyArtifacts self = new ListArtifactsResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public ListArtifactsResponseBodyArtifacts setIsDirectory(Boolean isDirectory) {
            this.isDirectory = isDirectory;
            return this;
        }
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        public ListArtifactsResponseBodyArtifacts setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListArtifactsResponseBodyArtifacts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListArtifactsResponseBodyArtifacts setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
