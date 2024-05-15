// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class DatasetProxyConfig extends TeaModel {
    @NameInMap("DatasetType")
    public String datasetType;

    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    public static DatasetProxyConfig build(java.util.Map<String, ?> map) throws Exception {
        DatasetProxyConfig self = new DatasetProxyConfig();
        return TeaModel.build(map, self);
    }

    public DatasetProxyConfig setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public DatasetProxyConfig setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DatasetProxyConfig setSourceDatasetId(String sourceDatasetId) {
        this.sourceDatasetId = sourceDatasetId;
        return this;
    }
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

}
