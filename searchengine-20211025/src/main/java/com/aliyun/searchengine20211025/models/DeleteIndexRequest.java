// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteIndexRequest extends TeaModel {
    @NameInMap("dataSource")
    public String dataSource;

    @NameInMap("deleteDataSource")
    public Boolean deleteDataSource;

    public static DeleteIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexRequest self = new DeleteIndexRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public DeleteIndexRequest setDeleteDataSource(Boolean deleteDataSource) {
        this.deleteDataSource = deleteDataSource;
        return this;
    }
    public Boolean getDeleteDataSource() {
        return this.deleteDataSource;
    }

}
