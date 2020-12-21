// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileRetentionDays")
    public Integer fileRetentionDays;

    public static AddDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceRequest self = new AddDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public AddDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AddDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddDataSourceRequest setFileRetentionDays(Integer fileRetentionDays) {
        this.fileRetentionDays = fileRetentionDays;
        return this;
    }
    public Integer getFileRetentionDays() {
        return this.fileRetentionDays;
    }

}
