// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteTrainingJobLabelsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RootModelID</p>
     */
    @NameInMap("Keys")
    public String keys;

    public static DeleteTrainingJobLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainingJobLabelsRequest self = new DeleteTrainingJobLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrainingJobLabelsRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

}
