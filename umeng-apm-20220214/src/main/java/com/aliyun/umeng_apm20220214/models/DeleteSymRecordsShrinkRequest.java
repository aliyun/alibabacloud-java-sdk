// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class DeleteSymRecordsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("appVersions")
    public String appVersionsShrink;

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

    public static DeleteSymRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSymRecordsShrinkRequest self = new DeleteSymRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSymRecordsShrinkRequest setAppVersionsShrink(String appVersionsShrink) {
        this.appVersionsShrink = appVersionsShrink;
        return this;
    }
    public String getAppVersionsShrink() {
        return this.appVersionsShrink;
    }

    public DeleteSymRecordsShrinkRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteSymRecordsShrinkRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

}
