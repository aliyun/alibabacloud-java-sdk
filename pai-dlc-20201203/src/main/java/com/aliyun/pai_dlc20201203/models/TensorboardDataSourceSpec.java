// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class TensorboardDataSourceSpec extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DirectoryName")
    public String directoryName;

    @NameInMap("FullSummaryPath")
    public String fullSummaryPath;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SummaryPath")
    public String summaryPath;

    @NameInMap("Uri")
    public String uri;

    public static TensorboardDataSourceSpec build(java.util.Map<String, ?> map) throws Exception {
        TensorboardDataSourceSpec self = new TensorboardDataSourceSpec();
        return TeaModel.build(map, self);
    }

    public TensorboardDataSourceSpec setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public TensorboardDataSourceSpec setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public TensorboardDataSourceSpec setFullSummaryPath(String fullSummaryPath) {
        this.fullSummaryPath = fullSummaryPath;
        return this;
    }
    public String getFullSummaryPath() {
        return this.fullSummaryPath;
    }

    public TensorboardDataSourceSpec setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TensorboardDataSourceSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TensorboardDataSourceSpec setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public TensorboardDataSourceSpec setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

    public TensorboardDataSourceSpec setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
