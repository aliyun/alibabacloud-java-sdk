// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CsiCondition extends TeaModel {
    @NameInMap("file_data_punish")
    public Condition fileDataPunish;

    public static CsiCondition build(java.util.Map<String, ?> map) throws Exception {
        CsiCondition self = new CsiCondition();
        return TeaModel.build(map, self);
    }

    public CsiCondition setFileDataPunish(Condition fileDataPunish) {
        this.fileDataPunish = fileDataPunish;
        return this;
    }
    public Condition getFileDataPunish() {
        return this.fileDataPunish;
    }

}
