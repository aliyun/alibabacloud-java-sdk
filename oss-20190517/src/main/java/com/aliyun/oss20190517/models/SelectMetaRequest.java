// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectMetaRequest extends TeaModel {
    @NameInMap("InputSerialization")
    public InputSerialization inputSerialization;

    // description
    @NameInMap("OverwriteIfExists")
    public Boolean overwriteIfExists;

    public static SelectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectMetaRequest self = new SelectMetaRequest();
        return TeaModel.build(map, self);
    }

    public SelectMetaRequest setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
        return this;
    }
    public InputSerialization getInputSerialization() {
        return this.inputSerialization;
    }

    public SelectMetaRequest setOverwriteIfExists(Boolean overwriteIfExists) {
        this.overwriteIfExists = overwriteIfExists;
        return this;
    }
    public Boolean getOverwriteIfExists() {
        return this.overwriteIfExists;
    }

}
