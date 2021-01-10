// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveAKSHelmChartPackageTreeRequest extends TeaModel {
    @NameInMap("ChartFiles")
    public java.util.List<SaveAKSHelmChartPackageTreeRequestChartFiles> chartFiles;

    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static SaveAKSHelmChartPackageTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAKSHelmChartPackageTreeRequest self = new SaveAKSHelmChartPackageTreeRequest();
        return TeaModel.build(map, self);
    }

    public SaveAKSHelmChartPackageTreeRequest setChartFiles(java.util.List<SaveAKSHelmChartPackageTreeRequestChartFiles> chartFiles) {
        this.chartFiles = chartFiles;
        return this;
    }
    public java.util.List<SaveAKSHelmChartPackageTreeRequestChartFiles> getChartFiles() {
        return this.chartFiles;
    }

    public SaveAKSHelmChartPackageTreeRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public SaveAKSHelmChartPackageTreeRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public SaveAKSHelmChartPackageTreeRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public SaveAKSHelmChartPackageTreeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class SaveAKSHelmChartPackageTreeRequestChartFiles extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FilePath")
        public String filePath;

        public static SaveAKSHelmChartPackageTreeRequestChartFiles build(java.util.Map<String, ?> map) throws Exception {
            SaveAKSHelmChartPackageTreeRequestChartFiles self = new SaveAKSHelmChartPackageTreeRequestChartFiles();
            return TeaModel.build(map, self);
        }

        public SaveAKSHelmChartPackageTreeRequestChartFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveAKSHelmChartPackageTreeRequestChartFiles setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

    }

}
