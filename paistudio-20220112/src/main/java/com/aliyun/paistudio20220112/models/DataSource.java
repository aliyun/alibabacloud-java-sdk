// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DataSource extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>data-source-1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The mount path of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data/</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The URI of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/model/output/</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DataSource build(java.util.Map<String, ?> map) throws Exception {
        DataSource self = new DataSource();
        return TeaModel.build(map, self);
    }

    public DataSource setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DataSource setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public DataSource setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
