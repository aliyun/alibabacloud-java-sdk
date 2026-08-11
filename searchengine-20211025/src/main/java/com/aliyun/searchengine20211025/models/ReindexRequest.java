// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ReindexRequest extends TeaModel {
    /**
     * <p>The timestamp in seconds. This parameter is of the INT type. This parameter is required when the data source uses API push.</p>
     * 
     * <strong>example:</strong>
     * <p>1640867288</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The OSS file path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://opensearch</p>
     */
    @NameInMap("ossDataPath")
    public String ossDataPath;

    /**
     * <p>The partition. This parameter is required when the data source is MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20220713</p>
     */
    @NameInMap("partition")
    public String partition;

    public static ReindexRequest build(java.util.Map<String, ?> map) throws Exception {
        ReindexRequest self = new ReindexRequest();
        return TeaModel.build(map, self);
    }

    public ReindexRequest setDataTimeSec(Integer dataTimeSec) {
        this.dataTimeSec = dataTimeSec;
        return this;
    }
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    public ReindexRequest setOssDataPath(String ossDataPath) {
        this.ossDataPath = ossDataPath;
        return this;
    }
    public String getOssDataPath() {
        return this.ossDataPath;
    }

    public ReindexRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
