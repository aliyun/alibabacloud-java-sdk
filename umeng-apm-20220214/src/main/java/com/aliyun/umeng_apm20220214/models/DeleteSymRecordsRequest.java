// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class DeleteSymRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("appVersions")
    public java.util.List<String> appVersions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileType")
    public Integer fileType;

    public static DeleteSymRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSymRecordsRequest self = new DeleteSymRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSymRecordsRequest setAppVersions(java.util.List<String> appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public java.util.List<String> getAppVersions() {
        return this.appVersions;
    }

    public DeleteSymRecordsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteSymRecordsRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

}
