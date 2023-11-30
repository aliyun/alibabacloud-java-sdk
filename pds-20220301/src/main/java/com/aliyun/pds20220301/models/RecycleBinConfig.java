// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RecycleBinConfig extends TeaModel {
    @NameInMap("auto_delete_enabled")
    public Boolean autoDeleteEnabled;

    @NameInMap("auto_delete_keep_second")
    public Integer autoDeleteKeepSecond;

    @NameInMap("delete_trash_normal_file_disabled")
    public Boolean deleteTrashNormalFileDisabled;

    public static RecycleBinConfig build(java.util.Map<String, ?> map) throws Exception {
        RecycleBinConfig self = new RecycleBinConfig();
        return TeaModel.build(map, self);
    }

    public RecycleBinConfig setAutoDeleteEnabled(Boolean autoDeleteEnabled) {
        this.autoDeleteEnabled = autoDeleteEnabled;
        return this;
    }
    public Boolean getAutoDeleteEnabled() {
        return this.autoDeleteEnabled;
    }

    public RecycleBinConfig setAutoDeleteKeepSecond(Integer autoDeleteKeepSecond) {
        this.autoDeleteKeepSecond = autoDeleteKeepSecond;
        return this;
    }
    public Integer getAutoDeleteKeepSecond() {
        return this.autoDeleteKeepSecond;
    }

    public RecycleBinConfig setDeleteTrashNormalFileDisabled(Boolean deleteTrashNormalFileDisabled) {
        this.deleteTrashNormalFileDisabled = deleteTrashNormalFileDisabled;
        return this;
    }
    public Boolean getDeleteTrashNormalFileDisabled() {
        return this.deleteTrashNormalFileDisabled;
    }

}
