// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class DatasetProxyConfig extends TeaModel {
    /**
     * <p>Dataset type. Only LABEL is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>LABEL</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>Dataset source. Only PAI is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PAI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Source dataset ID. For information about how to obtain a dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>214***12514</p>
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
