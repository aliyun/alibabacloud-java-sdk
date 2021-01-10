// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutReleaseRequest extends TeaModel {
    @NameInMap("EditedKey")
    public String editedKey;

    @NameInMap("ReleaseJsonStr")
    public String releaseJsonStr;

    public static UpdateLinkeBahamutReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutReleaseRequest self = new UpdateLinkeBahamutReleaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutReleaseRequest setEditedKey(String editedKey) {
        this.editedKey = editedKey;
        return this;
    }
    public String getEditedKey() {
        return this.editedKey;
    }

    public UpdateLinkeBahamutReleaseRequest setReleaseJsonStr(String releaseJsonStr) {
        this.releaseJsonStr = releaseJsonStr;
        return this;
    }
    public String getReleaseJsonStr() {
        return this.releaseJsonStr;
    }

}
