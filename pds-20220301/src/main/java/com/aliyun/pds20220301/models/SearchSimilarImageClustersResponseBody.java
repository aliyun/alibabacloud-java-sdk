// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchSimilarImageClustersResponseBody extends TeaModel {
    @NameInMap("next_marker")
    public String nextMarker;

    @NameInMap("similar_image_clusters")
    public java.util.List<SearchSimilarImageClustersResponseBodySimilarImageClusters> similarImageClusters;

    public static SearchSimilarImageClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarImageClustersResponseBody self = new SearchSimilarImageClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSimilarImageClustersResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public SearchSimilarImageClustersResponseBody setSimilarImageClusters(java.util.List<SearchSimilarImageClustersResponseBodySimilarImageClusters> similarImageClusters) {
        this.similarImageClusters = similarImageClusters;
        return this;
    }
    public java.util.List<SearchSimilarImageClustersResponseBodySimilarImageClusters> getSimilarImageClusters() {
        return this.similarImageClusters;
    }

    public static class SearchSimilarImageClustersResponseBodySimilarImageClusters extends TeaModel {
        @NameInMap("files")
        public java.util.List<File> files;

        public static SearchSimilarImageClustersResponseBodySimilarImageClusters build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarImageClustersResponseBodySimilarImageClusters self = new SearchSimilarImageClustersResponseBodySimilarImageClusters();
            return TeaModel.build(map, self);
        }

        public SearchSimilarImageClustersResponseBodySimilarImageClusters setFiles(java.util.List<File> files) {
            this.files = files;
            return this;
        }
        public java.util.List<File> getFiles() {
            return this.files;
        }

    }

}
