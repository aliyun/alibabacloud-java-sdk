// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveFileRequest extends TeaModel {
    @NameInMap("ParamFile")
    public String paramFile;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    public static SaveFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveFileRequest self = new SaveFileRequest();
        return TeaModel.build(map, self);
    }

}
