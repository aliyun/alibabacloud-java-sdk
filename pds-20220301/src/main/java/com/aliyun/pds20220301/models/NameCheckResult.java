// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class NameCheckResult extends TeaModel {
    @NameInMap("exist_file_id")
    public String existFileId;

    @NameInMap("exist_file_type")
    public String existFileType;

    public static NameCheckResult build(java.util.Map<String, ?> map) throws Exception {
        NameCheckResult self = new NameCheckResult();
        return TeaModel.build(map, self);
    }

    public NameCheckResult setExistFileId(String existFileId) {
        this.existFileId = existFileId;
        return this;
    }
    public String getExistFileId() {
        return this.existFileId;
    }

    public NameCheckResult setExistFileType(String existFileType) {
        this.existFileType = existFileType;
        return this;
    }
    public String getExistFileType() {
        return this.existFileType;
    }

}
