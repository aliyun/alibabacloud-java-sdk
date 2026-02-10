// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class TensorboardDataSourceSpec extends TeaModel {
    /**
     * <p>The file type that corresponds to the URI in the dataset configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The directory prefix of the dataset in the TensorBoard task.</p>
     * 
     * <strong>example:</strong>
     * <p>dlcJobName</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The full summary path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://xxxxx/tensorboard/run1</p>
     */
    @NameInMap("FullSummaryPath")
    public String fullSummaryPath;

    /**
     * <p>The ID of the dataset configurations. In most cases, the ID of the dataset configurations is the ID of a dataset or task.</p>
     * 
     * <strong>example:</strong>
     * <p>d-vf2fdhxxxxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the dataset configurations. In most cases, the name of the dataset configurations is the name of a dataset or task.</p>
     * 
     * <strong>example:</strong>
     * <p>dlcJobName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The dataset type.</p>
     * <ul>
     * <li>datasource: configure a dataset based on the dataset type.</li>
     * <li>dlcjob: configure a dataset based on the task type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>datasource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The summary path.</p>
     * 
     * <strong>example:</strong>
     * <p>/tensorboard/run1</p>
     */
    @NameInMap("SummaryPath")
    public String summaryPath;

    /**
     * <p>The file system URI in the dataset configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://.oss-cn-shanghai-finance-1.aliyuncs.com/</p>
     */
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
