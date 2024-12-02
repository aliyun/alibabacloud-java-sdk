// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class AnalyzeGitRepositoryResponseBody extends TeaModel {
    @NameInMap("AnalysisResults")
    public java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResults> analysisResults;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("RequestId")
    public String requestId;

    public static AnalyzeGitRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeGitRepositoryResponseBody self = new AnalyzeGitRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeGitRepositoryResponseBody setAnalysisResults(java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResults> analysisResults) {
        this.analysisResults = analysisResults;
        return this;
    }
    public java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResults> getAnalysisResults() {
        return this.analysisResults;
    }

    public AnalyzeGitRepositoryResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AnalyzeGitRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles extends TeaModel {
        @NameInMap("FileType")
        public String fileType;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        public static AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles self = new AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles();
            return TeaModel.build(map, self);
        }

        public AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

    }

    public static class AnalyzeGitRepositoryResponseBodyAnalysisResults extends TeaModel {
        @NameInMap("BuildFiles")
        public java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles> buildFiles;

        @NameInMap("BuildType")
        public String buildType;

        public static AnalyzeGitRepositoryResponseBodyAnalysisResults build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeGitRepositoryResponseBodyAnalysisResults self = new AnalyzeGitRepositoryResponseBodyAnalysisResults();
            return TeaModel.build(map, self);
        }

        public AnalyzeGitRepositoryResponseBodyAnalysisResults setBuildFiles(java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles> buildFiles) {
            this.buildFiles = buildFiles;
            return this;
        }
        public java.util.List<AnalyzeGitRepositoryResponseBodyAnalysisResultsBuildFiles> getBuildFiles() {
            return this.buildFiles;
        }

        public AnalyzeGitRepositoryResponseBodyAnalysisResults setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

    }

}
