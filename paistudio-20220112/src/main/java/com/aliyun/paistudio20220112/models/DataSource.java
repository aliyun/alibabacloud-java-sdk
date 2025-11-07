// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DataSource extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("MountPath")
    public String mountPath;

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
